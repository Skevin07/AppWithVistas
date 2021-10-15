package com.unab.appwithvistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Aca las ponemos fuera del layout porque ncesitamos que sean variables globals
    private lateinit var etNombre:EditText
    private lateinit var etPassword:EditText
    private lateinit var etN1:EditText
    private lateinit var etN2:EditText

    //Este le podemos esto porque no le vamos a asignar si no que vamos
    private var tvR:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //La clase "R" es donde estan los recursos y el findViewById porque utilizaremos ese id
        etNombre = findViewById(R.id.et_Nombre)
        etPassword = findViewById(R.id.et_Password)
        etN1 = findViewById(R.id.et_Num1)
        etN2 = findViewById(R.id.et_Num2)



    }


    //Se crearan una funcion para el registro
    //Vista:View para que salgael atributo de onclick
    fun registro(Vista:View)
    {
        //Aca lo que hacemos es una comversion a una cadena de texto.
        val nombre = etNombre.text.toString()
        val password = etPassword.text.toString()

        //length si no hay ningun carecter en la varible nombre que haga lo siguiente
        if (nombre.length==0)
        {
            //Toast.LENGTH_LONG es pra indicar el tiempo que el mensaje estara en pantalla (En un mensajito que aparece en la parte de abao) y el punto show para que se muestre
            Toast.makeText(this, "Debes ingresar un nombre",Toast.LENGTH_LONG).show()
        }
        if (password.length==0)
        {
            Toast.makeText(this, "Debes ingresar una contrasena",Toast.LENGTH_LONG).show()
        }

        if (nombre.length!=0&&password.length!=0)
        {
            Toast.makeText(this,"Procesando",Toast.LENGTH_LONG).show()
        }

    }




    fun calcular(Vista: View)
    {
        val valor1 = etN1.text.toString()
        val valor2 = etN2.text.toString()

        //Haremos un operador que sume pero un string nose puede sumar asi que lo vamos hacer un parcero y se hace lo soguiente:
        val num1:Int = Integer.parseInt(valor1)
        val num2:Int = Integer.parseInt(valor2)

        var suma = num1+num2
        var resultado:String = suma.toString()
        //y este resultado lo asamos al texview
        tvR?.setText(resultado)
    }




}