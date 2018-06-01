package com.androiddeft.splashscreenwithnetworkactivity;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static android.os.Environment.DIRECTORY_DOWNLOADS;


public class datesActivity extends AppCompatActivity {

    public Date currentDate;

    public Date saturdayDraw;

    public Date wednesdayDraw;

    Date date = new Date();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    public String getDate(){

        DateFormat dataFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", Locale.US);

        Calendar calendar = Calendar.getInstance();

        String line = dataFormat.format(date);

        return line;
    }

    public Date getSaturdayDraw(){

        Calendar saturday = Calendar.getInstance();

        saturday.set(Calendar.MINUTE, 00);

        saturday.set(Calendar.HOUR_OF_DAY, 23);

        int satDraw = saturday.get(Calendar.DAY_OF_WEEK);

        if (satDraw != Calendar.SATURDAY)
            {
                // calculate how much to add
                // the 2 is the difference between Saturday and Monday

                int days = (Calendar.SUNDAY - satDraw - 1) % 7;

                saturday.add(Calendar.DAY_OF_YEAR, days);

                saturdayDraw = saturday.getTime();
            }
                if(date.getTime() != Calendar.SUNDAY)
                    {
                        int days = (Calendar.SUNDAY - satDraw + 3) % 7;

                        saturday.add(Calendar.DAY_OF_YEAR, days);

                        saturdayDraw = saturday.getTime();
                    }

            return saturdayDraw;
    }

    public Date getWednesdayDraw(){

        Calendar wednesday = Calendar.getInstance();

        wednesday.set(Calendar.MINUTE, 00);

        wednesday.set(Calendar.HOUR_OF_DAY, 23);

        int wedDraw = wednesday.get(Calendar.DAY_OF_WEEK);

        if (wedDraw != Calendar.WEDNESDAY)
            {
                // calculate how much to add
                // the 2 is the difference between Saturday and Monday

                int days = (Calendar.SUNDAY - wedDraw - 7) % 7;

                wednesday.add(Calendar.DAY_OF_YEAR, days);

                wednesdayDraw = wednesday.getTime();
            }

            if(date.getTime() != Calendar.SUNDAY)
                {
                   int days = (Calendar.SUNDAY - wedDraw + 3) % 7;

                   wednesday.add(Calendar.DAY_OF_YEAR, days);

                   wednesdayDraw = wednesday.getTime();
                }

        return wednesdayDraw;
    }

    public Date getCurrentFileDate(){

        String FileName = "file.txt";

        File currentTxt = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS).getAbsolutePath(), FileName);

        Date lastDownload = new Date(currentTxt.lastModified());

        currentDate = lastDownload;

        return currentDate;

    }

    /*
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy", Locale.ENGLISH);

            //String strDate = format.format(Date);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

            //String strDate2 = formatter.format(Date.toString());

             */
}
