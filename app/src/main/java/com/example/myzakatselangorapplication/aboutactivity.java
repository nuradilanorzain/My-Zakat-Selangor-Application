package com.example.myzakatselangorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class aboutactivity extends AppCompatActivity {

    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
        textview = findViewById(R.id.TextViewLink);
        textview.setMovementMethod(LinkMovementMethod.getInstance());

    }
}


