package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//p(printing to the console, using if statements, performing basic calculations)
        Log.d("Main Activity","hi there")
        val time="Morning"
        if (time=="Morning") {
            println("Good Morning")
        }
        else{
            println("Good $time")
        }
        val num1=6
        val num2=9
        var results=num1*num2
        println(results)

//Add some custom functions and call them within the onCreate method


    }
}