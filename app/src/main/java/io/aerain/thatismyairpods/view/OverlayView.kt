package io.aerain.thatismyairpods.view

import android.content.Context
import android.view.LayoutInflater
import android.widget.LinearLayout
import io.aerain.thatismyairpods.R

class OverlayView(context: Context) : LinearLayout(context) {
    init {
        var li = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var v = li.inflate(R.layout.overlay_init, this, false)
        addView(v)
    }
}