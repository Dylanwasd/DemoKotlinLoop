package sg.edu.rp.c346.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener {
            for(i in 1..5){
                Log.d("MainActivity for loop", "$i")
            }
            var s = 1
            while(s<6){
                Log.d("MainActivity While loop", "$s")
                s++
            }
        }
        button2.setOnClickListener {
            val word = editText.text.toString()

            for(letter in word){
                Log.d("MainActivity", "$letter")
            }
        }
    }
}
