package com.sc.dagger2demo.module

import com.sc.dagger2demo.view.MainActivity
import dagger.Module
import dagger.Provides

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
@Module
class MainActivityModule(private var mainActivity: MainActivity) {

    @Provides
    fun provideMainActivity(): MainActivity {
        return mainActivity
    }
}