package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/10 上午10:50
 * 描述:     when 关键字的用法
 */

fun main(args: Array<String>) {
   println( myPint("hello"))
    println("===")
   println( myPint("fuck"))

    var a=6
    var result = when(a){
        1 ->{
            println("a = 1")
            10
        }
        2 ->{
            println("a = 2 ")
        }
        3,4,5 ->{
            println("a = 3,4,5 ")
            30
        }
        //运算符重写
        in 6..10 ->{
            println( "a is between 6 and 10")
            40
        }
        else -> {
            println("a is other value")
            50
        }
    }

    println(result)

}

fun myPint(str: String): String {
    val s = when (str) {
        "hello" -> return "HELLO"
        "world" -> return "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> return "other input"
    }
    return s
}