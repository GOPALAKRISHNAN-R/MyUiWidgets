package com.example.myuiwidgets.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myuiwidgets.R
import android.widget.*

class FormActivity : AppCompatActivity() {

    lateinit var rg_gender : RadioGroup
    lateinit var rb_male : RadioButton
    lateinit var rb_female : RadioButton

    lateinit var cb_english : CheckBox
    lateinit var cb_hindi : CheckBox
    lateinit var cb_tamil : CheckBox

    lateinit var btn_submit : Button
    lateinit var tv_answer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        rg_gender = findViewById<RadioGroup>(R.id.rg_gender)
        rb_male = findViewById<RadioButton>(R.id.rb_male)
        rb_female = findViewById<RadioButton>(R.id.rb_female)

        cb_english = findViewById<CheckBox>(R.id.cb_english)
        cb_hindi = findViewById<CheckBox>(R.id.cb_hindi)
        cb_tamil = findViewById<CheckBox>(R.id.cb_tamil)

        btn_submit = findViewById<Button>(R.id.btn_submit)
        tv_answer = findViewById<TextView>(R.id.tv_answer)

        btn_submit.setOnClickListener(View.OnClickListener {
            var result = ""
            if(rg_gender.checkedRadioButtonId != -1){
                result +="Selected gender : "
                if(rb_male.isChecked)
                    result += "male\n"
                else if(rb_female.isChecked)
                    result += "female\n"
            }
            result += "Languages Known : "

            if(cb_english.isChecked)
                result += "English,"
            if(cb_hindi.isChecked)
                result += "Hindi,"
            if(cb_tamil.isChecked)
                result += "Tamil"

            tv_answer.text = result

        })

    }
}
