package com.androiddeft.splashscreenwithnetworkactivity.winningsTotal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.R;
import com.androiddeft.splashscreenwithnetworkactivity.SplashActivity;
import com.androiddeft.splashscreenwithnetworkactivity.datesActivity;

import java.util.Date;

public class profitGainedActivity extends AppCompatActivity {

    private TextView profitsGained;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profit_gained);

        String line = matchDrawingDate() + " \n\n " + matchingNumbers() + " \n\n " + totalTicketCost()  + " \n\n " + amountWon();

        profitsGained = findViewById(R.id.profitsGained);

        profitsGained.setText(line);
    }

    public String matchDrawingDate(){

        String date = new datesActivity().getDate().toString();

        return date;
    }

    public String matchingNumbers(){

        String matchingNumbers = " Matching Numbers ";

        return matchingNumbers;
    }

    public String totalTicketCost(){

        String totalTicketCost = " $34.00 ";

        return totalTicketCost;
    }

    public String amountWon(){

        String amountWon = " $500.00 ";

        return amountWon;
    }
}
