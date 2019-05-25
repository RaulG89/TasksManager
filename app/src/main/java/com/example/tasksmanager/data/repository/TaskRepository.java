package com.example.tasksmanager.data.repository;

import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.entity.Task;

import java.util.List;

public interface TaskRepository {

    void setConnection(ConnectionSQLiteHelper connection);
    List<Task> findAllTasks();
    Long save(Task task);
    Task update(Task task);

}
