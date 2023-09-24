package com.knackpark.multiplicationtablekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val display = findViewById<TextView>(R.id.display)
        val input = findViewById<TextView>(R.id.inputField)
        val btn = findViewById<TextView>(R.id.button)



        btn.setOnClickListener{
            if(input.text.toString().isEmpty()){

            }else{
                var str = StringBuffer()
                val x = input.text.toString().toInt()

                for (i in 1..10){
                    var ans = i*x
                    str.append( x.toString()  + "X" + i.toString() +"="+ ans.toString() + "\n\n" )

                }



                display.text = str



            }

        }



    }
}