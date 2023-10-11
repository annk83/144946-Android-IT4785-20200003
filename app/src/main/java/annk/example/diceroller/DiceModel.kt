package annk.example.diceroller

import java.util.Random

class DiceModel public constructor(private val random: Random) {
    private object DiceList {
        val dices = arrayOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3, R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)
    }

    fun roll() :Int {
        return DiceList.dices[random.nextInt(6)];
    }
}