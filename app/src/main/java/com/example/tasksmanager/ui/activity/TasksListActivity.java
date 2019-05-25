package com.example.tasksmanager.ui.activity;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.tasksmanager.R;
import com.example.tasksmanager.ui.fragment.TaskDetailsFragment;
import com.example.tasksmanager.ui.fragment.TasksListFragment;

public class TasksListActivity extends AppCompatActivity {

    private Fragment listFragment;
    private Fragment detailsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);
        listFragment = new TasksListFragment();
        detailsFragment = new TaskDetailsFragment();
    }

    private void loadListFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,
                listFragment,
                TasksListFragment.class.getCanonicalName());
        fragmentTransaction.commit();
    }

    private void loadDetailsFragment(){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,
                detailsFragment,
                TaskDetailsFragment.class.getCanonicalName());
        fragmentTransaction.commit();
    }

}
