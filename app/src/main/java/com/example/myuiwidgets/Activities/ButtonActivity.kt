package com.example.myuiwidgets.Activities

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myuiwidgets.Extension.showToast
import com.example.myuiwidgets.R
import kotlinx.android.synthetic.main.activity_button.*

class ButtonActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        btn_click_me.setOnClickListener {
            showToast("Clicked",Toast.LENGTH_SHORT)
        }

        btn_click_me.setOnLongClickListener (View.OnLongClickListener {
            showToast("Button Long Clicked")
            true
        }
        )

    }
}