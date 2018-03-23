package com.sc.dagger2demo.base

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * 创建时间：2018/3/23
 * 创建人：lxt
 * 功能描述：
 */
open class BaseActivity : AppCompatActivity() {

    fun Context.show(msg: String) {
        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
    }
}