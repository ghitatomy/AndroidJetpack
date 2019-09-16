package home.com.main

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {

    private val myContext = context

    fun onButtonClick(name: String) {
        Toast.makeText(myContext, "Hello $name", Toast.LENGTH_SHORT).show()
    }
}