package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 下午3:36
 * 描述:     继承
 */

open class Parent constructor(name:String , age:Int)

class  Child constructor(name:String , age:Int): Parent(name,age)

open class Parent2(name:String)
//如果一个类没有primary构造函数，还需要继承其它的类，
// 那么该类的secondary构造方法 通过super来初始化父类型
//不同的secondary构造方法，可以调用不同的构造方法

class Child2 : Parent2{

    constructor(name:String): super(name){

    }

}

fun main(args: Array<String>) {
    var child3 = Child2("zhangahsn")


}