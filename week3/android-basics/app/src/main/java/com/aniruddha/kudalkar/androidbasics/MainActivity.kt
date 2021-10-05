package com.aniruddha.kudalkar.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*

An activity is a single, focused thing that the user can do.
Almost all activities interact with the user, so the Activity class takes care of
creating a window for you in which you can place your UI with setContentView.

There are two methods almost all subclasses of Activity will implement:
onCreate is where you initialize your activity.
Most importantly, here you will usually call setContentView(int) with a layout resource defining your UI,
and using findViewById to retrieve the widgets in that UI that you need to interact with programmatically.
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //resource.folder.file_name
        //resource = R, folder = drawable, file_name = ic_launcher_background
//        R.drawable.ic_launcher_background
//        R.mipmap.ic_launcher
        setContentView(R.layout.activity_main)
    }
}