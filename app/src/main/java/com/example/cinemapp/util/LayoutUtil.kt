package com.example.cinemapp.util

import android.content.Context
import android.view.ViewGroup.LayoutParams
import android.util.TypedValue
import android.view.ViewGroup
import com.example.cinemapp.ui.main.actor_details.CreditsAdapter

fun LayoutParams.setMargin(direction: Direction, dpValue: Float, context: Context) {
    val marginParams = this as ViewGroup.MarginLayoutParams
    val pixelValue = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        dpValue,
        context.resources.displayMetrics
    ).toInt()
    when (direction) {
        Direction.LEFT -> marginParams.leftMargin = pixelValue
        Direction.RIGHT -> marginParams.rightMargin = pixelValue
        Direction.TOP -> marginParams.topMargin = pixelValue
        Direction.BOTTOM -> marginParams.bottomMargin = pixelValue
    }
}


enum class Direction {
    LEFT, RIGHT, TOP, BOTTOM
}