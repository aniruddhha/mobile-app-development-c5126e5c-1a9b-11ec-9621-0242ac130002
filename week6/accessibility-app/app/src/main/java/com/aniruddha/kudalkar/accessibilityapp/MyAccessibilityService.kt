package com.aniruddha.kudalkar.accessibilityapp

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService(){

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        Log.i("@ani", "Event Captured")
        event?.let {
            Log.i("@ani", "Package ${it.packageName}")

            if(it.packageName == "com.android.gallery3d") {
                if (it.eventType == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
                    performGlobalAction(GLOBAL_ACTION_BACK)
                }
            }
            when(it.eventType) {
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

    override fun onInterrupt() { }
}