package gutierrezmorquecho.luis.popcornfactory


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botonP.setOnClickListener(){
            var intent: Intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }
    }
}

