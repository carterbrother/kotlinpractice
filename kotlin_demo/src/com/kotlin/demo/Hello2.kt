package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/8 上午8:07
 * 描述:     TODO
 */

fun main(args: Array<String>) {

    println("===函数的简写，直接一行代码===")
    println(sum1(1,3))
    println(sum2(5,9))

    println("===无返回值函数==")
    noReturnFunction(100,498)
    noReturnFunction2(900,498)
    println("===字符串模板")
    noReturnFunction3(900,498)
}

fun sum1(a:Int, b:Int):Int=a+b
fun sum2(a:Int, b:Int)=a+b

fun noReturnFunction(a:Int,b: Int):Unit{
    println(a+b)
}

fun noReturnFunction2(a:Int,b: Int){
    println(a+b)
}

fun noReturnFunction3(a:Int,b: Int){
    println("$a+$b=${a+b}")
}