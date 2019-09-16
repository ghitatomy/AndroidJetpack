package home.com.main

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import home.com.BR

class Contact(_name: String, _email: String) : BaseObservable() {
    @get:Bindable
    var name: String = _name
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var email: String = _email
        set(value) {
            field = value
            notifyPropertyChanged(BR.email)
        }

    companion object {
        @JvmStatic @BindingAdapter("profileImage")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.context)
                    .load(imageUrl)
                    .into(view)
        }
    }
}