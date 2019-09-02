package home.com

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import home.com.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.contact = Contact("Dan Brown", "danbrown@gmail.com")

        binding.handler = EventHandler(this)

        binding.imageUrl = "https://i.redd.it/lhw4vp5yoy121.jpg"

        Log.i(TAG, "Owner onCreate ");

        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Owner onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Owner onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "Owner onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Owner onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Owner onStop")
    }

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }
}
