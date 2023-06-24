package com.example.posapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnSetName: Button
    private lateinit var textView: TextView
    private var countNum: Int = 0
    private var isLimit: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSetName = findViewById(R.id.btnSetName)
        textView = findViewById(R.id.textView)

        textView.text = countNum.toString()

        btnSetName.setOnClickListener{
            if(countNum == 20){ 
                isLimit = true
            }else if(countNum == 0){
                isLimit = false   
            }
            if(!isLimit){
                countNum++ 
            }else{
                countNum--
            }
            textView.text = countNum.toString()
        }
    }
}
