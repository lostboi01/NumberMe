package com.androiddeft.splashscreenwithnetworkactivity.winningsTotal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.R;

public class winningsHistoryActivity extends AppCompatActivity {

    private TextView winningsHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_winnings_history);

        String line = winningNumbersHistory() + " - " + matchingNumbersDescription();
        winningsHistory = findViewById(R.id.winningsHistory);

        winningsHistory.setText(line);
    }

    public String winningNumbersHistory(){

        String winningNumbers = " 34 ";

        return winningNumbers;
    }

    public String matchingNumbersDescription(){

        String matchingNumbersDescription = " Matching Numbers Description ";

        return matchingNumbersDescription;
    }
}
