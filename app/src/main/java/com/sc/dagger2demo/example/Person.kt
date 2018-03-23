package com.sc.dagger2demo.example

import javax.inject.Inject

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class Person {

    @Inject
    lateinit var richPerson: RichPerson

//    var richPerson: RichPerson? = null

//    constructor() {
//        richPerson = RichPerson()
//    }

    fun buy() {
        richPerson?.buyEveryThing()
    }
}