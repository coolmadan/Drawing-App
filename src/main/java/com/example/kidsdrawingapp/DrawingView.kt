package com.example.kidsdrawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.nio.file.Path

class DrawingView(context: Context, attrs: AttributeSet): View(context,attrs){
    //We are going to use this Drawing View as a VIEW not an activity
    private var mDrawPath : CustomPath?=null
    private var mCanvasBitmap: Bitmap?=null
    private var mDrawPaint: Paint?=null
    private var mCanvasPaint:Paint?=null
    private var mBrushSize:Float=0.toFloat()
    private var color= Color.BLACK
    private var canvas : Canvas?=null

    init{
        setupDrawing()
    }
    private fun setupDrawing(){
        mDrawPaint=Paint()
        mDrawPath=CustomPath(color,mBrushSize)
        mDrawPaint!!.color=color
        mDrawPaint!!.style=Paint.Style.STROKE
        mDrawPaint!!.strokeJoin=Paint.Join.ROUND
        mDrawPaint!!.strokeCap=Paint.Cap.ROUND
        mCanvasPaint=Paint(Paint.DITHER_FLAG)
        mBrushSize=20.toFloat()
    }
    OnsizeC

    internal inner class CustomPath( var color:Int,var brushThickness:Float) :Path() {

    }
}