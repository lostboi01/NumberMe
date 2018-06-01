package com.androiddeft.splashscreenwithnetworkactivity;

import com.androiddeft.splashscreenwithnetworkactivity.winningNumbers.winningNumbersActivity;
import com.androiddeft.splashscreenwithnetworkactivity.winningsTotal.winningsTotalActivity;
import com.androiddeft.splashscreenwithnetworkactivity.numbersPlayed.numbersPlayedActivity;
import com.androiddeft.splashscreenwithnetworkactivity.drawNumbers.drawNumbersActivity;
import com.androiddeft.splashscreenwithnetworkactivity.editNumbers.editNumbersActivity;
import com.androiddeft.splashscreenwithnetworkactivity.setting.settingsActivity;



import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        InputStream imageStream = getResources().openRawResource(R.raw.chart);

        Bitmap bitmap = BitmapFactory.decodeStream(imageStream);
        //Bitmap resizedBitmap = Bitmap.createScaledBitmap(bitmap, 450, 200, false);

        imageView.setImageBitmap(bitmap);
    }

    public void winningsTotal(View view){

        Intent intent = new Intent(MainActivity.this, winningsTotalActivity.class);

        startActivity(intent);
    }


    public void winningNumbers(View view) {

        Intent intent = new Intent(this, winningNumbersActivity.class);

        startActivity(intent);
    }


    public void numbersPlayed (View view) {

        Intent intent = new Intent(this, numbersPlayedActivity.class);

        startActivity(intent);
    }


    public void drawNumbers (View view) {

        Intent intent = new Intent(this, drawNumbersActivity.class);

        startActivity(intent);
    }


    public void editNumbers (View view) {

        Intent intent = new Intent(this, editNumbersActivity.class);

        startActivity(intent);
    }


    public void settings (View view) {

        Intent intent = new Intent(this, settingsActivity.class);

        startActivity(intent);
    }
}
