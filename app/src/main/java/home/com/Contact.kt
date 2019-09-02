package home.com

import android.databinding.BaseObservable
import android.databinding.Bindable

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
}