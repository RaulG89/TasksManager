package com.example.tasksmanager.ui.presentation.contract;

import com.example.tasksmanager.data.entity.Task;
import com.example.tasksmanager.ui.presentation.BasePresenter;
import com.example.tasksmanager.ui.presentation.BaseView;

import java.util.List;

public interface TasksListContract {

    interface View extends BaseView<Presenter> {
        void showLoading();
        void hideLoading();
        void showMessage(int message);
        void showError(String message);
        void showTasks(List<Task> tasks);
    }

    interface Presenter extends BasePresenter {
        void getTasks();
    }
}
