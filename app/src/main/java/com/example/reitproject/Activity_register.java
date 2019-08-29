package com.example.reitproject;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_register extends AppCompatActivity {
    TextView textView;
    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText1 = (EditText) findViewById(R.id.name);
        editText2 = (EditText) findViewById(R.id.mobile);
        editText3 = (EditText) findViewById(R.id.address);
        editText4 = (EditText) findViewById(R.id.email);
        editText5 = (EditText) findViewById(R.id.id);
        editText6 = (EditText) findViewById(R.id.pass);
        editText7 = (EditText) findViewById(R.id.confirmpass);
        button = (Button) findViewById(R.id.submit);


        View.OnClickListener Btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText1.getText().toString();
                String mobile = editText2.getText().toString();
                String address = editText3.getText().toString();
                String email = editText4.getText().toString();
                String id = editText5.getText().toString();
                String pass = editText6.getText().toString();
                String confirmpass = editText7.getText().toString();

                if (name.equals("")) {
                    Toast.makeText(Activity_register.this, "enter the name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (mobile.length() < 10) {
                    Toast.makeText(Activity_register.this, "re-enter the mobile ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    Toast.makeText(Activity_register.this, "enter valid email", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (pass.length() < 8) {
                    Toast.makeText(Activity_register.this, "enter password atleast eight digit", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (confirmpass.equals("")) {
                    Toast.makeText(Activity_register.this, "enter the confirm password", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (address.equals("")) {
                    Toast.makeText(Activity_register.this, "enter the address", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!confirmpass.equals(pass)) {
                    Toast.makeText(Activity_register.this, "password do not match", Toast.LENGTH_SHORT).show();
                    return;
                }


            }
        };
        button.setOnClickListener(Btn_click);


    }
}
