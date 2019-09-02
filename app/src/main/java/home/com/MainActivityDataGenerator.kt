package home.com

import android.arch.lifecycle.ViewModel
import android.util.Log
import java.util.*

class MainActivityDataGenerator: ViewModel() {

    private lateinit var myRandomNumber: String

    fun getNumber(): String {
        Log.i(TAG, "Get number");
        if (!::myRandomNumber.isInitialized){
            this.createNumber()
        }
        return myRandomNumber
    }

    fun createNumber() {
        Log.i(TAG, "Create new number");
        val random = Random()
        myRandomNumber = "Number: " + (random.nextInt(10-1)+1)
    }

    companion object {
        private val TAG = MainActivityDataGenerator::class.simpleName
    }
}