package mx.tecnm.tepic.u1p1diseomenuprincipal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ac_usuario.*

class acUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_usuario)

        btnRegresar.setOnClickListener {
            onBackPressed();
        }
    }
}