package com.fernando.variacaoparaenses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Variacao : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_variacao)
        var img_centro = findViewById<ImageView>(R.id.img_centro)

        supportActionBar!!.hide()
        val dados = intent.extras
        var imagem = dados?.getInt("imagem")

        img_centro.setImageResource(imagem!!)

    } // Fim onCreate

} // Fim da Calsse Variação
