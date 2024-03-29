package com.example.myuiwidgets.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myuiwidgets.R

import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class SpinnerActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        option = findViewById<Spinner>(R.id.sp_option)
        result = findViewById<TextView>(R.id.tv_result)

        val options = arrayOf("Option 1", "Option 2","Option 3")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onNothingSelected(parent: AdapterView<*>?) {
                result.text = "Please Select an Option"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                result.text = options.get(position)
            }
        }

    }
}
