package gutierrezmorquecho.luis.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Resumen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)


        var tv_nombre= findViewById(R.id.tv2) as TextView
        var tv_asiento= findViewById(R.id.tv3) as TextView

        var bundle = intent.extras

        if (bundle != null){
            //Las variables KEY deben de ser iguales a las variables que pusimos para pasar los datos(en este caso de MainActivity)
            var nombre = bundle.getString("nombre")
            var apellido = bundle.getString("apellido")
            var posMovie = bundle.getString("posMovie")

            tv_nombre.setText("$nombre $apellido")
            tv_asiento.setText(("$posMovie"))
        }

    }
}