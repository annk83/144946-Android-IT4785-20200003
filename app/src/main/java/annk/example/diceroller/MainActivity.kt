package annk.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bnt : Button = findViewById(R.id.button2)
        var lab : TextView = findViewById(R.id.textView)
        var rand : Random = Random();

        bnt.setOnClickListener() {
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()
            lab.setText((rand.nextInt(6)+1).toString());
        }
    }
}