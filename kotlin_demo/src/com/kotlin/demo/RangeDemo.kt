package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 上午9:28
 * 描述:     range的使用细节
 */

fun main(args: Array<String>) {

    var a=3 ;
    var b=5;

    if(a in 2..b){
        println(" in the range")
    }

    println("===")

    if (a !in 2..b){
        println(" not in the range")
    }

    println("====")
    for (i in 2..10){
        println(i)
    }

    println("===")

    for ( i in 2.rangeTo(10)){
        println(i)
    }

    println("===")

    for (i in 2..100 step 2){
        println(i)
    }

    println("===")

    for (i in 10 downTo 2 step 3){
        println(i)
    }

}