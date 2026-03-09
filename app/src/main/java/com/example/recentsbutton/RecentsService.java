package com.example.recentsbutton;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class RecentsService extends AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        performGlobalAction(GLOBAL_ACTION_RECENTS);
    }

    @Override
    public void onInterrupt() {
    }
}
