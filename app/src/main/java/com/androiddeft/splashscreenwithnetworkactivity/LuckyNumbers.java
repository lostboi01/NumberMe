package com.androiddeft.splashscreenwithnetworkactivity;

public class LuckyNumbers {

    public static final String TAG = LuckyNumbers.class.getSimpleName();
    public static final String TABLE = "LuckyNumbers";
    // Labels Table Columns names
    public static final String KEY_SId = "SId";
    public static final String KEY_DrawingId = "DrawingId";
    public static final String KEY_Date = "Date";

    public static final String KEY_DrawDate = "DrawDate";

    public static final String KEY_WB1 = "WB1";
    public static final String KEY_WB2 = "WB2";
    public static final String KEY_WB3 = "WB3";
    public static final String KEY_WB4 = "WB4";
    public static final String KEY_WB5 = "WB5";

    public static final String KEY_PB = "PB";
    public static final String KEY_Multi = "Multi";


    private String sId;
    private String drawingId;
    private String date;
    private String drawdate;
    private String wb1;
    private String wb2;
    private String wb3;
    private String wb4;
    private String wb5;

    private String pb;
    private String multi;


    public String getSId() {
        return sId;
    }

    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getDrawingId() {
        return drawingId;
    }

    public void setDrawingId(String drawingId) {
        this.drawingId = drawingId;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDrawdate() {
        return drawdate;
    }

    public void setDrawdate(String drawdate) {
        this.drawdate = drawdate;
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
