package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.gallery

import android.graphics.drawable.Drawable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    private val _img = MutableLiveData<Drawable>()
    val img: LiveData<Drawable> = _img

    fun setData(txt : String, ig : Drawable ) {
        _text.value = txt
        _img.value = ig
    }
}