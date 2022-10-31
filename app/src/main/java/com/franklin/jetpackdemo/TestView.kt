package com.franklin.jetpackdemo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * 创建日期：2022/9/23 下午4:23
 * @author Franklin
 * 类说明：
 */
class TestView : View , DefaultLifecycleObserver {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0)
    constructor(context: Context, attributeSet: AttributeSet?, defStyleAttr : Int) : super(context, attributeSet, defStyleAttr) {
        init()
    }

    private fun init() {

    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.d("xlq222","onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.d("xlq222","onCreate")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.d("xlq222","onCreate")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.d("xlq222","onCreate")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        Log.d("xlq222","onCreate")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        Log.d("xlq222","onCreate")
    }

}