package nareshit.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

/*    fun getText(v:View){
     var et = findViewById<EditText>(R.id.et1)
     var tv = findViewById<TextView>(R.id.tv1)
     tv.setText(et.getText())
    } */
fun getText(v:View){
    tv1.text = et1.text
}
}
