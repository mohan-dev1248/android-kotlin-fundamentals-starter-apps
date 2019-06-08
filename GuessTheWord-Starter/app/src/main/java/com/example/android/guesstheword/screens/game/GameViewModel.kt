package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {

    companion object{
        const val TAG = "GameViewModel"
    }

    init {
        Log.i(TAG, "GameViewModel Created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "GameViewModel destroyed!")
    }
}