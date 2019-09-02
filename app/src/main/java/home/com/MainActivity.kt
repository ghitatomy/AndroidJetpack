package home.com

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import home.com.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.contact = Contact("Dan Brown", "danbrown@gmail.com")

        binding.handler = EventHandler(this)

        binding.imageUrl = "https://i.redd.it/lhw4vp5yoy121.jpg"
    }
}
