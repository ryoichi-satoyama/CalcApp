package jp.techacademy.ryoichi.satoyama.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val result = intent.getDoubleExtra("RESULT",0.0)
        resultTextView.text = result.toString()
    }
}