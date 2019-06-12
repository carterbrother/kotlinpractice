package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 下午4:54
 * 描述:     属性重写
 */
    
open class MyParent{
   open val name :String  = "parent"
}

class MyChild:MyParent(){
    override val name:String ="child"
}

class MyChild2 constructor(override val name:String):MyParent() {
}


open class MyParent3 constructor() {

    open fun  method(){
        println(" my parent 3")
    }


    open val name: String get() = "parent"
}


class  MyChild3 : MyParent3(){

    override fun method() {
        super.method()

        println(" child method")
    }

    override val name: String
        get() = super.name + " and child"


}


fun main(args: Array<String>) {

    var myChild = MyChild();

    println(myChild.name)

    println("===")

    var myChild2 = MyChild2("");

    println(myChild2.name)

    println("===")

    var myChild3 = MyChild3()

    myChild3.method()


    println(myChild3.name)

}