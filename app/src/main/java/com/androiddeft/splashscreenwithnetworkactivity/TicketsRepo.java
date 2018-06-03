package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.androiddeft.splashscreenwithnetworkactivity.DatabaseManager;
import com.androiddeft.splashscreenwithnetworkactivity.tickets;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TicketsRepo {

    private tickets tickets;

    public TicketsRepo(){
        tickets = new tickets();
    }

    public static String createTable(){

        return "CREATE TABLE" + com.androiddeft.splashscreenwithnetworkactivity.tickets.TABLE + "("
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.ID + " integer primary key autoincrement, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.DATE + " text not null unique, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.WB1 + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.WB2 + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.WB3 + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.WB4 + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.WB5 + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.PB + " text not null, "
                + com.androiddeft.splashscreenwithnetworkactivity.tickets.MULTIPLIER + " text not null)";
    }

    public void insert(tickets tickets) {
        int courseId;
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        ContentValues values = new ContentValues();
        values.put(tickets.WB1, tickets.getWb1());
        values.put(tickets.WB2, tickets.getWb2());
        values.put(tickets.WB3, tickets.getWb3());
        values.put(tickets.WB4, tickets.getWb4());
        values.put(tickets.WB5, tickets.getWb5());
        values.put(tickets.PB, tickets.getPb());
        values.put(tickets.MULTIPLIER, tickets.getMulti());

        // Inserting Row
        db.insert(tickets.TABLE, null, values);
        DatabaseManager.getInstance().closeDatabase();


    }



    public void delete( ) {
        SQLiteDatabase db = DatabaseManager.getInstance().openDatabase();
        db.delete(tickets.TABLE,null,null);
        DatabaseManager.getInstance().closeDatabase();
    }
}
