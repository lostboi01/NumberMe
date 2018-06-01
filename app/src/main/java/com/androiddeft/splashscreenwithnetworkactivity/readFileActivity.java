package com.androiddeft.splashscreenwithnetworkactivity;

import android.app.ListActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readFileActivity extends ListActivity {

    public ArrayList<String> fileList = new ArrayList<String>();

    public String drawDate;
    public String wb1;
    public String wb2;
    public String wb3;
    public String wb4;
    public String wb5;
    public String pb;
    public String multiplier;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    public ArrayList<String> readFile(File dir) {

        String setText = null;
        try {
            BufferedReader buffreader = new BufferedReader(new BufferedReader(new FileReader(dir)));

            if (buffreader != null) try {

                buffreader.readLine();

                String line;
                while ((line = buffreader.readLine()) != null) {

                    String[] columns = line.split("\\s+");

                    drawDate = columns[0];

                    wb1 = columns[1];

                    wb2 = columns[2];

                    wb3 = columns[3];

                    wb4 = columns[4];

                    wb5 = columns[5];

                    pb = columns[6];


                    String code = columns[0] + " | " + columns[1] + " | " + columns[2] + " | " + columns[3] + " | " + columns[4] + " | " + columns[5] + " | " + columns[6];

                    String Test = null;
                    for (String s : columns) {

                        multiplier = s;

                        Test = code + " | " + s;
                    }

                    fileList.add(Test);
                }

                buffreader.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return fileList;
    }


}
