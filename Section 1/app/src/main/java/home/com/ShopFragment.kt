package home.com

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_shop.*
import androidx.navigation.Navigation
import java.util.*


class ShopFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shop, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b_about.setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.about_destination)
//            Navigation.findNavController(it).navigate(R.id.next_action)
            val nextAction = ShopFragmentDirections.nextAction()
            nextAction.productCount = Random().nextInt(200)
            Navigation.findNavController(it).navigate(nextAction)
        }
    }
}