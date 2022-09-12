package mx.tecnm.tepic.u1p1diseomenuprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var num = findViewById<EditText>(R.id.tbnNumeroTar)
        var fecha = findViewById<EditText>(R.id.btnFecha)
        var nombre = findViewById<EditText>(R.id.btnNombre)


        btnAgregar.setOnClickListener {
           var mensaje = "Numero de tarjeta: "+num.text.toString()+"\n"+
                   "Fecha: "+fecha.text.toString()+"\n"+
                   "Nombre: "+nombre.text.toString()

           AlertDialog.Builder(this)
                .setTitle("Datos de la tarjeta")
                .setMessage(mensaje)
                .setPositiveButton("Aceptar"){d,i->
                    //DialogInterface = permite informa al S.O. si todo bien o todo mal
                    d.dismiss()
                    //Exception = Solo toma memoria si algo malo sucede, si todo bien es null
                }
                .show() //LE PERTENECE AL ALERTDIALOG
        }
    }
}