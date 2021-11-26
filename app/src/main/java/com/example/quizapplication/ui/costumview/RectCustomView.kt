package com.example.quizapplication.ui.costumview

import android.content.Context
import android.content.res.TypedArray
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat
import com.example.quizapplication.R

class RectCustomView @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet,
    defAttributes: Int = 0
) : View(context, attributes, defAttributes) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
    }
    private val path = Path()

    private var bgRadius = BASE_RADIUS

    init {
        val attributesArray: TypedArray = context.theme.obtainStyledAttributes(
            attributes, R.styleable.RectangleCustomView, defAttributes, 0
        )

        bgRadius = attributesArray.getFloat(R.styleable.RectangleCustomView_background_radius, 1f)
        val color = ContextCompat.getColor(context, R.color.black)
        paint.color =
            attributesArray.getColor(R.styleable.RectangleCustomView_background_color, color)
        attributesArray.recycle()
    }

    private val rectF: RectF
        get() = RectF(
            -bgRadius * RADIUS_MULTIPLIER,
            BASE_RADIUS,
            width.toFloat() + bgRadius * RADIUS_MULTIPLIER,
            height.toFloat() + height / DIVIDED_BY_HALF
        )


    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val customViewSize = measuredHeight.coerceAtLeast(measuredHeight)
        setMeasuredDimension(customViewSize, customViewSize)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (bgRadius == BASE_RADIUS) {
            path.addRect(rectF, Path.Direction.CW)
        } else {
            path.addOval(rectF, Path.Direction.CW)
        }
        canvas?.drawPath(path, paint)
    }

    companion object {
        const val BASE_RADIUS = 0f
        const val RADIUS_MULTIPLIER = 4
        const val DIVIDED_BY_HALF = 2
    }
}