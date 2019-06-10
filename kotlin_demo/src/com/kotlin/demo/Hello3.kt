package com.kotlin.demo

//import com.kotlin.demo2.multi
import com.kotlin.demo2.multi as myMulti

/**
 * 作者:     carter
 * 创建日期:  2019/6/8 上午8:20
 * 描述:     TODO
 */

fun main(args: Array<String>) {
    println("===定义常量===")

    val a: Int = 3

//    a=4

    val b=3

    println("===定义变量")


    var c:Int = 20
    c=30

    println(c)


    var d=30

    println(d)


    println("===注释")


    //aaa

    /**
     * aaa+bbb
     */


    /**
     *
     *
     * /**
     * aaa bbbb
     * */
     */


    println("===类型转换")

    var e=100
    var f:Byte = 10

//    e = f

    e = f.toInt()

    println(e)


//    println( multi(100,3))
    println( myMulti(100,3))


    println("======")
    val m = intArrayOf(2,3,4)
//    m= intArrayOf(45,6,7)

    m.set(0,100)
    m.forEach { println(it) }




}