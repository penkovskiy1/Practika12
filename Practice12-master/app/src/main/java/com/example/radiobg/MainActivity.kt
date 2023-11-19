package com.example.radiobg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click(view: View){
        val rbtn1: RadioButton = findViewById(R.id.radioButton1)
        val rbtn2: RadioButton = findViewById(R.id.radioButton2)
        val rbtn3: RadioButton = findViewById(R.id.radioButton3)
        val chbx: CheckBox = findViewById(R.id.checkBox)
        val chbx2: CheckBox = findViewById(R.id.checkBox2)
        val chbx3: CheckBox = findViewById(R.id.checkBox3)
        val imgv: ImageView = findViewById(R.id.imageView)
        val imgv2: ImageView = findViewById(R.id.imageView2)
        val imgv3: ImageView = findViewById(R.id.imageView3)
        val imgv4: ImageView = findViewById(R.id.imageView4)

            if (rbtn1.isChecked == true) imgv.setImageResource(R.drawable.apple)
        else if (rbtn2.isChecked == true) imgv.setImageResource(R.drawable.pear)
        else imgv.setImageResource(R.drawable.grape)

        if (chbx.isChecked == true) imgv2.visibility = View.VISIBLE
        else imgv2.visibility = View.INVISIBLE
        if (chbx2.isChecked == true) imgv3.visibility = View.VISIBLE
        else imgv3.visibility = View.INVISIBLE
        if (chbx3.isChecked == true) imgv4.visibility = View.VISIBLE
        else imgv4.visibility = View.INVISIBLE
    }
}