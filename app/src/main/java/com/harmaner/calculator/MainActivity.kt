package com.harmaner.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun btnNoktaClick()
    {
        var btnn = findViewById<Button>(R.id.btnVirgul)
        btnn.setOnClickListener {

        }
    }

    fun btnInfoClick(view: View)
    {
        Toast.makeText(applicationContext, "Developed by Ramazan HARMANER !", Toast.LENGTH_SHORT).show()
    }

    fun btnSayiTik(view: View) {

        if(yeniOperator){
            sayiGoster.setText("")
        }
        yeniOperator = false
        var btnSec = view as Button
        var btnTikDeger: String = sayiGoster.getText().toString()
        when(btnSec.id){
            findViewById<Button>(R.id.btn0).id->{
                btnTikDeger+="0"
            }
            findViewById<Button>(R.id.btn1).id->{
                btnTikDeger+="1"
            }
            findViewById<Button>(R.id.btn2).id->{
                btnTikDeger+="2"
            }
            findViewById<Button>(R.id.btn2).id->{
                btnTikDeger+="2"
            }
            findViewById<Button>(R.id.btn3).id->{
                btnTikDeger+="3"
            }
            findViewById<Button>(R.id.btn4).id->{
                btnTikDeger+="4"
            }
            findViewById<Button>(R.id.btn5).id->{
                btnTikDeger+="5"
            }
            findViewById<Button>(R.id.btn6).id->{
                btnTikDeger+="6"
            }
            findViewById<Button>(R.id.btn7).id->{
                btnTikDeger+="7"
            }
            findViewById<Button>(R.id.btn8).id->{
                btnTikDeger+="8"
            }
            findViewById<Button>(R.id.btn9).id->{
                btnTikDeger+="9"
            }
            findViewById<Button>(R.id.btnArtiEksi).id->{
                btnTikDeger = "-" + btnTikDeger
            }
            findViewById<Button>(R.id.btnVirgul).id->{
                btnTikDeger = btnTikDeger.toString() + ".".toString()
            }
        }
            sayiGoster.setText(btnTikDeger.toString())
    }

    var operator = "*"
    var eskiSayi = ""
    var yeniOperator = true
    fun btnOpTik(view: View){
        var btnSec = view as Button
        when(btnSec.id){
            btnBol.id->{
                operator = "/"
            }
            btnCarp.id->{
                operator = "*"
            }
            btnCikar.id->{
                operator = "-"
            }
            btnTopla.id->{
                operator = "+"
            }
        }

        eskiSayi = sayiGoster.getText().toString()
        eskiText.setText(eskiSayi.toString() + operator.toString())
        sayiGoster.setText(operator.toString())
        yeniOperator = true

    }

    fun btnEsittirTik(view: View){
        var yeniSayi = sayiGoster.getText().toString()
        var sonucSayisi: Double? = null
        when(operator){
            "/"->{
                sonucSayisi = eskiSayi.toDouble()/yeniSayi.toDouble()
            }
            "*"->{
                sonucSayisi = eskiSayi.toDouble()*yeniSayi.toDouble()
            }
            "-"->{
                sonucSayisi = eskiSayi.toDouble()-yeniSayi.toDouble()
            }
            "+"->{
                sonucSayisi = eskiSayi.toDouble()+yeniSayi.toDouble()
            }
        }
        sayiGoster.setText(sonucSayisi.toString())
        eskiText.setText("")
        eskiSayi = ""
        operator = ""
        yeniOperator = true
    }

    fun btnSilTik(view: View){
        sayiGoster.setText("0")
        eskiSayi = ""
        operator = ""
        yeniOperator = true
    }

    fun btnYuzdeTik(view: View){
        var sayi:Double = sayiGoster.getText().toString().toDouble()/100
        sayiGoster.setText(sayi.toString())
        yeniOperator = true
    }

}