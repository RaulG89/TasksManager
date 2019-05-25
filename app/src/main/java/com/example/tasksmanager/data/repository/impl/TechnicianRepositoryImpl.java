package com.example.tasksmanager.data.repository.impl;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tasksmanager.Utils.DateConverter;
import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.DatabaseUtils;
import com.example.tasksmanager.data.entity.Technician;
import com.example.tasksmanager.data.repository.TechnicianRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TechnicianRepositoryImpl implements TechnicianRepository {

    private ConnectionSQLiteHelper connectionSQLiteHelper;

    @Override
    public void setConnection(ConnectionSQLiteHelper connection) {
        this.connectionSQLiteHelper = connection;
    }

    @Override
    public List<Technician> findAllTechnician() {
        SQLiteDatabase database = connectionSQLiteHelper.getReadableDatabase();
        @SuppressLint("Recycle")
        Cursor cursor = database.rawQuery("SELECT * " +
                "FROM " + DatabaseUtils.TECHNICIAN_TABLE,null);
        List<Technician> technicianList = new ArrayList<>();
        Technician technician;
        while(cursor.moveToNext()){
            technician = new Technician();
            technician.setId(cursor.getInt(0));
            technician.setName(cursor.getString(1));
            technician.setSurname(cursor.getString(3));
            technicianList.add(technician);
        }
        return technicianList;
    }

    @Override
    public Long save(Technician technician) {
        SQLiteDatabase database = connectionSQLiteHelper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DatabaseUtils.NAME_FIELD,technician.getName());
        values.put(DatabaseUtils.TECHNICIAN_ID_FIELD, technician.getSurname());
        Long resultId = database.insert(DatabaseUtils.TECHNICIAN_TABLE,DatabaseUtils.ID_FIELD,values);
        return resultId;
    }

    @Override
    public Long update(Technician technician) {
        return null;
    }
}
