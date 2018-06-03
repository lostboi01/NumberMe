package com.androiddeft.splashscreenwithnetworkactivity.drawNumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.R;

import com.androiddeft.splashscreenwithnetworkactivity.LuckyNumbers;
import com.androiddeft.splashscreenwithnetworkactivity.LuckyNumbersRepo;

import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbers;
import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbersRepo;

import com.androiddeft.splashscreenwithnetworkactivity.PurchasedTickets;
import com.androiddeft.splashscreenwithnetworkactivity.PurchasedTicketsRepo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class drawNumbersActivity extends AppCompatActivity implements View.OnClickListener {

    int whiteBallmin = 1;
    int whiteBallmax = 69;

    int powerBallmin = 1;
    int powerBallmax = 26;


    private String WB1;
    private String WB2;
    private String WB3;
    private String WB4;
    private String WB5;

    private String PB;
    private String MULTI;

    Button saveBtn;


    public static final String TAG = drawNumbersActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_draw_numbers);

            saveBtn = (Button) findViewById(R.id.saveBtn);

            saveBtn.setOnClickListener(this);

            

        }


    public void perform_action(View v)
    {

        List whiteBalls = new ArrayList<>();

        List powerBall = new ArrayList<>();


        for(int i = 0; i < 5; i++) {

            Random r = new Random();

            int randomNumber = r.nextInt(( whiteBallmax - whiteBallmin) + whiteBallmin);

            whiteBalls.add(randomNumber);
        }

        for(int i = 0; i < 1; i++) {

            Random r = new Random();

            int randomNumber = r.nextInt(( powerBallmax - powerBallmin) + powerBallmin);

            powerBall.add(randomNumber);
        }

        TextView wb1 = (TextView) findViewById(R.id.WB1);

        TextView wb2 = (TextView) findViewById(R.id.WB2);

        TextView wb3 = (TextView) findViewById(R.id.WB3);

        TextView wb4 = (TextView) findViewById(R.id.WB4);

        TextView wb5 = (TextView) findViewById(R.id.WB5);

        TextView pb = (TextView) findViewById(R.id.PB);

        wb1.setText(String.valueOf(whiteBalls.get(0)));

        wb2.setText(String.valueOf(whiteBalls.get(1)));

        wb3.setText(String.valueOf(whiteBalls.get(2)));

        wb4.setText(String.valueOf(whiteBalls.get(3)));

        wb5.setText(String.valueOf(whiteBalls.get(4)));

        pb.setText(String.valueOf(powerBall.get(0)));

        LuckyNumbersRepo luckyNumbersRepo = new LuckyNumbersRepo();

        LuckyNumbers luckyNumbers = new LuckyNumbers();
        luckyNumbers.setDrawingId("2");
        luckyNumbers.setDate("06/02/2018");
        luckyNumbers.setDrawdate("06/06/2018");
        luckyNumbers.setWb1(whiteBalls.get(0).toString().trim());
        luckyNumbers.setWb2(whiteBalls.get(1).toString().trim());
        luckyNumbers.setWb3(whiteBalls.get(2).toString().trim());
        luckyNumbers.setWb4(whiteBalls.get(3).toString().trim());
        luckyNumbers.setWb5(whiteBalls.get(4).toString().trim());

        luckyNumbers.setPb(powerBall.get(0).toString().trim());
        luckyNumbers.setMulti("2");
        luckyNumbersRepo.insert(luckyNumbers);

        WB1 = whiteBalls.get(0).toString().trim();
        WB2 = whiteBalls.get(1).toString().trim();
        WB3 = whiteBalls.get(2).toString().trim();
        WB4 = whiteBalls.get(3).toString().trim();
        WB5 = whiteBalls.get(4).toString().trim();

        PB = powerBall.get(0).toString().trim();

        MULTI = "3";


    }

    public void insertData(){

        PowerBallNumbersRepo powerBallNumbersRepo = new PowerBallNumbersRepo();
        PurchasedTicketsRepo purchasedTicketsRepo = new PurchasedTicketsRepo();
        LuckyNumbersRepo luckyNumbersRepo = new LuckyNumbersRepo();

        powerBallNumbersRepo.delete();
        purchasedTicketsRepo.delete();
        luckyNumbersRepo.delete();

        PowerBallNumbers powerBallNumbers = new PowerBallNumbers();
        //powerBallNumbers.setsId("1");
        powerBallNumbers.setPowerBallId("2");
        powerBallNumbers.setDate("06/06/2018");
        powerBallNumbers.setWb1("22");
        powerBallNumbers.setWb2("55");
        powerBallNumbers.setWb3("55");
        powerBallNumbers.setWb4("55");
        powerBallNumbers.setWb5("55");

        powerBallNumbers.setPb("5");
        powerBallNumbers.setMulti("2");
        powerBallNumbersRepo.insert(powerBallNumbers);




        PurchasedTickets purchasedTickets = new PurchasedTickets();
        //purchasedTickets.setSId("1");
        purchasedTickets.setTicketId("2");
        purchasedTickets.setDate("06/06/2018");
        purchasedTickets.setWb1("22");
        purchasedTickets.setWb2("55");
        purchasedTickets.setWb3("55");
        purchasedTickets.setWb4("55");
        purchasedTickets.setWb5("55");

        purchasedTickets.setPb("5");
        purchasedTickets.setMulti("2");
        purchasedTicketsRepo.insert(purchasedTickets);


        LuckyNumbers luckyNumbers = new LuckyNumbers();
        //luckyNumbers.setSId("1");
        luckyNumbers.setDrawingId("2");
        luckyNumbers.setDate("06/02/2018");
        luckyNumbers.setDrawdate("06/06/2018");
        luckyNumbers.setWb1("33");
        luckyNumbers.setWb2("43");
        luckyNumbers.setWb3("12");
        luckyNumbers.setWb4("1");
        luckyNumbers.setWb5("19");

        luckyNumbers.setPb("15");
        luckyNumbers.setMulti("2");
        luckyNumbersRepo.insert(luckyNumbers);

    }

    @Override
    public void onClick(View view) {

        PurchasedTicketsRepo purchasedTicketsRepo = new PurchasedTicketsRepo();

        PurchasedTickets purchasedTickets = new PurchasedTickets();
        //purchasedTickets.setSId("1");
        purchasedTickets.setTicketId("2");
        purchasedTickets.setDate("06/06/2018");
        purchasedTickets.setWb1(WB1);
        purchasedTickets.setWb2(WB2);
        purchasedTickets.setWb3(WB3);
        purchasedTickets.setWb4(WB4);
        purchasedTickets.setWb5(WB5);

        purchasedTickets.setPb(PB);
        purchasedTickets.setMulti("2");
        purchasedTicketsRepo.insert(purchasedTickets);

    }
}
