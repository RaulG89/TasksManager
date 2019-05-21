package com.example.tasksmanager.platform.module;

import com.example.tasksmanager.ui.activity.TasksListActivity;

import javax.inject.Singleton;

import dagger.android.ContributesAndroidInjector;

public abstract class ActivityBindingModule {

    @Singleton
    @ContributesAndroidInjector(modules= {TasksListActivityModule.class})
    abstract TasksListActivity bindTaskListActivity();


}
