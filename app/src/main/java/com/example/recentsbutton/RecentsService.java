package com.example.recentsbutton;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class RecentsService extends AccessibilityService {

    public static RecentsService instance;

    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();
        instance = this;
    }

    public void openRecents() {
        performGlobalAction(GLOBAL_ACTION_RECENTS);
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
    }

    @Override
    public void onInterrupt() {
    }
}
