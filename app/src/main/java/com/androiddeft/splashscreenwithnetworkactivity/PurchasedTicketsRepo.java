package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class PurchasedTicketsRepo {



    private PurchasedTickets purchasedTickets ;

    public PurchasedTicketsRepo(){


        purchasedTickets = new PurchasedTickets();

    }


    public static String createTable(){
        return "CREATE TABLE " + PurchasedTickets.TABLE  + "("
                + PurchasedTickets.KEY_SId  + "  INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE ,"
                + PurchasedTickets.KEY_TicketId + " TEXT ,"
                + PurchasedTickets.KEY_Date + " TEXT ,"
                + PurchasedTickets.KEY_WB1 + " TEXT ,"
                + PurchasedTickets.KEY_WB2 + " TEXT ,"
                + PurchasedTickets.KEY_WB3 + " TEXT ,"
                + PurchasedTickets.KEY_WB4 + " TEXT ,"
                + PurchasedTickets.KEY_WB5 + " TEXT ,"
                + PurchasedTickets.KEY_PB + " TEXT ,"
                + PurchasedTickets.KEY_Multi + " TEXT )";
    }


    public int insert(PurchasedTickets purchasedTickets) {
        int powerBallId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(PurchasedTickets.KEY_TicketId, purchasedTickets.getTicketId());
        values.put(PurchasedTickets.KEY_Date, purchasedTickets.getDate());
        values.put(PurchasedTickets.KEY_WB1, purchasedTickets.getWb1());
        values.put(PurchasedTickets.KEY_WB2, purchasedTickets.getWb2());
        values.put(PurchasedTickets.KEY_WB3, purchasedTickets.getWb3());
        values.put(PurchasedTickets.KEY_WB4, purchasedTickets.getWb4());
        values.put(PurchasedTickets.KEY_WB5, purchasedTickets.getWb5());

        values.put(PurchasedTickets.KEY_PB, purchasedTickets.getPb());
        values.put(PurchasedTickets.KEY_Multi, purchasedTickets.getMulti());

        // Inserting Row
        powerBallId=(int)db.insert(PurchasedTickets.TABLE, null, values);

        DatabaseManager.getInstance().closeDatabase();

        return powerBallId;

    }



    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(PurchasedTickets.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }

}