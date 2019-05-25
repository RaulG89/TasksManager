package com.example.tasksmanager.ui.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.tasksmanager.R;
import com.example.tasksmanager.ui.BaseFragment;

public class TasksListFragment extends BaseFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutId = R.layout.fragment_tasks_list;
    }

    @Override
    protected void initViews() {

    }
}
