package com.androiddeft.splashscreenwithnetworkactivity.winningNumbers;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.PowerBallNumbersRepo;
import com.androiddeft.splashscreenwithnetworkactivity.R;

import java.util.ArrayList;


public class winningNumbersActivity extends AppCompatActivity {

    ListView obj;

    public TextView textView;

    PowerBallNumbersRepo powerBallNumbersRepo = new PowerBallNumbersRepo();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_winning_numbers);

        textView = (TextView)findViewById(R.id.text2);

        obj = (ListView) findViewById(R.id.listView2);

        ArrayList<String> theList = new ArrayList<>();


        try
        {

            Cursor result = powerBallNumbersRepo.getAllPBNumbers();

            if(result.getCount() == 0) {

            }else {
                StringBuffer buffer = new StringBuffer();
                while (result.moveToNext()) {
                    theList.add(result.getString(0) + result.getString(1) +
                            result.getString(2) + result.getString(3) + result.getString(4) +
                            result.getString(5) + result.getString(6) +result.getString(7));

                    }
            }


        }

                catch (Exception e)
                {

                }

        ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, theList);

        obj.setAdapter(listAdapter);

        obj.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Object listItem = obj.getItemAtPosition(position);

                textView.setText(listItem.toString());
            }

        });

    }
}
