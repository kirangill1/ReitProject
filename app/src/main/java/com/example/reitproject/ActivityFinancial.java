package com.example.reitproject;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityFinancial extends AppCompatActivity {
TextView textView1, textView2, textView3, textView4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial);

        textView1 = (EditText) findViewById(R.id.policyno);
        textView2 = (EditText) findViewById(R.id.ins_name);
        textView3 = (EditText) findViewById(R.id.address);
        textView4 = (EditText) findViewById(R.id.email);

    }
}
