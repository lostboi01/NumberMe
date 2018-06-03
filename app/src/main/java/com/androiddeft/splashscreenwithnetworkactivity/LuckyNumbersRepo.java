package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.List;

public class LuckyNumbersRepo {


    private LuckyNumbers luckyNumbers;

    public LuckyNumbersRepo(){

        luckyNumbers = new LuckyNumbers();

    }


    public static String createTable(){
        return "CREATE TABLE " + LuckyNumbers.TABLE  + "("
                + LuckyNumbers.KEY_SId  + "  INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE,"
                + LuckyNumbers.KEY_DrawingId + " TEXT ,"
                + LuckyNumbers.KEY_Date + " TEXT ,"
                + LuckyNumbers.KEY_DrawDate + " TEXT ,"
                + LuckyNumbers.KEY_WB1 + " TEXT ,"
                + LuckyNumbers.KEY_WB2 + " TEXT ,"
                + LuckyNumbers.KEY_WB3 + " TEXT ,"
                + LuckyNumbers.KEY_WB4 + " TEXT ,"
                + LuckyNumbers.KEY_WB5 + " TEXT ,"
                + LuckyNumbers.KEY_PB + " TEXT ,"
                + LuckyNumbers.KEY_Multi + " TEXT )";
    }


    public int insert(LuckyNumbers luckyNumbers) {
        int powerBallId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(LuckyNumbers.KEY_DrawingId, luckyNumbers.getDrawingId());
        values.put(LuckyNumbers.KEY_Date, luckyNumbers.getDate());
        values.put(LuckyNumbers.KEY_DrawDate, luckyNumbers.getDrawdate());
        values.put(LuckyNumbers.KEY_WB1, luckyNumbers.getWb1());
        values.put(LuckyNumbers.KEY_WB2, luckyNumbers.getWb2());
        values.put(LuckyNumbers.KEY_WB3, luckyNumbers.getWb3());
        values.put(LuckyNumbers.KEY_WB4, luckyNumbers.getWb4());
        values.put(LuckyNumbers.KEY_WB5, luckyNumbers.getWb5());

        values.put(LuckyNumbers.KEY_PB, luckyNumbers.getPb());
        values.put(LuckyNumbers.KEY_Multi, luckyNumbers.getMulti());

        // Inserting Row
        powerBallId=(int)db.insert(LuckyNumbers.TABLE, null, values);

        DatabaseManager.getInstance().closeDatabase();

        return powerBallId;

    }



    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(LuckyNumbers.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }


    public Cursor getAllLuckyNumbers(){

        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();

        String selectQuery = "SELECT * FROM " + LuckyNumbers.TABLE;

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