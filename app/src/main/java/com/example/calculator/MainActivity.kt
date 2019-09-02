package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class calLog (inputStatement: String,newResult:String){
    val statement = inputStatement
    val result = newResult

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val historyList = ArrayList<calLog>()
        fun historyUpdate(input: ArrayList<calLog>): ArrayList<calLog>{
            try {
                textViewStatement0.text = input[input.lastIndex].statement
                textViewResult0.text = input[input.lastIndex].result
                textViewStatement1.text = input[input.lastIndex - 1].statement
                textViewResult1.text = input[input.lastIndex - 1].result
                textViewStatement2.text = input[input.lastIndex - 2].statement
                textViewResult2.text = input[input.lastIndex - 2].result
                textViewStatement3.text = input[input.lastIndex - 3].statement
                textViewResult3.text = input[input.lastIndex - 3].result
                textViewStatement4.text = input[input.lastIndex - 4].statement
                textViewResult4.text = input[input.lastIndex - 4].result
                textViewStatement5.text = input[input.lastIndex - 5].statement
                textViewResult5.text = input[input.lastIndex - 5].result
                textViewStatement6.text = input[input.lastIndex - 6].statement
                textViewResult6.text = input[input.lastIndex - 6].result
                textViewStatement7.text = input[input.lastIndex - 7].statement
                textViewResult7.text = input[input.lastIndex - 7].result

            }
            finally{
                return input
            }

        }

        buttonAdd.setOnClickListener{
            val x = inputX.text.toString().toFloat()
            val y = inputY.text.toString().toFloat()
            val result = x+y
            outputResult.setText(result.toString())
            historyList.add(calLog("$x + $y",result.toString()) )
            historyUpdate(historyList)


        }

        buttonSub.setOnClickListener{
            val x = inputX.text.toString().toFloat()
            val y = inputY.text.toString().toFloat()
            val result = x-y
            outputResult.setText(result.toString())
            historyList.add(calLog("$x - $y",result.toString()) )
            historyUpdate(historyList)

        }

        buttonMul.setOnClickListener{
            val x = inputX.text.toString().toFloat()
            val y = inputY.text.toString().toFloat()
            val result = x*y
            outputResult.setText(result.toString())
            historyList.add(calLog("$x x $y",result.toString()) )
            historyUpdate(historyList)
        }

        buttonDiv.setOnClickListener{
            val x = inputX.text.toString().toFloat()
            val y = inputY.text.toString().toFloat()
            val result = x/y
            outputResult.setText(result.toString())
            historyList.add(calLog("$x ÷ $y",result.toString()) )
            historyUpdate(historyList)
        }

        buttonClear.setOnClickListener{
            inputX.text.clear()
            inputY.text.clear()
            outputResult.text.clear()
        }

        buttonClearHistory.setOnClickListener{
            textViewStatement0.text = ""
            textViewResult0.text = ""
            textViewStatement1.text = ""
            textViewResult1.text = ""
            textViewStatement2.text = ""
            textViewResult2.text = ""
            textViewStatement3.text = ""
            textViewResult3.text = ""
            textViewStatement4.text = ""
            textViewResult4.text = ""
            textViewStatement5.text = ""
            textViewResult5.text = ""
            textViewStatement6.text = ""
            textViewResult6.text = ""
            textViewStatement7.text = ""
            textViewResult7.text = ""
            val historyList = ArrayList<calLog>()
        }
    }

}
