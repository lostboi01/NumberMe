package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.androiddeft.splashscreenwithnetworkactivity.DatabaseManager;
import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbers;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PowerBallNumbersRepo {



    private PowerBallNumbers powerBallNumbers ;

    public PowerBallNumbersRepo(){

        powerBallNumbers = new PowerBallNumbers();

    }


    public static String createTable(){
        return "CREATE TABLE " + PowerBallNumbers.TABLE  + "("
                + PowerBallNumbers.KEY_sId  + "  INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE,"
                + PowerBallNumbers.KEY_PowerBallId + " TEXT ,"
                + PowerBallNumbers.KEY_Date + " TEXT ,"
                + PowerBallNumbers.KEY_WB1 + " TEXT ,"
                + PowerBallNumbers.KEY_WB2 + " TEXT ,"
                + PowerBallNumbers.KEY_WB3 + " TEXT ,"
                + PowerBallNumbers.KEY_WB4 + " TEXT ,"
                + PowerBallNumbers.KEY_WB5 + " TEXT ,"
                + PowerBallNumbers.KEY_PB + " TEXT ,"
                + PowerBallNumbers.KEY_Multi + " TEXT )";
    }


    public int insert(PowerBallNumbers powerBallNumbers) {
        int powerBallId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(PowerBallNumbers.KEY_PowerBallId, powerBallNumbers.getPowerBallId());
        values.put(PowerBallNumbers.KEY_Date, powerBallNumbers.getDate());
        values.put(PowerBallNumbers.KEY_WB1, powerBallNumbers.getWb1());
        values.put(PowerBallNumbers.KEY_WB2, powerBallNumbers.getWb2());
        values.put(PowerBallNumbers.KEY_WB3, powerBallNumbers.getWb3());
        values.put(PowerBallNumbers.KEY_WB4, powerBallNumbers.getWb4());
        values.put(PowerBallNumbers.KEY_WB5, powerBallNumbers.getWb5());

        values.put(PowerBallNumbers.KEY_PB, powerBallNumbers.getPb());
        values.put(PowerBallNumbers.KEY_Multi, powerBallNumbers.getMulti());

        // Inserting Row
        powerBallId=(int)db.insert(PowerBallNumbers.TABLE, null, values);

        DatabaseManager.getInstance().closeDatabase();

        return powerBallId;

    }



    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(PowerBallNumbers.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }

    public Cursor getAllPBNumbers(){

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();

        String selectQuery = "SELECT * FROM " + PowerBallNumbers.TABLE;

        try
        {
            db.beginTransaction();

            Cursor cursor = db.rawQuery(selectQuery, null);

            DatabaseManager.getInstance().closeDatabase();

            return cursor;


        } catch (Exception e) {

        }

        return null;

    }

}