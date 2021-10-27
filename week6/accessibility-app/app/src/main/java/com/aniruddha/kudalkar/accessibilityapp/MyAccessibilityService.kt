package com.aniruddha.kudalkar.accessibilityapp

import android.accessibilityservice.AccessibilityService
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import java.util.*

class MyAccessibilityService : AccessibilityService() {

    private lateinit var tts : TextToSpeech
    private var isSaid = false

    override fun onCreate() {
        tts = TextToSpeech(this) {
            when(it) {
                TextToSpeech.SUCCESS -> {
                    tts.language = Locale.ENGLISH
                    justSay("Connected")
                }
            }
        }
        tts.setSpeechRate(0.5f);
        super.onCreate()
    }

    override fun onDestroy() {
        tts.stop()
        tts.shutdown()
        super.onDestroy()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        Log.i("@ani", "Event Captured")
        event?.let {
            Log.i("@ani", "Package ${it.packageName}")
            sayAppName(it)
        }
    }

    override fun onInterrupt() { }

    private fun sayAppName(ev : AccessibilityEvent) {
        printEventType(ev)
        if(ev.packageName == "in.amazon.mShop.android.shopping") {
            if (ev.eventType == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
                if(!isSaid) {
                    justSay("You Opened Amazon")
                    isSaid = true
                }
            }
        }
    }

    private fun justSay(str : String) {
        tts.speak(
            str,
            TextToSpeech.QUEUE_FLUSH,
            null,
            "${System.currentTimeMillis()}"
        )
    }

    private fun blockApp(ev : AccessibilityEvent) {
        if(ev.packageName == "com.android.gallery3d") {
            if (ev.eventType == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
                performGlobalAction(GLOBAL_ACTION_BACK)
            }
        }
    }

    private fun printEventType(ev : AccessibilityEvent) {
        when(ev.eventType) {
            AccessibilityEvent.TYPE_VIEW_CLICKED -> Log.i("@ani", "View Clicked")
            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED -> Log.i("@ani", "Window State Changed")
            AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED -> { Log.i("@ani", "Window Content Changed") }
            AccessibilityEvent.TYPE_VIEW_SCROLLED -> Log.i("@ani", "Scroll Happened")
            AccessibilityEvent.TYPE_GESTURE_DETECTION_START -> Log.i("@ani", "Gesture Detection Start")
            AccessibilityEvent.TYPE_GESTURE_DETECTION_END -> Log.i("@ani", "Gesture Detection End")
            AccessibilityEvent.TYPE_WINDOWS_CHANGED -> Log.i("@ani", "Window Changed")
            else -> Log.i("@ani", "Wrong Event")
        }
    }
}