package com.example.micalculadora

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var primers = ""
    private var stri1 = " "
    private var strio = ""
    private var sin1 = ""
    private var lentv = 13
    private var sz1 = 0
    private var num1 = 0.0
    private var num2 = 0.0
    private var res = 0.0
    private var oper = ""
    private var btoper = false
    private var contigual = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun inicial_oper() {
            button_mas.isEnabled = false
            button_menos.isEnabled = false
            button_por.isEnabled = false
            button_dividido.isEnabled = false
            button_igual.isEnabled = false
        }

        inicial_oper()

        fun conti_oper() {

            if (res != 0.0) {
                if (contigual == true) {
                    primers = res.toString()
                    contigual = false
                }
            }

        }

        fun botones() {

            if (btoper == false) {
                contigual = false
                btoper = false
                button_mas.isEnabled = true
                button_menos.isEnabled = true
                button_por.isEnabled = true
                button_dividido.isEnabled = true
                button_igual.isEnabled = false
            }

        }

        button_cero.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "0"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_uno.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "1"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_dos.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "2"
                tv_pantalla.text = primers
            } else {

                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_tres.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "3"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_cuatro.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "4"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_cinco.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "5"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_seis.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "6"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_siete.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "7"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_ocho.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "8"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_nueve.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "9"
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }
        button_punto.setOnClickListener {
            botones()
            if (primers.length <= lentv) {
                primers = primers + "."
                tv_pantalla.text = primers
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }


        ///////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////
        button_mas.setOnClickListener {
            conti_oper()
            btoper = true
            inicial_oper()

            button_igual.isEnabled = true

            if (primers.length <= lentv) {
                num1 = primers.toDouble()
                stri1 = primers
                primers = primers + "+"
                tv_pantalla.text = primers
                oper = "s"
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }

        button_menos.setOnClickListener {
            conti_oper()
            btoper = true
            inicial_oper()

            button_igual.isEnabled = true

            if (primers.length <= lentv) {
                num1 = primers.toDouble()
                stri1 = primers
                primers = primers + "-"
                tv_pantalla.text = primers
                oper = "r"
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }

        button_por.setOnClickListener {
            conti_oper()
            btoper = true
            inicial_oper()

            button_igual.isEnabled = true

            if (primers.length <= lentv) {
                num1 = primers.toDouble()
                stri1 = primers
                primers = primers + "x"
                tv_pantalla.text = primers
                oper = "m"
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }

        button_dividido.setOnClickListener {
            conti_oper()
            btoper = true
            inicial_oper()

            button_igual.isEnabled = true

            if (primers.length <= lentv) {
                num1 = primers.toDouble()
                stri1 = primers
                primers = primers + "/"
                tv_pantalla.text = primers
                oper = "d"
            } else {
                Toast.makeText(applicationContext, "Se llenó la pantalla", Toast.LENGTH_LONG).show()
            }
        }


        button_igual.setOnClickListener {
            contigual = true
            btoper = false
            button_mas.isEnabled = true
            button_menos.isEnabled = true
            button_por.isEnabled = true
            button_dividido.isEnabled = true
            button_igual.isEnabled = false

            sz1 = (stri1.length) + 1

            if (sz1 == primers.length) {
                num2 = 0.0
                //tv_uno.text = "Caso1 " + sz1.toString() + primers.length.toString()
                //res = primers.toDouble()
            } else if (sz1 - 1 == primers.length) {
                num2 = 0.0
                oper = "b"
                //tv_uno.text = "Casob"
            } else {
                sin1 = primers.drop(sz1)
                if (sin1 == "") {
                    num2 = 0.0
                    //tv_uno.text = "Casoa"
                    oper = "a"
                } else {
                    num2 = 0.0
                    num2 = (sin1).toDouble()
                    primers = "0"
                    stri1 = " "
                    //tv_uno.text = "Caso operacion normal"
                }
            }

            when (oper) {
                "s" -> {
                    res = num1 + num2
                }
                "r" -> {
                    res = num1 - num2
                }
                "m" -> {
                    res = num1 * num2
                }
                "d" -> {
                    res = num1 / num2
                }
                "a" -> {
                    res = primers.toDouble()
                }
                "b" -> {
                    res = primers.toDouble()
                }
            }
            primers = "0"
            stri1 = " "
            tv_pantalla.text = res.toString()
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////

        button_ans.setOnClickListener {
            primers = primers + res.toString()
            tv_pantalla.text = primers

        }
        button_reset.setOnClickListener {

            button_mas.isEnabled = false
            button_menos.isEnabled = false
            button_por.isEnabled = false
            button_dividido.isEnabled = false
            button_igual.isEnabled = false

            primers = ""
            tv_pantalla.text = ""

            primers = ""
            stri1 = " "
            sz1 = 0
            num1 = 0.0
            num2 = 0.0
            oper = ""
            btoper = false
            contigual = false
        }

        button_clear.setOnClickListener {
            strio = primers.takeLast(1)
            //tv_uno.text = "delete "+primers.length.toString()

            if (primers.length == 1) {
                stri1 = " "
                primers = "0" + primers
            }
/////////////////////////////////////////////////////////////////////////////////////////////////
            if (strio == "+" || strio == "-" || strio == "x" || strio == "/") {
                btoper = false
                botones()
                button_igual.isEnabled = false
            }
            primers = primers.dropLast(1)
            tv_pantalla.text = primers
        }
    }
}
