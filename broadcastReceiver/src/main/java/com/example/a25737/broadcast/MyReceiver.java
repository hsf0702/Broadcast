package com.example.a25737.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sp = context.getSharedPreferences("config", 0);
        String ipnumber = sp.getString("ipnumber", "");

        String currentNumber = getResultData();
        System.out.println("number"+currentNumber);

        if(currentNumber.startsWith("0")){
            setResultData(ipnumber+currentNumber);
        }


    }
}
