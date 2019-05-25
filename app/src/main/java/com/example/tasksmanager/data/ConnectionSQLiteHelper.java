package com.example.tasksmanager.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConnectionSQLiteHelper extends SQLiteOpenHelper {


    public ConnectionSQLiteHelper(@Nullable Context context,
                                  @Nullable String name,
                                  @Nullable SQLiteDatabase.CursorFactory factory,
                                  int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(DatabaseUtils.CREATE_TABLE_TASK);
        sqLiteDatabase.execSQL(DatabaseUtils.CREATE_TABLE_TECHNICIAN);
        sqLiteDatabase.execSQL(DatabaseUtils.CREATE_TABLE_CATEGORY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST task");
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST technician");
        sqLiteDatabase.execSQL("DROP TABLE IF EXIST category");
        onCreate(sqLiteDatabase);
    }
}
