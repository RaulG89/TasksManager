package com.example.tasksmanager.data.repository.impl;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tasksmanager.Utils.DateConverter;
import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.DatabaseUtils;
import com.example.tasksmanager.data.entity.Task;
import com.example.tasksmanager.data.repository.TaskRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskRepositoryImpl implements TaskRepository {

    private ConnectionSQLiteHelper connectionSQLiteHelper;
    private DateConverter dateConverter;

    public TaskRepositoryImpl() {
        this.dateConverter = new DateConverter();
    }

    @Override
    public void setConnection(ConnectionSQLiteHelper connection) {
        this.connectionSQLiteHelper = connection;
    }

    @Override
    public List<Task> findAllTasks() {
        SQLiteDatabase database = connectionSQLiteHelper.getReadableDatabase();
        @SuppressLint("Recycle")
        Cursor cursor = database.rawQuery("SELECT * " +
                "FROM " + DatabaseUtils.TASK_TABLE,null);
        List<Task> taskList = new ArrayList<>();
        Task task;
        while(cursor.moveToNext()){
            task = new Task();
            task.setId(cursor.getInt(0));
            task.setName(cursor.getString(1));
            task.setStartDate(new Date(cursor.getString(2)));
            task.setFinalizationDate(new Date(cursor.getString(3)));
            task.setDescription(cursor.getString(4));
            task.setAnotation(cursor.getString(5));
            taskList.add(task);
        }
        return taskList;
    }

    @Override
    public Long save(Task task) {
        SQLiteDatabase database = connectionSQLiteHelper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DatabaseUtils.NAME_FIELD,task.getName());
        values.put(DatabaseUtils.START_DATE_FIELD,
                dateConverter.dateToStringWithHour(task.getStartDate()));
        values.put(DatabaseUtils.FINALIZATION_DATE_FIELD,
                dateConverter.dateToStringWithHour(task.getFinalizationDate()));
        values.put(DatabaseUtils.DESCRIPTION_FIELD, task.getDescription());
        values.put(DatabaseUtils.ANOTATION_FIELD, task.getAnotation());
        values.put(DatabaseUtils.TECHNICIAN_ID_FIELD, task.getTechnicianId());
        values.put(DatabaseUtils.CATEGORY_ID_FIELD, task.getCategoryId());

        Long resultId = database.insert(DatabaseUtils.TASK_TABLE,DatabaseUtils.ID_FIELD,values);

        return resultId;
    }

    @Override
    public Task update(Task task) {
        SQLiteDatabase database = connectionSQLiteHelper.getWritableDatabase();

        return null;
    }
}
