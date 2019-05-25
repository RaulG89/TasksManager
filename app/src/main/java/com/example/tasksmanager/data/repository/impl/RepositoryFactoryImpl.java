package com.example.tasksmanager.data.repository.impl;

import com.example.tasksmanager.data.repository.CategoryRepository;
import com.example.tasksmanager.data.repository.RepositoryFactory;
import com.example.tasksmanager.data.repository.TaskRepository;
import com.example.tasksmanager.data.repository.TechnicianRepository;

public class RepositoryFactoryImpl implements RepositoryFactory {

    @Override
    public TaskRepository getTaskRepository() {
        return new TaskRepositoryImpl();
    }

    @Override
    public TechnicianRepository getTechnicianRepository() {
        return new TechnicianRepositoryImpl();
    }

    @Override
    public CategoryRepository getCategoryRepository() {
        return new CategoryRepositoryImpl();
    }

}
