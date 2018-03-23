package com.sc.dagger2demo.presenter

import com.sc.dagger2demo.view.TraditionActivity

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class TraditionPresenter(private var traditionActivity: TraditionActivity) {

    fun getData(): String {
        return "传统方式"
    }

    fun haveView(){
        traditionActivity.showData()
    }
}