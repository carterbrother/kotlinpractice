package com.kotlin.obj

/**
 * 作者:     carter
 * 创建日期:  2019/6/14 上午9:43
 * 描述:     定义抽象类
 */

open class BaseClass {

    open fun mehtod(){

    }

}


abstract class ChildClass : BaseClass(){
    abstract override fun mehtod()
}