package gutierrezmorquecho.luis.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Informacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        val btn_registrar: Button = findViewById(R.id.btn_registrar)
        var campo_nombre: TextView = findViewById(R.id.et_nombre)
        var campo_apellido: TextView = findViewById(R.id.et_apellido)

        var posMovie = -1
        val bundle = intent.extras

        if(bundle!=null){

            posMovie = bundle.getInt("id")
        }

        btn_registrar.setOnClickListener{
            var nombre: String = campo_nombre.text.toString()
            var apellido: String = campo_apellido.text.toString()

            //Toast.makeText(this, "$nombre $apellido", Toast.LENGTH_LONG).show()


            //El Intent sirve para pasar los datos de esta actividad a otra activity o frame(en este caso para pasar datos a BienvenidoActivity).
            val intent: Intent = Intent(this, Resumen::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("apellido", apellido)
            intent.putExtra("posMovie", posMovie)
            startActivity(intent)

        }

    }
}