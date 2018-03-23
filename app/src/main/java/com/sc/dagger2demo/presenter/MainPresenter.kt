package com.sc.dagger2demo.presenter

import com.sc.dagger2demo.view.MainActivity
import javax.inject.Inject

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class MainPresenter @Inject constructor(private var mainActivity: MainActivity) {

    fun getData(): String {
        return "数据"
    }

    fun letViewShowData() {
        mainActivity.showMsgInPresenter()
    }

}