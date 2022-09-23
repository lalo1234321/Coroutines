package com.example.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Esta corutina funcionará a lo largo de todo el ciclo de vida de la aplicación
        //launch es la parte del compilador de esta corutina o también se llama como constructor
        var TAG:String = "ActividadPrincipal"
        GlobalScope.launch {
            //código que se ejecutará en otro subproceso
            Log.d(TAG, "Código ejecutandose en el subproceso ${ Thread.currentThread().name }")
            delay(3000)
            Log.d(TAG, "dentro de GlobalScope")
        }
        Log.d(TAG, "Código ejecutandose en el subproceso ${Thread.currentThread().name}")
        Log.d(TAG, "Hola mundo")
    }
}