package cervantes.example.iniciosesion_207003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.gms.common.SignInButton

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val bundle = intent.extras

        if(bundle != null){
            val nombre = bundle.getString("name");
            val email = bundle.getString("email");

            val tv_nombre = findViewById<TextView>(R.id.tv_nombre);
            val tv_correo = findViewById<TextView>(R.id.tv_email);

            tv_nombre.setText(nombre)
            tv_correo.setText(email)


        }
    }
}