package com.aniruddha.kudalkar.thirdpartylibs

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.aniruddha.kudalkar.thirdpartylibs.databinding.FragmentFirstBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.InputStream
import java.net.URL
import java.net.URLClassLoader
import java.net.URLConnection
import com.bumptech.glide.request.transition.DrawableCrossFadeFactory




/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */


// - it is internet call
// - i need to download the image content
// - imageview how do i set the content
// - is there any readymade code

class FirstFragment : Fragment() {

    private val scp  = CoroutineScope(Dispatchers.IO)

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadWithGlide(binding.imageView)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadWithGlide(img : ImageView) {

        Glide.with(this)
            .load("https://cdn.pixabay.com/photo/2017/09/25/13/12/cocker-spaniel-2785074_1280.jpg")
            .transition(
                DrawableTransitionOptions.withCrossFade(3500)
            )
            .into(img)
    }

    private fun loadImage(img : ImageView) {

        scp.launch {
            val url: URL = URL("https://cdn.pixabay.com/photo/2017/09/25/13/12/cocker-spaniel-2785074_1280.jpg")
            val connection: URLConnection = url.openConnection()
            val ips: InputStream = connection.getInputStream()
            val bitmap: Bitmap = BitmapFactory.decodeStream(ips)

            withContext(Dispatchers.Main) {
                img.setImageBitmap(bitmap)
            }
        }
    }
}