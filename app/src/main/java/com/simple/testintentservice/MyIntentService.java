package com.simple.testintentservice;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class MyIntentService extends IntentService{
    public MyIntentService() {
        super("my_intent_service");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Intent intent1 = new Intent();
        intent1.setAction("dialog");
        startActivity(intent1);
    }
}
