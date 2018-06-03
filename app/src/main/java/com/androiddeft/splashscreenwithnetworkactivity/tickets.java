package com.androiddeft.splashscreenwithnetworkactivity;

public class tickets {

    public static final String TAG = tickets.class.getSimpleName();
    public static final String TABLE = "Tickets";
    // Labels Table Columns names
    public static final String KEY_TicketId = "TicketId";
    public static final String KEY_Name = "Name";

    public static final String ID = "id";
    public static final String DATE = "date";
    public static final String WB1 = "wb1";
    public static final String WB2 = "wb2";
    public static final String WB3 = "wb3";
    public static final String WB4 = "wb4";
    public static final String WB5 = "wb5";
    public static final String PB = "pb";
    public static final String MULTIPLIER = "multiplier";



    private int id;
    private String date;
    private String wb1;
    private String wb2;
    private String wb3;
    private String wb4;
    private String wb5;
    private String pb;
    private String multi;


public tickets(){

}

    public String getId() {
        return ID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return date;
    }

    public void setValue(String value) {
        this.date = date;
    }

    public String getWb1(){
        return wb1;
    }

    public void setWb1(String wb1) {
        this.wb1 = wb1;
    }

    public String getWb2(){
        return wb2;
    }

    public void setWb2(String wb2) {
        this.wb2 = wb2;
    }

    public String getWb3(){
        return wb3;
    }

    public void setWb3(String wb3) {
        this.wb3 = wb3;
    }

    public String getWb4(){
        return wb4;
    }

    public void setWb4(String wb4) {
        this.wb4 = wb4;
    }

    public String getWb5(){
        return wb5;
    }

    public void setWb5(String wb5) {
        this.wb5 = wb5;
    }

    public String getPb(){
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getMulti(){
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }

}
