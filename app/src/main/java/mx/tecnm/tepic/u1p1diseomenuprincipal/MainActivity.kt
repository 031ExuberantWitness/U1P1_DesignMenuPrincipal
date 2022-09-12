package mx.tecnm.tepic.u1p1diseomenuprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnUsuario.setOnClickListener {
            var otroActivity = Intent(this, acUsuario::class.java)
            startActivity(otroActivity)
        }

        btnRestaurantes.setOnClickListener {
            var mensaje = "Función bajo construcción."

            AlertDialog.Builder(this)
                .setTitle("Importante")
                .setMessage(mensaje)
                .setPositiveButton("Aceptar"){d, i ->
                    d.dismiss()
                }
                .show()
        } //al OnCreate

        btnCategorias.setOnClickListener {
            var mensaje = "Función bajo construcción."

            AlertDialog.Builder(this)
                .setTitle("Importante")
                .setMessage(mensaje)
                .setPositiveButton("Aceptar"){d, i ->
                    d.dismiss()
                }
                .show()
        } //al OnCreate

        btnPromociones.setOnClickListener {
            var mensaje = "Función bajo construcción."

            AlertDialog.Builder(this)
                .setTitle("Importante")
                .setMessage(mensaje)
                .setPositiveButton("Aceptar"){d, i ->
                    d.dismiss()
                }
                .show()
        } //al OnCreate

        btnCerrarSesion.setOnClickListener {
            finish()
        } //al OnCreate
    }



}