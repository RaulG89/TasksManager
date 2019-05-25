package com.example.tasksmanager.data.repository;

public interface RepositoryFactory {

    TaskRepository getTaskRepository();
    TechnicianRepository getTechnicianRepository();
    CategoryRepository getCategoryRepository();

}
