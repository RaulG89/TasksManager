package com.example.tasksmanager.domain.usecase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.DatabaseUtils;
import com.example.tasksmanager.data.entity.Task;
import com.example.tasksmanager.data.repository.TaskRepository;
import com.example.tasksmanager.domain.UseCase;
import com.example.tasksmanager.platform.Factory;

import java.util.List;

public class GetTasks implements UseCase<List<Task>> {

    private ConnectionSQLiteHelper connectionSQLiteHelper;
    private TaskRepository taskRepository;

    public GetTasks(Context context) {
        this.connectionSQLiteHelper =
                new ConnectionSQLiteHelper(context,
                        DatabaseUtils.DATABASE,
                        null,
                        1);
        this.taskRepository = Factory.getRepositories().getTaskRepository();
    }

    @Override
    public List<Task> execute() {
        return taskRepository.findAllTasks();
    }
}
