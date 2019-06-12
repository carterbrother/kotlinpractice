package com.kotlin.demo

/**
 * 作者:     carter
 * 创建日期:  2019/6/12 上午9:37
 * 描述:     函数式编程
 */

fun main(args: Array<String>) {
    var array = listOf<String>("hello","world","welcome","goodbye")

    println("遍历value")
    for (item in array){
        println(item)
    }

    println("搜索")
    when{
        "world" in array -> println("world in array")
    }

    println("找出长度大于5的元素，并转换成大写字母，然后按照字符串的自然顺序排序，最后输出")

     array.filter{it.length>5}
          .map { it.toUpperCase() }
          .sorted()
          .forEach { println(it) };

}


