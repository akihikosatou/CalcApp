package jp.techacademy.akihiko.satou.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        var num:Float= 0F
        var i1:Float = 0F
        var i2:Float = 0F
        val intent = Intent(this, SecondActivity::class.java)

        if( editText1.text.toString().length == 0){
            i1 = 0F
        }else {
            i1 = editText1.text.toString().toFloat()
        }
        if( editText2.text.toString().length == 0){
            i2 = 0F
        }else {
            i2 = editText2.text.toString().toFloat()
        }

        if (v.id == R.id.button1) {
            num = i1 + i2
            intent.putExtra("VALUE1", num)
        } else if (v.id == R.id.button2) {
            num = i1 - i2
            intent.putExtra("VALUE1", num)
        } else if (v.id == R.id.button3) {
            num = i1 * i2
            intent.putExtra("VALUE1", num)
        } else if (v.id == R.id.button4) {
            num = i1 / i2
            intent.putExtra("VALUE1", num)
        }
        startActivity(intent)
    }
}
