package com.example.reitproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPassword extends AppCompatActivity implements View.OnClickListener {
    EditText editText1, editText2, editText3;
    Button button1, button2;
    int pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        editText1 = (EditText) findViewById(R.id.enteremail);
        editText2 = (EditText) findViewById(R.id.enterphone);
        editText3 = (EditText) findViewById(R.id.enterotp);
        button1 = (Button) findViewById(R.id.sendotp);
        button2 = (Button) findViewById(R.id.submitotp);

    }

    @Override
    public void onClick(View view) {
        editText3.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);

    }

    public void clickotp(View view) {

        final String email =editText1.getText().toString();
        final String phone =editText2.getText().toString();
        final String otp =editText3.getText().toString();


        if ( email.equals("") || phone.equals("")) {
            Toast.makeText(ActivityPassword.this, "please enter your email or phone number", Toast.LENGTH_SHORT).show();
            return;
        }
        if ( !email.equals("") || !phone.equals("")) {
            int pin =   (int)(Math.random()*9000)+1000 ;
            Toast.makeText(ActivityPassword.this,pin,Toast.LENGTH_SHORT);

        }

        if(otp.equals(pin))
        {
            Intent i = new Intent(ActivityPassword.this , ActivityPasswordChange.class);

            startActivity(i);
            finish();
        }
        else {
            Toast.makeText(ActivityPassword.this, "invalid otp", Toast.LENGTH_SHORT).show();


        }

    }
}





