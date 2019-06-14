package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/14 上午10:07
 * 描述:     伴生对象
 */

class MyTest {


    companion object MyObject{

        var a: Int =100

        @JvmStatic
        fun mehtod(): Unit {
            println("method invoke")
        }
    }
}

class D{

    companion object {
        @JvmStatic
        fun foo(){

        }

        fun bar(){

        }
    }

}

/**
 * 使用伴生对象
 */
fun main(args: Array<String>) {

//    MyTest.Companion.mehtod()

    println("=== 使用类似于静态方法 ，而kotlin中是没有静态方法的，使用伴生对象实现")
    MyTest.mehtod()
    println(MyTest.a)

    println("===")

    println(MyTest.MyObject.javaClass)

    println("===")
    D.foo()

    D.bar()

    D.Companion.foo()
    D.Companion.bar()

}

