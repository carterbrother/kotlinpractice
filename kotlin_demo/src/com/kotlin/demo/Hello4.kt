package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/10 上午9:22
 * 描述:     TODO
 */

fun main(args: Array<String>) {

    test1()
    test2()
    test3()


}

private fun test1() {
    var x = 100
    var y = 200

    var max: Int

    var min: Int

    if (x > y) {
        max = x
        min = y
    } else {
        max = y
        min = x
    }

    println("max = ${max} min=${min}")
}

fun test2(){

    var x =100
    var y=200
    var max = if (x>y) x else y
    var min = if (x>y) y else x

    println("max =${max} min = ${min}")

}

fun test3(){
    var x =100
    var y=200
    var max = if (x>y){
        println("x > y")
        x
    } else {
        println("x < y")
        y
    }

    var min = if (x>y){
        println("x > y")
        y
    } else {
        println("x < y")
        x
    }


    println("max =${max} min = ${min}")
}