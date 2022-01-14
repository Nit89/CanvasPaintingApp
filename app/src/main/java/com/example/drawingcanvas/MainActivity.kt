package com.example.drawingcanvas

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.drawingcanvas.paintview.Companion.colorList
import com.example.drawingcanvas.paintview.Companion.currentBrush
import com.example.drawingcanvas.paintview.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val redBtn = findViewById<ImageButton>(R.id.redBtn)
        val blueBtn = findViewById<ImageButton>(R.id.blueBtn)
        val blackBtn = findViewById<ImageButton>(R.id.blackBtn)
        val whiteBtn = findViewById<ImageButton>(R.id.whiteBtn)

        redBtn.setOnClickListener {
            Toast.makeText(this, "Red  color selected", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener {
            Toast.makeText(this, " Blue color  selected", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener {
            Toast.makeText(this, "Black color selected ", Toast.LENGTH_SHORT).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }
        whiteBtn.setOnClickListener {
            Toast.makeText(this, "CLEAR SCREEN", Toast.LENGTH_SHORT).show()
           pathList.clear()
            colorList.clear()
            path.reset()
        }


    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}