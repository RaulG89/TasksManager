package com.example.tasksmanager.Utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {
    private DateFormat dateFormat;

    public String dateToString(Date date) {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public String dateToStringWithHour(Date date) {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return dateFormat.format(date);
    }

    public String dateToStringOnlyHour(Date date) {
        dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(date);
    }

    public Date stringToDate(String date) throws ParseException {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.parse(date);
    }

    public Date stringToDateOnlyHour(String date) throws ParseException {
        dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.parse(date);
    }

    public Date stringToDateWithoutYear(String date) throws ParseException {
        dateFormat = new SimpleDateFormat("dd-MM");
        return dateFormat.parse(date);
    }

    public Date stringToDateWithHour(String date) throws ParseException {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return dateFormat.parse(date);
    }

    public boolean compareTwoDatesWithoutYear(Date first, Date second) {
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(first);
        int firstMonth = calendar.get(Calendar.MONTH);
        int firstDay = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(second);
        int secondMonth = calendar.get(Calendar.MONTH);
        int secondDay = calendar.get(Calendar.DAY_OF_MONTH);
        return (firstMonth == secondMonth) && (firstDay == secondDay);
    }
}
