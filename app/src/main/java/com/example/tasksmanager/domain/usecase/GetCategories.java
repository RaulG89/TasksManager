package com.example.tasksmanager.domain.usecase;

import android.content.Context;

import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.DatabaseUtils;
import com.example.tasksmanager.data.entity.Category;
import com.example.tasksmanager.data.repository.CategoryRepository;
import com.example.tasksmanager.domain.UseCase;
import com.example.tasksmanager.platform.Factory;

import java.util.List;

public class GetCategories implements UseCase<List<Category>> {

    private ConnectionSQLiteHelper connectionSQLiteHelper;
    private CategoryRepository categoryRepository;

    public GetCategories(Context context) {
        this.connectionSQLiteHelper =
                new ConnectionSQLiteHelper(context,
                        DatabaseUtils.DATABASE,
                        null,
                        1);
        this.categoryRepository = Factory.getRepositories().getCategoryRepository();
    }

    @Override
    public List<Category> execute() {
        return categoryRepository.findAllCategories();
    }
}
