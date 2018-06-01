package com.androiddeft.splashscreenwithnetworkactivity.winningsTotal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.androiddeft.splashscreenwithnetworkactivity.R;
import com.androiddeft.splashscreenwithnetworkactivity.winningsTotal.capitalInvestedActivity;
import com.androiddeft.splashscreenwithnetworkactivity.winningsTotal.displayTotalActivity;
import com.androiddeft.splashscreenwithnetworkactivity.winningsTotal.profitGainedActivity;
import com.androiddeft.splashscreenwithnetworkactivity.winningsTotal.winningsHistoryActivity;


import java.io.InputStream;

public class winningsTotalActivity extends AppCompatActivity {

    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winnings_total);

        imageView2 = findViewById(R.id.imageView2);

        InputStream inputStream = getResources().openRawResource(R.raw.winningstotal);

        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

        imageView2.setImageBitmap(bitmap);
    }

    public void capitalInvested(View view){

        Intent intent = new Intent(this, capitalInvestedActivity.class);

        startActivity(intent);
    }

    public void profitGained(View view){

        Intent intent = new Intent(this, profitGainedActivity.class);

        startActivity(intent);
    }

    public void displayTotal(View view){

        Intent intent = new Intent(this, displayTotalActivity.class);

        startActivity(intent);
    }

    public void winningsHistory(View view){

        Intent intent = new Intent(this, winningsHistoryActivity.class);

        startActivity(intent);
    }
}
