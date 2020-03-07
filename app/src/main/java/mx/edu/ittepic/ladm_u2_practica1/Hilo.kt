package mx.edu.ittepic.ladm_u2_practica1

class Hilo (p:MainActivity) : Thread() {
    var inicio = false
    var puntero = p

    override fun run() {
        super.run()
        while(true){
            sleep(100)
            puntero.runOnUiThread {
                if(!inicio){
                    sleep(5000)
                    inicio = true
                }else{
                    puntero.miLienzo!!.animarCirculo()
                }
            }
        }
    }
}