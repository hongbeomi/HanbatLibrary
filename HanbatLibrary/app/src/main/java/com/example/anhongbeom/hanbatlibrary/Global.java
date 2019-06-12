package com.example.anhongbeom.hanbatlibrary;

import android.app.Application;

public class Global extends Application {
    private String GlobalStr = "";

    public String getGlobalStr(){
        return GlobalStr;
    }

    public void  setGlobalStr(String globalStr){
        this.GlobalStr += globalStr;
    }

}
