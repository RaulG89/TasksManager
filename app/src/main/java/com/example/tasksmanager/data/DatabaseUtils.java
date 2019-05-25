package com.example.tasksmanager.data;

import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseUtils {

    //Database
    public static final String DATABASE ="db_task_manager";

    //Constants
    public static final String TASK_TABLE="task";
    public static final String TECHNICIAN_TABLE="technician";
    public static final String CATEGORY_TABLE="category";

    //Common constants
    public static final String ID_FIELD="id";
    public static final String NAME_FIELD="name";

    //Constants Task table
    public static final String START_DATE_FIELD="start_date";
    public static final String FINALIZATION_DATE_FIELD="finalization_date";
    public static final String DESCRIPTION_FIELD="description";
    public static final String ANOTATION_FIELD="description";
    public static final String TECHNICIAN_ID_FIELD="technician_id";
    public static final String CATEGORY_ID_FIELD="category_id";

    //Constants Technician table
    public static final String SURNAME_FIELD="surname";

    public static final String CREATE_TABLE_TASK=
            "CREATE TABLE " + TASK_TABLE +  " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME_FIELD + " TEXT, " +
                    START_DATE_FIELD + " DATE, " +
                    FINALIZATION_DATE_FIELD + " DATE, " +
                    DESCRIPTION_FIELD + " TEXT, " +
                    ANOTATION_FIELD + " TEXT, " +
                    TECHNICIAN_ID_FIELD + " INTEGER, " +
                    CATEGORY_ID_FIELD + " INTEGER)";

    public static final String CREATE_TABLE_TECHNICIAN=
            "CREATE TABLE " + TECHNICIAN_TABLE +  " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME_FIELD + " TEXT, " +
                    SURNAME_FIELD + " TEXT)";

    public static final String CREATE_TABLE_CATEGORY=
            "CREATE TABLE " + CATEGORY_TABLE +  " (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    NAME_FIELD + " TEXT)";



}
