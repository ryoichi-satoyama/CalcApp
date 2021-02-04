package jp.techacademy.ryoichi.satoyama.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener(this)
        minusButton.setOnClickListener(this)
        timesButton.setOnClickListener(this)
        divButton.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        //空チェック
        if(input1EditText.text.toString().equals("") || input2EditText.text.toString().equals("")) {
            Snackbar.make(v, "Input Error", Snackbar.LENGTH_INDEFINITE)
                    .setAction("Action", null).show()
            return
        }
        
        //各EditTextの入力値
        var input1: Double = input1EditText.text.toString().toDouble()
        var input2: Double = input2EditText.text.toString().toDouble()
        //結果
        var result: Double = 0.0

        //押されたボタンごとの処理
        when(v.id) {
            R.id.plusButton -> result = input1 + input2
            R.id.minusButton -> result = input1 - input2
            R.id.timesButton -> result = input1 * input2
            R.id.divButton -> result = input1 / input2
        }

        //画面遷移
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("RESULT", result)
        startActivity(intent)
    }
}