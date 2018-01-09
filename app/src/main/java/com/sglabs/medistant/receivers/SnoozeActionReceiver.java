package com.sglabs.medistant.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;

import com.sglabs.medistant.activities.ReminderSnoozeDialogActivity;
import com.sglabs.medistant.utils.AlarmUtil;

public class SnoozeActionReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int reminderId = intent.getIntExtra("NOTIFICATION_ID", 0);

        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("checkBoxNagging", false)) {
            Intent alarmIntent = new Intent(context, NagReceiver.class);
            AlarmUtil.cancelAlarm(context, alarmIntent, reminderId);
        }

        // Close reminder_notification tray
        Intent closeIntent = new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS);
        context.sendBroadcast(closeIntent);

        Intent snoozeIntent = new Intent(context, ReminderSnoozeDialogActivity.class);
        snoozeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        snoozeIntent.putExtra("NOTIFICATION_ID", reminderId);
        context.startActivity(snoozeIntent);
    }
}