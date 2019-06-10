package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/10 上午10:39
 * 描述:     数组遍历方式
 */

fun main(args: Array<String>) {
//    var array: IntArray = intArrayOf(1,2,4,5,6)
    var array = intArrayOf(1,2,4,5,6)

    println("===遍历数组的方式1")
    for (item in array){
        println(item)
    }


    println("===遍历数组的方式2")
    for (i:Int in array.indices){
        println("array[${i}] = ${array[i]}")
    }


    println("===遍历数组的方式3")
    for ((index,value) in array.withIndex()){
        println("array[${index}] = ${value}")
    }


}