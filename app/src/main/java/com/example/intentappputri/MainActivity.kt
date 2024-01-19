package com.example.intentappputri

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity2: Button = findViewById<Button>(R.id.btn_move_activity)
        btnMoveActivity2.setOnClickListener(this)

        val btnMoveData: Button = findViewById<Button>(R.id.btn_move_activity_data)
        btnMoveData.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent (this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Wahyu Putri Ika Nurfitrah")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 17)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ADDRESS, "Probolinggo")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_GENDER, "Laki-Laki")


                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "08113600144"
                val dialPhoneIntent = Intent (Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)

            }

        }
    }
}