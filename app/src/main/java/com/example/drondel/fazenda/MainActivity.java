package com.example.drondel.fazenda;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import static com.example.drondel.fazenda.R.id.switch1;

public class MainActivity extends Activity {

    String SENT = "SMS_SENT";
    String DELIVERED = "SMS_DELIVERED";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    // Временно закоментим, чтобы не спамить!
    //    String phoneNumber = "+00000000000";
    //    String message = "Get status";
    //    sendSMS(phoneNumber,message);

        setContentView(R.layout.activity_main);
        Switch switch1 = (Switch) findViewById(R.id.switch1);
        // добавляем слушателя
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // в зависимости от значения isChecked выполняем действие
                if (isChecked) {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в гостинной включено!";
                    sendSMS(phoneNumber,message);
                } else {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в гостинной отключено!";
                    sendSMS(phoneNumber,message);
                }
            }
        });

        Switch switch2 = (Switch) findViewById(R.id.switch2);
        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // в зависимости от значения isChecked выполняем действие
                if (isChecked) {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в коридоре включено!";
                    sendSMS(phoneNumber,message);
                } else {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в коридоре отключено!";
                    sendSMS(phoneNumber,message);
                }
            }
        });

        Switch switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // в зависимости от значения isChecked выполняем действие
                if (isChecked) {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в душевой включено!";
                    sendSMS(phoneNumber,message);
                } else {
                    String phoneNumber = "+79162109917";
                    String message = "Отопление в душевой отключено!";
                    sendSMS(phoneNumber,message);
                }
            }
        });

    }

//Sends an SMS message to another device
    public void sendSMS(String phoneNumber,String message) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(phoneNumber, null, message, null, null);
    }


}
