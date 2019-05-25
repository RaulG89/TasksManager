package com.example.tasksmanager.data.repository;

import android.content.Context;

import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.entity.Technician;

import java.util.List;

public interface TechnicianRepository {

    void setConnection(ConnectionSQLiteHelper connection);
    List<Technician> findAllTechnician();
    Long save(Technician technician);
    Long update(Technician technician);

}
