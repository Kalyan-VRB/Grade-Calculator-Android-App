package com.example.project2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class creditsDatabase extends SQLiteOpenHelper {
    public creditsDatabase(Context context) {
        super(context,"Details.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table Credits (courseID TEXT primary key,courseName TEXT,couseYear INT,courseSem INT,credit  INT)");
    }
    public Boolean insertcredits(String courseID,String courseName, int courseYear,int courseSem,int credit ){
        SQLiteDatabase DB=this.getReadableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("CS111",courseID);
        contentValues.put("M1",courseName);
        contentValues.put(String.valueOf(1),courseYear);
        contentValues.put(String.valueOf(1),courseSem);
        contentValues.put(String.valueOf(3),credit);
            long test = DB.insert("Details", null, contentValues);
            if (test == -1)
                return false;
            else
                return true;
        }



    public Cursor getData(String courseID){
        SQLiteDatabase DB=this.getWritableDatabase();
        Cursor cursor=DB.rawQuery("Select * from Details",null);
        return cursor;


    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {

    }
}
