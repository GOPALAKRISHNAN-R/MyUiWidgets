package com.example.myuiwidgets.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import com.example.myuiwidgets.R


class SeekBarActivity : AppCompatActivity() {

    lateinit var slider : SeekBar
    lateinit var value : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        slider = findViewById<SeekBar>(R.id.sb_slider)
        value = findViewById<TextView>(R.id.tv_result)

        slider.max = 50 //Default is 100

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = "Seeking to : $progress"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                value.text = "started at : " + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                value.text = "selected : " + seekBar.progress
            }
        })

    }
}
