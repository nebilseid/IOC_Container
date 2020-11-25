package com.dev.myapplication;

import android.app.Application;

public class SampleApp extends Application {
    final DI di = new DI();

    @Override
    public void onCreate() {
        super.onCreate();
        di.initializeDependencies();
    }
}
