package com.sc.dagger2demo.view

import android.content.Intent
import android.os.Bundle
import com.sc.dagger2demo.R
import com.sc.dagger2demo.base.BaseActivity
import com.sc.dagger2demo.component.activity_component.DaggerNoModuleComponent
import com.sc.dagger2demo.presenter.NoModulePresenter
import kotlinx.android.synthetic.main.activity_no_module.*
import javax.inject.Inject

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
class NoModuleActivity : BaseActivity() {

    @Inject
    lateinit var noModulePresenter: NoModulePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_no_module)

        DaggerNoModuleComponent.builder().build().inject(this)
//        DaggerNoModuleComponent.create().inject(this)

        setClick()
    }

    private fun setClick() {
        btnGoToNewActivity.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

        btnUsePresenter.setOnClickListener {
            //点击按钮，调用presenter获取数据
            //那么这里我们需要一个Presenter的对象
            noModulePresenter.getData()
        }
    }
}