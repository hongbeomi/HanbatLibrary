package com.example.anhongbeom.hanbatlibrary;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ReserveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        Button goBook1 = (Button)findViewById(R.id.book1);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/gyeonggi.ttf");
        goBook1.setTypeface(typeface);

        goBook1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("골든아워1\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook2 = (Button)findViewById(R.id.book2);
        goBook2.setTypeface(typeface);

        goBook2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("12가지 인생의 법칙\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();

            }
        });

        Button goBook3 = (Button)findViewById(R.id.book3);
        goBook3.setTypeface(typeface);

        goBook3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("트렌드 코리아 2019\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook4 = (Button)findViewById(R.id.book4);
        goBook4.setTypeface(typeface);

        goBook4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("골든아워2\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook5 = (Button)findViewById(R.id.book5);
        goBook5.setTypeface(typeface);

        goBook5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("수미네 반찬\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook6 = (Button)findViewById(R.id.book6);
        goBook6.setTypeface(typeface);

        goBook6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("죽고 싶지만 떡볶이는 먹고 싶어\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook7 = (Button)findViewById(R.id.book7);
        goBook7.setTypeface(typeface);

        goBook7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("나는 나로 살기로 했다\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

        Button goBook8 = (Button)findViewById(R.id.book8);
        goBook8.setTypeface(typeface);

        goBook8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("설민석의 한국사 대모험 8\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });
        Button goBook9 = (Button)findViewById(R.id.book9);
        goBook9.setTypeface(typeface);

        goBook9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global global = (Global) getApplication();
                global.setGlobalStr("돌이킬 수 없는 약속\n");
                Toast.makeText(getApplicationContext(),"예약 완료!",Toast.LENGTH_SHORT).show();
            }
        });

    }


}
