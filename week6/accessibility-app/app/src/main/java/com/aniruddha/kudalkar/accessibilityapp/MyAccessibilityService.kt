package com.aniruddha.kudalkar.accessibilityapp

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService(){

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {  }

    override fun onInterrupt() { }
}