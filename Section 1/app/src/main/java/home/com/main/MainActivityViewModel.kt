package home.com.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import java.util.*

class MainActivityViewModel : ViewModel() {
    private lateinit var myRandomNumber: MutableLiveData<String>

    fun getNumber(): MutableLiveData<String> {
        Log.i(TAG, "Get Number")
        if (!::myRandomNumber.isInitialized) {
            myRandomNumber = MutableLiveData()
            this.createNumber()
        }
        return myRandomNumber
    }

    fun createNumber() {
        Log.i(TAG, "Create new Number")
        val random = Random()
        myRandomNumber.value = "Number: " + (random.nextInt(10 - 1) + 1)
    }

    override fun onCleared() {
        super.onCleared()
        Log.i(TAG, "ViewModel Destroyed")
    }

    companion object {
        private val TAG = MainActivityViewModel::class.simpleName
    }
}

