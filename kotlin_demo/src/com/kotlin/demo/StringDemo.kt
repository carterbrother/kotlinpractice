package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 上午10:08
 * 描述:     转义字符
 */

fun main(args: Array<String>) {
    var a:String = "hello \n world"

    println(a)

    println("===转义字符")


    var b:String = """
        hello \
        world
        welcome
    """

    println(b)
}