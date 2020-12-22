package com.example.startup;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConnectDB extends SQLiteOpenHelper {

    private SQLiteDatabase db;


    public ConnectDB(Context context) {
        super(context, "School", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table students (id integer primary key autoIncrement ,name varchar(30) , surname varchar(30) , age int , classroom varchar(30))");
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public List<Student> read() {
        Cursor c = this.getReadableDatabase().query("students", null, null, null, null, null, null, null);

        Student student = null;
        Student student1 = null;
        Student student2 = null;

        List<Student> list = new LinkedList<>();


        if (c.moveToNext()) {
            student = new Student(c.getString(1), c.getString(2), c.getString(3), c.getInt(4), c.getInt(0));
            student1 = new Student(c.getString(2), c.getString(1), c.getString(2), c.getInt(3), c.getInt(0));
            student2 = new Student(c.getString(2), c.getString(1), c.getString(2), c.getInt(3), c.getInt(0));
        }
        list.add(student);
        list.add(student1);
        list.add(student2);
        return list;
    }

    public void add(String name, String surname, int age, String classroom) {
        ContentValues values = new ContentValues();
        values.put("name", name);
        values.put("surname", surname);
        values.put("age", age);
        values.put("classroom", classroom);
        this.getWritableDatabase().insert("students", null, values);
    }


}
