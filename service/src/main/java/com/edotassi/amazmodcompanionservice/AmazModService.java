package com.edotassi.amazmodcompanionservice;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import xiaofei.library.hermeseventbus.HermesEventBus;

public class AmazModService extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(Constants.TAG, "HermesEventBus init");
        HermesEventBus.getDefault().init(this);

        startService(new Intent(this, MainService.class));

    }

}
