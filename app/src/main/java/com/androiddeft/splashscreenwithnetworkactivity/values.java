package com.androiddeft.splashscreenwithnetworkactivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public final class values {

    private int id;
    private String value;
    private String wb1;
    private String wb2;
    private String wb3;
    private String wb4;
    private String wb5;
    private String pb;
    private String multi;

    public values() {
        super();
    }

    public values(String value, String wb1, String wb2, String wb3, String wb4, String wb5, String pb, String multi) {
        super();
        this.value = value;
        this.wb1 = wb1;
        this.wb2 = wb2;
        this.wb3 = wb3;
        this.wb4 = wb4;
        this.wb5 = wb5;
        this.pb = pb;
        this.multi = multi;
        }

    public values(int id, String value, String wb1, String wb2, String wb3, String wb4, String wb5, String pb, String multi) {
        super();
        this.id = id;
        this.value = value;
        this.wb1 = wb1;
        this.wb2 = wb2;
        this.wb3 = wb3;
        this.wb4 = wb4;
        this.wb5 = wb5;
        this.pb = pb;
        this.multi = multi;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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