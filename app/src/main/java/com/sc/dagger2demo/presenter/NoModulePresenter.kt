package com.sc.dagger2demo.presenter

import android.util.Log
import javax.inject.Inject

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class NoModulePresenter @Inject constructor() {

    fun getData() {
        Log.d("LXT", "noModulePresenter")
    }
}