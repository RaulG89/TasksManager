package com.example.tasksmanager.platform.module;

import com.example.tasksmanager.ui.activity.TasksListActivity;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules= {TasksListActivityModule.class})
    abstract TasksListActivity bindTaskListActivity();


}
