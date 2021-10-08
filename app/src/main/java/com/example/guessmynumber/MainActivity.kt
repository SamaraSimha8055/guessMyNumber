package com.example.guessmynumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var number : Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printTheQuestion()
    }

    fun clickDownwardArrow(view: View){

        when (number) {
            5 -> {
                guessTheNumber(3)
            }
            3 -> {
                guessTheNumber(2)
            }
            2 -> {
                guessTheNumber(1)
            }
            8 -> {
                guessTheNumber(7)
            }
            7 -> {
                guessTheNumber(6)
            }
        }

    }

    fun clickSuccess(view: View){

        question_text_view.visibility = View.INVISIBLE
        result_text_view.visibility = View.VISIBLE
        result_text_view.text = String.format(resources.getString(R.string.str_success),number)

    }

    fun clickUpwardArrow(view: View){

        when (number) {
            3 -> {
                guessTheNumber(4)
            }
            5 -> {
                guessTheNumber(8)
            }
            8 -> {
                guessTheNumber(9)
            }
            9 -> {
                guessTheNumber(10)
            }
        }

    }

    fun clickReset(view: View){

        result_text_view.visibility = View.INVISIBLE
        question_text_view.visibility = View.VISIBLE
        number = 5
        printTheQuestion()

    }

    private fun printTheQuestion(){
        question_text_view.text = String.format(resources.getString(R.string.str_question),number)

    }

    private fun guessTheNumber(myNumber : Int){
        number = myNumber
        printTheQuestion()
    }
}