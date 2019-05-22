package com.example.tasksmanager;

import android.app.Application;

import com.example.tasksmanager.platform.component.DaggerTaskManagerComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class TaskManagerApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerTaskManagerComponent.builder()
                .application(this)
                .build();
    }
}
