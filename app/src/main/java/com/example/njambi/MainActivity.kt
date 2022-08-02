package com.example.njambi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view: View){
        if(checkBox_Ke.isChecked)textresult.text="Kenya: Yes we speak English"
        if(checkBox_Ug.isChecked)textresult.text="Uganda: Yes we prefer native  "
        if(checkBox_Tz.isChecked)textresult.text="Tanzania:Yes but we prefer Swahilii"
    }
    fun onSelect(view: View){
        if (YES.isChecked)textresult.text="Yes is a certified Developer"
        if (NO.isChecked)textresult.text="No is not a certified Developer"
    }
}