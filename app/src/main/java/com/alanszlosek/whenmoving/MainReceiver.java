package com.alanszlosek.whenmoving;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.alanszlosek.whenmoving.MainApplication;

// Receives AlarmManager RTC_WAKEUPs
public class MainReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        MainApplication.getInstance().startup();
    }
}
