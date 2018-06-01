package com.androiddeft.splashscreenwithnetworkactivity.winningsTotal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.R;

import java.io.InputStream;

public class capitalInvestedActivity extends AppCompatActivity {

    private TextView capitalInvested;

    public String ticketsPurchased = "test";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital_invested);

        capitalInvested = findViewById(R.id.capitalInvested);

        InputStream inputStream = getResources().openRawResource(R.raw.winningstotal);

        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

        String description = ticketsPurchased() + " | " + numbersDrawn() + " | " + numberofDrawings() + " | " + totalTicketsCost();

        capitalInvested.setText(description);
    }

    public String ticketsPurchased (){

        String ticketsPurchased = "2018/02/16";

        return ticketsPurchased;
    }


    public int totalTicketsCost (){

        int totalTicketsCost = 10;

        return totalTicketsCost;
    }

    public String numbersDrawn(){

        String numbersDrawn = "03 14 23 45 56 PB: 7";

        return numbersDrawn;
    }

    public int numberofDrawings(){

        int numberofDrawings = 5;

        return numberofDrawings;
    }



}
