package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 下午2:14
 * 描述:     primary secondary  的关系
 */

class Person constructor(username:String) {
    private var username:String
    private var age:Int
    private var address:String

    init {
        println(username)

        this.username = username
        this.age = 20
        this.address="shenzhen"

    }


    constructor(username:String , age:Int) : this(username) {
        this.age = age
    }

    constructor(username:String , age:Int , address:String) : this(username,age){
        this.address = address;
    }


    fun printInfo(): Unit {
        println("this.username = ${username} , this.age = ${age} , this.address = ${address}")
    }

}


fun main(args: Array<String>) {

    var person = Person("zhangshan")
    var person2 = Person("username" , 30)
    var person3 = Person("username" , 50,"beijing")


    person.printInfo()
    person2.printInfo()
    person3.printInfo()


}