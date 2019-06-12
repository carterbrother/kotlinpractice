package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 上午11:00
 * 描述:     Kotlin的类
 * constructor 就是primary构造方法，是类头的一部分，位于类名的后面
 * 如果primary没有任何注解和可见性修饰，可省略；
 * 当不满足上面条件，则不能省略；
 */

class HelloClass constructor(username:String){
    //属性可以直接获取 构造函数中的参数
    private val username : String  = username.toUpperCase();

    //初始化代码块，可以直接使用 构造函数中的参数
    init {
        println(username)
    }

}

fun main(args: Array<String>) {
    val  helloClass = HelloClass("zhangshan")


}