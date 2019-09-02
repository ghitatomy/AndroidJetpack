package home.com

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {

    val myContext = context

    fun onButtonClick() {
        Toast.makeText(myContext, "Hello", Toast.LENGTH_SHORT).show()
    }
}