package com.sc.dagger2demo.view

import android.content.Intent
import android.os.Bundle
import com.sc.dagger2demo.R
import com.sc.dagger2demo.base.BaseActivity
import com.sc.dagger2demo.presenter.TraditionPresenter
import kotlinx.android.synthetic.main.activity_tradition.*

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class TraditionActivity : BaseActivity() {

    private lateinit var traditionPresenter: TraditionPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tradition)

        traditionPresenter = TraditionPresenter(this)

        setClick()
    }

    private fun setClick() {
        btnTradition.setOnClickListener { show(traditionPresenter.getData()) }

        btnPresenterUseView.setOnClickListener { traditionPresenter.haveView() }

        btnGoToNoModuleActivity.setOnClickListener { startActivity(Intent(this, NoModuleActivity::class.java)) }
    }

    fun showData() {
        show("展示一下")
    }
}