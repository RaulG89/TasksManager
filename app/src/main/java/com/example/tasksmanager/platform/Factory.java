package com.example.tasksmanager.platform;

import com.example.tasksmanager.data.repository.RepositoryFactory;
import com.example.tasksmanager.data.repository.impl.RepositoryFactoryImpl;

public class Factory {

    public static RepositoryFactory getRepositories(){
        return new RepositoryFactoryImpl();
    }

}
