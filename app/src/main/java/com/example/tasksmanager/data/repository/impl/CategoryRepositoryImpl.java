package com.example.tasksmanager.data.repository.impl;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.tasksmanager.Utils.DateConverter;
import com.example.tasksmanager.data.ConnectionSQLiteHelper;
import com.example.tasksmanager.data.DatabaseUtils;
import com.example.tasksmanager.data.entity.Category;
import com.example.tasksmanager.data.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {

    private ConnectionSQLiteHelper connectionSQLiteHelper;
    private DateConverter dateConverter;

    @Override
    public void setConnection(ConnectionSQLiteHelper connection) {
        this.connectionSQLiteHelper = connection;
    }

    @Override
    public List<Category> findAllCategories() {
        SQLiteDatabase database = connectionSQLiteHelper.getReadableDatabase();
        @SuppressLint("Recycle")
        Cursor cursor = database.rawQuery("SELECT * " +
                "FROM " + DatabaseUtils.TECHNICIAN_TABLE,null);
        List<Category> categoryList = new ArrayList<>();
        Category category;
        while(cursor.moveToNext()){
            category = new Category();
            category.setId(cursor.getInt(0));
            category.setName(cursor.getString(1));
            categoryList.add(category);
        }
        return categoryList;
    }

    @Override
    public Long save(Category category) {
        SQLiteDatabase database = connectionSQLiteHelper.getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put(DatabaseUtils.NAME_FIELD,category.getName());
        Long resultId = database.insert(DatabaseUtils.CATEGORY_TABLE,DatabaseUtils.ID_FIELD,values);
        return resultId;
    }

    @Override
    public Long update(Category category) {
        return null;
    }
}
