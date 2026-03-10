package com.example.recentsbutton;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

public class RecentsWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

        for (int widgetId : appWidgetIds) {

            Intent intent = new Intent(context, RecentsReceiver.class);
            PendingIntent pendingIntent = PendingIntent.getBroadcast(
                    context,
                    0,
                    intent,
                    PendingIntent.FLAG_UPDATE_CURRENT
            );

            RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_recents);
            views.setOnClickPendingIntent(R.id.recents_icon, pendingIntent);

            appWidgetManager.updateAppWidget(widgetId, views);
        }
    }
}
