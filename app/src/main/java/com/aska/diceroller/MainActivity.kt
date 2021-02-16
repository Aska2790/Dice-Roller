package com.aska.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aska.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    //region Properties

    private lateinit var binding: ActivityMainBinding

    //endregion

    //region Lifecycle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    //endregion

    //region Initialization

    private fun initialize() {
        binding.buttonDiceRoller.setOnClickListener {
            onDiceRollerImageUpdateAction()
        }
    }

    //endregion

    //region Actions

    private fun onDiceRollerImageUpdateAction(){
        val nextInt = Random().nextInt(6) + 1
        val imageResourceId = when (nextInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.imageViewDiceRoller.setImageResource(imageResourceId)
    }

    //endregion
}