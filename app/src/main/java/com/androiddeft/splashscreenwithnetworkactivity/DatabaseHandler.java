package com.androiddeft.splashscreenwithnetworkactivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.androiddeft.splashscreenwithnetworkactivity.tickets;
import com.androiddeft.splashscreenwithnetworkactivity.values;

public class DatabaseHandler extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "PowerBallNums";

    private static final String TAG = DatabaseHandler.class.getSimpleName().toString();
    // Table Name
    private static final String TABLE_NAME = "PowerBallNums";



    // Table Columns names
    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String WB1 = "wb1";
    public static final String WB2 = "wb2";
    public static final String WB3 = "wb3";
    public static final String WB4 = "wb4";
    public static final String WB5 = "wb5";
    public static final String PB = "pb";
    public static final String MULTIPLIER = "multiplier";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE;

        CREATE_CONTACTS_TABLE = "create table " + TABLE_NAME + "("
                + ID + " integer primary key autoincrement, "
                + DATE + " text not null unique, "
                + WB1 + " text not null, "
                + WB2 + " text not null, "
                + WB3 + " text not null, "
                + WB4 + " text not null, "
                + WB5 + " text not null, "
                + PB + " text not null, "
                + MULTIPLIER + " text not null)";

        db.execSQL(CREATE_CONTACTS_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(db);

    }


    void add(values lang) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(DATE, lang.getValue()); // Set Date of Drawing

        values.put(WB1, lang.getWb1()); // Set WhiteBall 1

        values.put(WB2, lang.getWb2()); // Set WhiteBall 2

        values.put(WB3, lang.getWb3()); // Set WhiteBall 3

        values.put(WB4, lang.getWb4()); // Set WhiteBall 4

        values.put(WB5, lang.getWb5()); // Set WhiteBall 5

        values.put(PB, lang.getPb()); // Set PowerBall Number

        values.put(MULTIPLIER, lang.getMulti()); // Set Multiplier


        db.insert(TABLE_NAME, null, values); // Inserting Row into Database Table

        db.close(); // Closing database connection
    }





    public Cursor getAllNumbers(){

        String selectQuery = "SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery(selectQuery, null);

        return cursor;
    }
}