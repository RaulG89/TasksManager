package com.example.tasksmanager.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tasksmanager.R;
import com.example.tasksmanager.data.entity.Task;
import com.example.tasksmanager.ui.BaseFragment;
import com.example.tasksmanager.ui.presentation.contract.TasksListContract;

import java.util.List;

public class TasksListFragment extends BaseFragment implements TasksListContract.View {

    TasksListContract.Presenter presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    protected void initViews() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        layoutId = R.layout.fragment_tasks_list;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(int message) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showTasks(List<Task> tasks) {

    }

    @Override
    public void setPresenter(TasksListContract.Presenter presenter) {

    }
}
