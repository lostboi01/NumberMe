package com.androiddeft.splashscreenwithnetworkactivity;

public class PowerBallNumbers {

    public static final String TAG = PowerBallNumbers.class.getSimpleName();
    public static final String TABLE = "PowerBallNumbers";
    // Labels Table Columns names
    public static final String KEY_sId = "SId";
    public static final String KEY_PowerBallId = "PowerBallId";
    public static final String KEY_Date = "Date";

    public static final String KEY_WB1 = "WB1";
    public static final String KEY_WB2 = "WB2";
    public static final String KEY_WB3 = "WB3";
    public static final String KEY_WB4 = "WB4";
    public static final String KEY_WB5 = "WB5";

    public static final String KEY_PB = "PB";
    public static final String KEY_Multi = "Multi";

    private String sId;
    private String powerBallId;
    private String date;
    private String wb1;
    private String wb2;
    private String wb3;
    private String wb4;
    private String wb5;

    private String pb;
    private String multi;




    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getPowerBallId() {
        return powerBallId;
    }

    public void setPowerBallId(String powerBallId) {
        this.powerBallId = powerBallId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getWb1() {
        return wb1;
    }

    public void setWb1(String wb1) {
        this.wb1 = wb1;
    }

    public String getWb2() {
        return wb2;
    }

    public void setWb2(String wb2) {
        this.wb2 = wb2;
    }

    public String getWb3() {
        return wb3;
    }

    public void setWb3(String wb3) {
        this.wb3 = wb3;
    }

    public String getWb4() {
        return wb4;
    }

    public void setWb4(String wb4) {
        this.wb4 = wb4;
    }

    public String getWb5() {
        return wb5;
    }

    public void setWb5(String wb5) {
        this.wb5 = wb5;
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb;
    }

    public String getMulti() {
        return multi;
    }

    public void setMulti(String multi) {
        this.multi = multi;
    }


}