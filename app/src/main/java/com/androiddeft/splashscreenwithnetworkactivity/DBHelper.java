package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.androiddeft.splashscreenwithnetworkactivity.App;
import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbers;
import com.androiddeft.splashscreenwithnetworkactivity.PurchasedTickets;
import com.androiddeft.splashscreenwithnetworkactivity.LuckyNumbers;


import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbersRepo;
import com.androiddeft.splashscreenwithnetworkactivity.PurchasedTicketsRepo;
import com.androiddeft.splashscreenwithnetworkactivity.LuckyNumbersRepo;


public class DBHelper extends SQLiteOpenHelper {


    //version number to upgrade database version
    //each time if you Add, Edit table, you need to change the
    //version number.
    private static final int DATABASE_VERSION =8;
    // Database Name
    private static final String DATABASE_NAME = "sqliteDBMultiTbl.db";
    private static final String TAG = DBHelper.class.getSimpleName().toString();

    public DBHelper( ) {
        super(App.getContext(), DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //All necessary tables you like to create will create here
        db.execSQL(PowerBallNumbersRepo.createTable());
        db.execSQL(PurchasedTicketsRepo.createTable());
        db.execSQL(LuckyNumbersRepo.createTable());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.d(TAG, String.format("SQLiteDatabase.onUpgrade(%d -> %d)", oldVersion, newVersion));

        // Drop table if existed, all data will be gone!!!
        db.execSQL("DROP TABLE IF EXISTS " + PowerBallNumbers.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + PurchasedTickets.TABLE);
        db.execSQL("DROP TABLE IF EXISTS " + LuckyNumbers.TABLE);

        onCreate(db);
    }

}