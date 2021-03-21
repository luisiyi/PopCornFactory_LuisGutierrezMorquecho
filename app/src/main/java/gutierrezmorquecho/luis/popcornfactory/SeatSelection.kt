package gutierrezmorquecho.luis.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SeatSelection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seat_selection)

        val title: TextView = findViewById(R.id.titleSeats)
        var posMovie = -1
        //El bundle sirve para recibir los datos que nos están mandando de otra activity
        val bundle = intent.extras

        if(bundle!=null){
            title.setText(bundle.getString("name"))
            posMovie = bundle.getInt("id")
        }

        val confirm : Button = findViewById(R.id.confirm)

        confirm.setOnClickListener{
            val intent: Intent = Intent(this, Informacion::class.java)
            intent.putExtra("posMovie", posMovie)
            startActivity(intent)
            //Realizar funcionalidad para reservar el lugar seleccionado por el usuario
            //Hacer una nueva actividad donde se vea el resumen de la compra, es decir que se agrega el nombre del cliente y se vea el asiento que seleccionó.

            Toast.makeText(this, "llena los campos necesarios :D", Toast.LENGTH_LONG).show()
        }

        val row1: RadioGroup = findViewById(R.id.row1)
        val row2: RadioGroup = findViewById(R.id.row2)
        val row3: RadioGroup = findViewById(R.id.row3)
        val row4: RadioGroup = findViewById(R.id.row4)
        
        row1.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row1.check(checkedId)
            }
        }

        row2.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId > -1){
                row1.clearCheck()
                row3.clearCheck()
                row4.clearCheck()

                row2.check(checkedId)
            }
        }

        row3.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId > -1){
                row2.clearCheck()
                row1.clearCheck()
                row4.clearCheck()

                row3.check(checkedId)
            }
        }

        row4.setOnCheckedChangeListener { group, checkedId ->

            if (checkedId > -1){
                row2.clearCheck()
                row3.clearCheck()
                row1.clearCheck()

                row4.check(checkedId)
            }
        }
    }
}