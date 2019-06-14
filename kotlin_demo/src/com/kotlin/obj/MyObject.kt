package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/14 上午10:00
 * 描述:     对象申明,直接调用，无需实例化
 */

object TestObject{

    fun method(): Unit {
        println("method")
    }
}


fun main(args: Array<String>) {
    TestObject.method()
}


