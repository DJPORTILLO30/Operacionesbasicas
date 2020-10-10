package com.umg.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var numero1 : TextView? = null
    private var numero2 : TextView? = null
    private var res : TextView? = null
    private var sign : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numero1 = findViewById(R.id.n1) as TextView
        numero2 = findViewById(R.id.n2) as TextView
        res = findViewById(R.id.resultado) as TextView
        sign = findViewById(R.id.signo) as TextView

    }

    fun cambiar_signo_mas(view: View){
        sign?.setText("+")
    }

    fun cambiar_signo_menos(view: View){
        sign?.setText("-")
    }

    fun cambiar_signo_por(view: View){
        sign?.setText("*")
    }

    fun cambiar_signo_div(view: View){
        sign?.setText("/")
    }



    fun calcular(view: View){
        val n1 = numero1!!.text.toString().toInt()
        val n2 = numero2!!.text.toString().toInt()
            if(sign!!.text.equals("+")){
                val suma = n1.plus(n2)
                res?.setText("RESULTADO = " + suma.toString())
            }else if(sign!!.text.equals("-")){
                val resta = n1.minus(n2)
                res?.setText("RESULTADO = " + resta.toString())
            }else if(sign!!.text.equals("*")){
                val multi = n1*n2
                res?.setText("RESULTADO = " + multi.toString())
            }else if(sign!!.text.equals("/")){
                val div = n1/n2
                res?.setText("RESULTADO = " + div.toString())
            }else {
                res?.setText("ERROR")
            }
    }
}