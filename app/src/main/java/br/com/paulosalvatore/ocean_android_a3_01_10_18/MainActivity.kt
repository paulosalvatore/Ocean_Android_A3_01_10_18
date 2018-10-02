package br.com.paulosalvatore.ocean_android_a3_01_10_18

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
	}

	fun enviar(view: View) {
		// Em java seria:
		// String nome = "Paulo Salvatore";

		// Em Kotlin
		// var nome: String = "Paulo Salvatore"

		// Em Kotlin, se não será alterado
		// val nome: String = "Paulo Salvatore"

		val nome = etNome.text.toString()

		if (nome != "") {
			tvNome.text = nome

			val intent = Intent(this, DrawerActivity::class.java)
			intent.putExtra("NOME", nome)
			startActivity(intent)
		} else {
//			longToast("Digite o seu nome.")
			layout.snackbar("Digite o seu nome")

			etNome.error = "Digite o seu nome"
		}

//		tvNome.text = "Olá, Paulo Salvatore"
//		Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
	}
}
