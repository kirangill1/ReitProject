package com.example.reitproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_login extends AppCompatActivity {
   TextView textView;
    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         textView = (TextView) findViewById(R.id.forgetpass) ;
        button1 = (Button) findViewById(R.id.register);
        button2 = (Button) findViewById(R.id.login);

        View.OnClickListener Btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
            public void register(View v){

                Intent i = new Intent(Activity_login.this ,Activity_register.class);
                startActivity(i);
            }

            public void login(View v){

                Intent i = new Intent(Activity_login.this ,Activity_login.class);
                startActivity(i);
            }
        };
    }
}
