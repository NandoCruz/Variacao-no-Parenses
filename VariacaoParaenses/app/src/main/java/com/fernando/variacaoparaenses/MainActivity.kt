package com.fernando.variacaoparaenses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_enxerido = findViewById<Button>(R.id.btn_enxerido)
        val btn_mentira = findViewById<Button>(R.id.btn_mentira)
        val btn_se_deu_mal = findViewById<Button>(R.id.btn_se_deu_mal)
        val btn_te_abaixa = findViewById<Button>(R.id.btn_te_abaixa)
        val btn_se_apresse = findViewById<Button>(R.id.btn_se_apresse)
        val btn_vamos_embora = findViewById<Button>(R.id.btn_vamos_embora)
        val btn_cachaceiro = findViewById<Button>(R.id.btn_cachaceiro)
        val btn_brigar = findViewById<Button>(R.id.btn_brigar)
        val btn_amassar = findViewById<Button>(R.id.btn_amassar)

        supportActionBar!!.hide()

        // Botão Enxerido
        btn_enxerido.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.assanhado)
            startActivity(variacao)
        })

        // Botão Mentira
        btn_mentira.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.olha_ja)
            startActivity(variacao)
        })

        // Botão Se deu mal
        btn_se_deu_mal.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.levou_farelo)
            startActivity(variacao)
        })

        // Botão Te abaixa
        btn_te_abaixa.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.te_acoca)
            startActivity(variacao)
        })

        // Botão Se aparesse
        btn_se_apresse.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.bora_logo)
            startActivity(variacao)
        })

        // Botão Vamos embora
        btn_vamos_embora.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.borimbora)
            startActivity(variacao)
        })

        // Botão Cachaceiro
        btn_cachaceiro.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.papudinho)
            startActivity(variacao)
        })

        // Botão Brigar
        btn_brigar.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.ralhar)
            startActivity(variacao)
        })

        // Botão Amassar
        btn_amassar.setOnClickListener(View.OnClickListener {
            val variacao = Intent(this, Variacao::class.java)
            variacao.putExtra("imagem",R.drawable.esmigalhar)
            startActivity(variacao)
        })
    } // Fim do onCreate

} // Fim da Class MainActivity