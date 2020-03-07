package mx.edu.ittepic.ladm_u2_practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    var miLienzo : Lienzo?=null
    var hilo = Hilo(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        miLienzo = Lienzo((this))
        setContentView(miLienzo)
        hilo!!.start()
    }
}
