package mx.edu.ittepic.ladm_u2_practica1

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.View



class Lienzo(p:MainActivity) : View(p) {
    var puntero = p
    var copo1=FiguraGeometrica(255,-160,10)
    var copo2=FiguraGeometrica(180,-120,10)
    var copo3=FiguraGeometrica(350,-100,10)
    var copo4=FiguraGeometrica(410,-80,10)
    var copo5=FiguraGeometrica(330,-70,10)
    var copo6=FiguraGeometrica(360,-30,10)
    var copo7=FiguraGeometrica(250,-50,10)
    var copo8=FiguraGeometrica(80,-40,10)
    var copo9=FiguraGeometrica(130,-50,10)
    var copo10=FiguraGeometrica(150,-10,10)
    var punteroFiguraGeometrica: FiguraGeometrica? = null

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()
        var pa = Path()

        //COPO
        p.color = Color.BLACK
        copo1.pintar(c, p)
        p.color = Color.BLACK
        copo2.pintar(c, p)
        p.color = Color.BLACK
        copo3.pintar(c, p)
        p.color = Color.BLACK
        copo4.pintar(c, p)
        p.color = Color.BLACK
        copo5.pintar(c, p)
        p.color = Color.BLACK
        copo6.pintar(c, p)
        p.color = Color.BLACK
        copo7.pintar(c, p)
        p.color = Color.BLACK
        copo8.pintar(c, p)
        p.color = Color.BLACK
        copo9.pintar(c, p)
        p.color = Color.BLACK
        copo10.pintar(c, p)


        //CESPED
        p.color=Color.rgb(89,216,61)
        c.drawRect(0f,400f,500f,700f,p)

        //CASA
        p.color=Color.RED
        c.drawRect(170f,300f,370f,450f,p)

        //TECHO
        pa.moveTo(140f,300f)
        pa.lineTo(400f,300f)
        pa.lineTo(270f,245f)
        p.color=(Color.parseColor("#5B3924"))
        c.drawPath(pa,p)

        //DECORACION
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,300f,200f,310f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(200f,300f,230f,310f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(230f,300f,260f,310f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(260f,300f,290f,310f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(290f,300f,320f,310f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(320f,300f,350f,310f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(350f,300f,370f,310f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(170f,310f,210f,320f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(210f,310f,250f,320f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(250f,310f,300f,320f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(300f,310f,340f,320f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(340f,310f,370f,320f,p)
//DECORACION 3
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(170f,320f,200f,330f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(200f,320f,230f,330f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(230f,320f,260f,330f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(260f,320f,290f,330f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(290f,320f,320f,330f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(320f,320f,350f,330f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(350f,320f,370f,330f,p)
//RENGLON DOS
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(170f,330f,210f,340f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(210f,330f,250f,340f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(250f,330f,300f,340f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(300f,330f,340f,340f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(340f,330f,370f,340f,p)
//DECORACION 5
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(170f,340f,200f,350f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(200f,340f,230f,350f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(230f,340f,260f,350f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(260f,340f,290f,350f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(290f,340f,320f,350f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(320f,340f,350f,350f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(350f,340f,370f,350f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,350f,210f,360f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(210f,350f,250f,360f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(250f,350f,300f,360f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(300f,350f,340f,360f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(340f,350f,370f,360f,p)

//DECORACION 7
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,360f,200f,370f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(200f,360f,230f,370f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(230f,360f,260f,370f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(260f,360f,290f,370f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(290f,360f,320f,370f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(320f,360f,350f,370f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(350f,360f,370f,370f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(170f,370f,210f,380f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(210f,370f,250f,380f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(250f,370f,300f,380f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(300f,370f,340f,380f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(340f,370f,370f,380f,p)

//DECORACION 9
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(170f,380f,200f,390f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(200f,380f,230f,390f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(230f,380f,260f,390f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(260f,380f,290f,390f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(290f,380f,320f,390f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(320f,380f,350f,390f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(350f,380f,370f,390f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(170f,390f,210f,400f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(210f,390f,250f,400f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(250f,390f,300f,400f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(300f,390f,340f,400f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(340f,390f,370f,400f,p)


//DECORACION 11
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,400f,200f,410f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(200f,400f,230f,410f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(230f,400f,260f,410f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(260f,400f,290f,410f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(290f,400f,320f,410f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(320f,400f,350f,410f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(350f,400f,370f,410f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(170f,410f,210f,420f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(210f,410f,250f,420f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(250f,410f,300f,420f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(300f,410f,340f,420f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(340f,410f,370f,420f,p)

//DECORACION13
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,420f,200f,430f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(200f,420f,230f,430f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(230f,420f,260f,430f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(260f,420f,290f,430f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(290f,420f,320f,430f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(320f,420f,350f,430f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(350f,420f,370f,430f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(170f,430f,210f,440f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(210f,430f,250f,440f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(250f,430f,300f,440f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(300f,430f,340f,440f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(340f,430f,370f,440f,p)

//DECORACION 15
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(170f,440f,200f,450f,p)
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(200f,440f,230f,450f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(230f,440f,260f,450f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(260f,440f,290f,450f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(290f,440f,320f,450f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(320f,440f,350f,450f,p)
        p.color=(Color.parseColor("#EEC170"))
        c.drawRect(350f,440f,370f,450f,p)
        //RENGLON DOS
        p.color=(Color.parseColor("#F2EADC"))
        c.drawRect(170f,450f,210f,460f,p)
        p.color=(Color.parseColor("#FF9F1C"))
        c.drawRect(210f,450f,250f,460f,p)
        p.color=(Color.parseColor("#F2D2B3"))
        c.drawRect(250f,450f,300f,460f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(300f,450f,340f,460f,p)
        p.color=(Color.parseColor("#FFEDBE"))
        c.drawRect(340f,450f,370f,460f,p)

        //PUERTA
        p.color=(Color.parseColor("#5B3924"))
        c.drawRect(250f,400f,290f,460f,p)

        //VENTANA
        p.color=(Color.parseColor("#5B3924"))
        c.drawCircle(220f,350f,20f,p)

        //ARBOLES
        p.color=Color.rgb(57, 148,15)
        c.drawCircle(80f,320f,20f,p)
        p.color=Color.rgb(57, 148,15)
        c.drawCircle(90f,320f,20f,p)
        p.color=Color.rgb(57, 148,15)
        c.drawCircle(80f,340f,20f,p)
        p.color=Color.rgb(57, 148,15)
        c.drawCircle(90f,340f,20f,p)
        p.color=Color.rgb(110,78,11)
        c.drawRect(75f,355f,90f,420f,p)

    }
    fun animarCirculo() {
        copo1.abajo(width, height)
        copo2.abajo(width, height)
        copo3.abajo(width, height)
        copo4.abajo(width, height)
        copo5.abajo(width, height)
        copo6.abajo(width, height)
        copo7.abajo(width, height)
        copo8.abajo(width, height)
        copo9.abajo(width, height)
        copo10.abajo(width, height)
        invalidate()
    }
}