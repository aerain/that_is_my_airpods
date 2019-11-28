package io.aerain.thatismyairpods.view

import android.animation.ObjectAnimator
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import io.aerain.thatismyairpods.R
import kotlinx.android.synthetic.main.overlay_init.view.*



class OverlayView(context: Context) : LinearLayout(context) {

    private var mView: View

    init {
        val li = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        mView = li.inflate(R.layout.overlay_init, this, false)
        initView(mView)
        addView(mView)
        mView.visibility = View.GONE
    }

    private fun initView(view: View) {
        view.overlay_fine_button.setOnClickListener { hide() }
    }

    fun show() {
        val inAnim : Animation = AnimationUtils.loadAnimation(context, R.anim.slide_up)
        mView.visibility = View.VISIBLE
        mView.startAnimation(inAnim)
    }
    fun hide() {
        val outAnim : Animation = AnimationUtils.loadAnimation(context, R.anim.slide_down)
        outAnim.setAnimationListener(object : AnimationListener {
            override fun onAnimationRepeat(p0: Animation?) {}
            override fun onAnimationStart(p0: Animation?) {}
            override fun onAnimationEnd(p0: Animation?) {
                mView.visibility = View.GONE
            }
        })
        mView.startAnimation(outAnim)
//        mView.visibility = View.GONE
    }
}