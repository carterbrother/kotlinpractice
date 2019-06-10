package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/10 上午9:29
 * 描述:     TODO
 */

fun main(args: Array<String>) {
    println(convert2Int("23"))
    println("===")
    println(convert2Int("23abc"))
    println("===")
    printMultiply("100","200b")
    println("====")
    printMultiply2("299","399")
}

/**
 * 返回值为Optional类型   x?
 * 不加？ 一定是申明的类型
 */
fun convert2Int(str:String):Int?{
    try {
        return str.toInt();
    }catch (ex: NumberFormatException){
        //
        return null
    }
}

fun printMultiply(a:String , b:String){

   var aInt: Int? = convert2Int(a)
   var bInt: Int? = convert2Int(b)

    if (null!= aInt && null != bInt){
        println(aInt * bInt)
    }else{
        println("param not int")
    }
}

fun printMultiply2(a:String , b:String) {

    var aInt: Int? = convert2Int(a)
    var bInt: Int? = convert2Int(b)

    if (null == aInt) {
        println("param not int")
    } else if (null == bInt) {
        println("param not int")
    } else {
        println(aInt * bInt)
    }
}


