package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/10 上午10:27
 * 描述:     关键字 Any
 */

fun main(args: Array<String>) {
    println(convert2UpperCase("aaa"))
    println("===")
    println(convert2UpperCase("bbb"))
    println("===")
    println(convert2UpperCase(123))
}

fun convert2UpperCase(str:Any): String? {
    if(str is String){
        //已经帮忙转换为String类型，无需像java一样做类型转换
        return str.toUpperCase()
    }
    return null
}
