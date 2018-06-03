package com.androiddeft.splashscreenwithnetworkactivity;

import android.app.Activity;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;

import com.androiddeft.splashscreenwithnetworkactivity.drawNumbers.drawNumbersActivity;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class SplashActivity extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 30000;

    private long refid;

    String FileName = "file.txt";

    File dir = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS).getAbsolutePath(), FileName);

    ArrayList<Long> list = new ArrayList<>();


    final drawNumbersActivity drawNumbersActivity = new drawNumbersActivity();



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        drawNumbersActivity.insertData();


        if(dir.exists()){

            SPLASH_TIME_OUT = 30000;

        }

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {

                if (!dir.exists()) {

                    try {

                        list.clear();

                        Uri uri = Uri.parse("http://192.168.1.22/winnumsText.txt");

                        DownloadManager downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);

                        registerReceiver(onComplete, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));

                        DownloadManager.Request request = new DownloadManager.Request(uri);

                        request.setVisibleInDownloadsUi(true);

                        request.setDestinationInExternalPublicDir(DIRECTORY_DOWNLOADS, FileName);

                        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED).setVisibleInDownloadsUi(true);

                        refid = downloadManager.enqueue(request);

                        list.add(refid);


                    } catch (Exception e) {

                    }
                }

                // Recurse through NumbersFile | parse to Database
                final String[] values = new readFileActivity().readFile(dir).toArray(new String[0]);

                int k = 0;

                for (String s : values) {

                    ++k;

                    String[] str = s.split(" \\|");

                    String num1 = str[1];

                    PowerBallNumbersRepo powerBallNumbersRepo = new PowerBallNumbersRepo();

                    PowerBallNumbers powerBallNumbers = new PowerBallNumbers();
                    powerBallNumbers.setPowerBallId(String.valueOf(k));
                    powerBallNumbers.setDate(str[0]);
                    powerBallNumbers.setWb1(str[1]);
                    powerBallNumbers.setWb2(str[2]);
                    powerBallNumbers.setWb3(str[3]);
                    powerBallNumbers.setWb4(str[4]);
                    powerBallNumbers.setWb5(str[5]);

                    powerBallNumbers.setPb(str[6]);
                    powerBallNumbers.setMulti(str[7]);
                    powerBallNumbersRepo.insert(powerBallNumbers);

                }


                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this, MainActivity.class);

                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }


    BroadcastReceiver onComplete = new BroadcastReceiver() {

        @Override
        public void onReceive(Context context, Intent intent) {

            // get the refid from the download manager
            long referenceId = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1);

            // remove it from the list
            list.remove(referenceId);

            // if list is empty means all downloads completed
            if (list.isEmpty()) {

                // show a notification
                Log.e("INSIDE", "" + referenceId);

                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(SplashActivity.this)
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("NumberMe Download")
                        .setContentText("All Download completed");

                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(455, mBuilder.build());
            }
        }
    };


}