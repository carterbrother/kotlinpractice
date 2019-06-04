package com.kotlin.demo

import java.util.function.Consumer

/**
 * 作者:     carter
 * 创建日期:  2019/6/4 上午9:18
 * 描述:     hello world 例子
 */

fun main(args: Array<String>) {
    println("hello world")

    println("======")

    val list : List<String> = listOf("hello","world","hello world")

    for (str in list){
        println(str)
    }

    println("======")
    list.forEach(Consumer {it-> println(it) })
    println("======")

    list.forEach(Consumer { println(it) })

    println("======")

    list.forEach(System.out::println)

}