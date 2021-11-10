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
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.InputStream
import java.net.URL
import java.net.URLClassLoader
import java.net.URLConnection

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */


// - it is internet call
// - i need to download the image content
// - imageview how do i set the content
// - is there any readymade code

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadImage(binding.imageView)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadImage(img : ImageView) {

        val scp  = CoroutineScope(Dispatchers.IO)
        scp.launch {
            val url: URL = URL("https://www.freepnglogos.com/uploads/android-logo-png/android-logo-transparent-png-svg-vector-2.png")
            val connection: URLConnection = url.openConnection()
            val ips: InputStream = connection.getInputStream()
            val bitmap: Bitmap = BitmapFactory.decodeStream(ips)

            withContext(Dispatchers.Main) {
                img.setImageBitmap(bitmap)
            }
        }
    }
}