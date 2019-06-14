package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/14 上午9:34
 * 描述:     接口 ， super<x>语法，里面可以指定调用哪个接口或者父类
 */

interface IHello {

    fun methodA(): Unit {
        println("A")
    }

}


open class B {

    open fun methodA(){
        println(" B method A")
    }

}


class C: IHello ,B(){

    override fun methodA() {

        super<IHello>.methodA()

        super<B>.methodA()

        println(" C ")

    }

}


fun main(args: Array<String>) {

    var c = C()
    c.methodA()

}