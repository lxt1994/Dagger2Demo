package com.sc.dagger2demo.view

import android.app.Activity
import android.os.Bundle
import com.sc.dagger2demo.presenter.MainPresenter
import com.sc.dagger2demo.R
import com.sc.dagger2demo.base.BaseActivity
import com.sc.dagger2demo.component.activity_component.DaggerMainActivityComponent
import com.sc.dagger2demo.module.MainActivityModule
import com.sc.dagger2demo.presenter.NoModulePresenter
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Presenter不需要持有Activity的时候
//        DaggerMainActivityComponent.builder().build().inject(this)

        //当你需要把自己提供出去的时候，请加一个Module
        DaggerMainActivityComponent.builder()
                .mainActivityModule(MainActivityModule(this))
                .build()
                .inject(this)

        setClick()
    }

    private fun setClick() {
        btnUsePresenter.setOnClickListener {
            show(mainPresenter.getData())
        }

        btnPresenterUseView.setOnClickListener {
            mainPresenter.letViewShowData()
        }
    }

    fun showMsgInPresenter() {
        show("Presenter调用该方法")
    }

}
