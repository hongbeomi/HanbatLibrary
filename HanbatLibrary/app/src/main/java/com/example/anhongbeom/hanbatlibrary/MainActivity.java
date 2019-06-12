package com.example.anhongbeom.hanbatlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Global globals = (Global) getApplication();
        globals.setGlobalStr(" ");
    }
        public void goMap(View target) {
            Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
            startActivity(intent); }
        public void goReserv(View target) {
            Intent intent = new Intent(getApplicationContext(),ReserveActivity.class);
            startActivity(intent);
        }
        public void goReservL(View target) {
            Intent intent = new Intent(getApplicationContext(),ReserveListActivity.class);
            startActivity(intent);
        }
}
