package com.aniruddha.kudalkar.jetpacknavigationgraph.hammn.ui.gallery

import android.graphics.drawable.Drawable
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _blbTgl = MutableLiveData<Boolean>(false)
    val blbTgl : LiveData<Boolean> = _blbTgl

    private val _text = MutableLiveData<String>()
    val text: LiveData<String> = _text

    private val _img = MutableLiveData<Drawable>()
    val img: LiveData<Drawable> = _img

    fun setData(txt : String, ig : Drawable ) {
        _text.value = txt
        _img.value = ig
    }

    fun toggleBulb() {
        _blbTgl.value = _blbTgl.value?.not()
    }

    fun changeBulb(blb : Drawable) {
        _img.value = blb
    }
}