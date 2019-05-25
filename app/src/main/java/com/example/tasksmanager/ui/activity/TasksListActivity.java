package com.example.tasksmanager.ui.activity;

import android.os.Bundle;

import com.example.tasksmanager.R;

import dagger.android.support.DaggerAppCompatActivity;

public class TasksListActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);
    }


}
