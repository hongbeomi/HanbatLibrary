package com.example.anhongbeom.hanbatlibrary;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ReserveListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservelist);


        TextView textView = (TextView) findViewById(R.id.listView);

        if (textView.getText().length() <= 0) {
            textView.setText(" ");
            Global global = (Global) getApplication();
            String s;
            s = global.getGlobalStr();
            textView.append(s);
            textView.setMovementMethod(new ScrollingMovementMethod());
            Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/gyeonggi.ttf");
            textView.setTypeface(typeface);
        }
        else {
            Global global = (Global) getApplication();
            String s;
            s = global.getGlobalStr();
            textView.append(s);
            textView.setMovementMethod(new ScrollingMovementMethod());
            Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/gyeonggi.ttf");
            textView.setTypeface(typeface);
        }
    }
}
