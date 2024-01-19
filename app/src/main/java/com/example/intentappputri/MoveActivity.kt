package com.example.intentappputri

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MoveActivity : ComponentActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        val btnBack1: Button = findViewById(R.id.btn_back)
        btnBack1.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
           R.id.btn_back -> {
               finish()
           }
        }
    }


}

