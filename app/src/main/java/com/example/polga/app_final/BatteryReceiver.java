package com.example.polga.app_final;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        String action = intent.getAction();


        Toast.makeText(context, "Action: " + action, Toast.LENGTH_SHORT).show();

        String strAction;

        if(action == Intent.ACTION_BATTERY_LOW){
            strAction = "ACTION_BATTERY_LOW)";
        }else if (action.equals (Intent.ACTION_BATTERY_OKAY)){
            strAction = "ACTION_BATTERY_OKAY";
        }else if (action.equals (Intent.ACTION_POWER_CONNECTED)){
            strAction = "ACTION_POWER_CONNECTED";
        }else if (action.equals (Intent.ACTION_POWER_DISCONNECTED)){
            strAction = "ACTION_POWER_DISCONNECTED";
        }else{
            strAction = "unknown!";
        }
        Log.i("Bateria", strAction);
    }
}
