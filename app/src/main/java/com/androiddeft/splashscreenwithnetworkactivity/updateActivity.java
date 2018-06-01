package com.androiddeft.splashscreenwithnetworkactivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.androiddeft.splashscreenwithnetworkactivity.DatabaseHandler;

import java.io.File;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class updateActivity extends AppCompatActivity {

    private ListView obj;

    public TextView textView;

    private Button savetoDB;

    String FileName = "file.txt";

    File dir = new File(Environment.getExternalStoragePublicDirectory(DIRECTORY_DOWNLOADS).getAbsolutePath(), FileName);

    int num2;

    String Date;



    public static boolean isRecursionEnable = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final DatabaseHandler db = new DatabaseHandler(this);

        setContentView(R.layout.activity_update);

        textView = (TextView)findViewById(R.id.text2);

        obj = (ListView) findViewById(R.id.listView2);

        savetoDB = (Button) findViewById(R.id.saveBtn);

        final String[] values = new readFileActivity().readFile(dir).toArray(new String[0]);

        try
            {

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(updateActivity.this, android.R.layout.simple_list_item_1, values);

                obj.setAdapter(adapter);

                obj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Object listItem = obj.getItemAtPosition(position);

                        textView.setText(listItem.toString());
                    }

                });
            }

        catch (Exception e)
            {

            }
                }



    public void mainActivity(){

        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
