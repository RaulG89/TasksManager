package com.example.tasksmanager.ui.presentation.presenter;

import com.example.tasksmanager.domain.usecase.GetTasks;
import com.example.tasksmanager.ui.presentation.contract.TasksListContract;


public class TasksListPresenter implements TasksListContract.Presenter {

    private GetTasks getTasks;
    private TasksListContract.View tasksListView;

    public TasksListPresenter(GetTasks getTasks, TasksListContract.View tasksListView) {
        this.getTasks=getTasks;
        this.tasksListView=tasksListView;
    }

    @Override
    public void getTasks() {
        tasksListView.showLoading();
        tasksListView.showTasks(
                getTasks.execute()
        );
    }

    @Override
    public void start() {
        getTasks();
        tasksListView.hideLoading();
    }

    @Override
    public void stop() {
        tasksListView.hideLoading();

    }
}
