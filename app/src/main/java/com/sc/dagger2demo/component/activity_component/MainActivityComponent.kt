package com.sc.dagger2demo.component.activity_component

import com.sc.dagger2demo.module.MainActivityModule
import com.sc.dagger2demo.view.MainActivity
import dagger.Component

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
@Component(modules = arrayOf(MainActivityModule::class))
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)
}