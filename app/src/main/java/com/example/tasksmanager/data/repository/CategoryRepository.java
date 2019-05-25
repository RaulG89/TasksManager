package com.example.tasksmanager.data.repository;

import android.content.Context;

import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.entity.Category;

import java.util.List;

public interface CategoryRepository {

    void setConnection(ConnectionSQLiteHelper connection);
    List<Category> findAllCategories();
    Long save(Category category);
    Long update(Category category);

}
