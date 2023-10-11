package annk.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get Views
        val bnt : Button = findViewById(R.id.button2)
        val lab : TextView = findViewById(R.id.textView)
        val lab1 : TextView = findViewById(R.id.textView2)

        //Random for the dice
        val rand = Random();

        bnt.setOnClickListener() {
            //Show toast from bottom of screen
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            //Set text to random
            lab.setText((rand.nextInt(6)+1).toString());
            lab1.setText((rand.nextInt(6)+1).toString());
        }
    }
}