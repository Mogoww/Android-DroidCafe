package com.example.droidcafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var r1:RadioButton = findViewById(R.id.same_day)
        var r2:RadioButton = findViewById(R.id.next_day)
        var r3:RadioButton = findViewById(R.id.pick_up)
        r1.setOnClickListener{
            Toast.makeText(this@MainActivity, r1.text, Toast.LENGTH_SHORT).show()
        }
        r2.setOnClickListener{
            Toast.makeText(this@MainActivity, r2.text, Toast.LENGTH_SHORT).show()
        }
        r3.setOnClickListener{
            Toast.makeText(this@MainActivity, r3.text, Toast.LENGTH_SHORT).show()
        }

    }
}