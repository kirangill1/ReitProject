package com.example.reitproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public abstract class ActivityPasswordChange extends AppCompatActivity implements View.OnClickListener {
    EditText editText1, editText2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_change);
        editText1 = (EditText) findViewById(R.id.newpass);
        editText2 = (EditText) findViewById(R.id.confirmpass);
        button1 = (Button)findViewById(R.id.passbutton);


    }
    public void change_pass(View v) {
        final String pass = editText1.getText().toString();

        String confirm_pass = editText2.getText().toString();

        if (pass.equals("")) {
            Toast.makeText(ActivityPasswordChange.this, "please enter your password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (confirm_pass.equals("")) {
            Toast.makeText(ActivityPasswordChange.this, "please confirm password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!pass.equals(confirm_pass)) {
            Toast.makeText(ActivityPasswordChange.this, "password and confirm password does not match", Toast.LENGTH_SHORT).show();
            return;
        }

    }
}
