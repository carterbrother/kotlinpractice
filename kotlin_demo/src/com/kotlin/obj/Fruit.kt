package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 下午3:47
 * 描述:     方法重写
 */

open class Fruit {

    // open表示方法会被重写
    open fun name(){
        println("fruit")
    }

    //默认是可以继承的
    fun expirationDate(): Unit {
        println("1 month")
    }

}

class Apple : Fruit(){

    override fun name(): Unit {
        println("apple")
    }



}


open class  Orange : Fruit(){
    final override fun name() {
        println("orange")
    }
}

//class OrangeChild:Orange(){
//
//    override fun name(){
//
//    }
//
//
//}




fun main(args: Array<String>) {
    var apple = Apple();
    apple.name()



    apple.expirationDate()






}