package annk.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get Views
        val bnt : Button = findViewById(R.id.button2)
        val lab : ImageView = findViewById(R.id.imageView4)
        val lab1 : ImageView = findViewById(R.id.imageView5)
        //Random for the dice
        val rand = Random();
        //Dices
        val dice1 = DiceModel(rand)
        val dice2 = DiceModel(rand)

        bnt.setOnClickListener() {
            //Show toast from bottom of screen
            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            toast.show()

            //Set text to random
            lab.setImageResource(dice1.roll())
            lab1.setImageResource(dice2.roll())
        }
    }
}