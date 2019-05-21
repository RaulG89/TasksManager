package com.example.tasksmanager.platform.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TaskManagerModule {

    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }



}
