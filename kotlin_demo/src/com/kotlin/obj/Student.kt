package com.kotlin.obj

import java.beans.ConstructorProperties

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 下午2:41
 * 描述:     类的成员变量和属性，放在构造方法中
 */

class Student constructor(private var username:String, private var age:Int, private var address:String) {

    fun printInfo(): Unit {
        println("username: $username , age : $age , address : $address")
    }

}

/**
 * 如果primary构造函数 有注解或者可见性修饰符号 ， 则Constructor 不能省略
 */
class Student2 @ConstructorProperties constructor(username: String){

}


/**
 * 默认参数值，jvm上，如果primary 构造方法所有的参数都有默认值，
 * 编译器还会生成新的不带参数的构造函数，并在该默认构造函数中设置默认值，方便跟其他的框架集成
 */

class Student3 constructor(var username:String = "aaa" , var age: Int =30 ,var  address: String = "shenzhen"){
    fun aaa(): Unit {

        println("username: $username , age : $age , address: $address")
    }
}


fun main(args: Array<String>) {
    var student = Student("zhanghsan",30,"shenzhen")

    student.printInfo()

    println("===")

    var student3 = Student3()

    student3.aaa()

    student3.address = "xxxx"

    println("===")
    student3.aaa()


    println("====")
    student3 = Student3("lisi",55,"guangdong")
    student3.aaa()

}