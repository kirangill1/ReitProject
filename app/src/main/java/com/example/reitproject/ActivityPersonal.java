package com.example.reitproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPersonal extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5 ,editText6 , editText7, editText8, editText9;
    CheckBox audioP1, photoP1, audioP2, photoP2, audioP3, photoP3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        editText1 = (EditText) findViewById(R.id.name);
        editText2 = (EditText) findViewById(R.id.name2);
        editText3 = (EditText) findViewById(R.id.name3);
        editText4 = (EditText) findViewById(R.id.contact);
       editText5= (EditText) findViewById(R.id.contact2);
        editText6= (EditText) findViewById(R.id.contact3);
        editText7= (EditText) findViewById(R.id.address);
        editText8= (EditText) findViewById(R.id.address2);
        editText9= (EditText) findViewById(R.id.address3);
        button = (Button) findViewById(R.id.button);
        audioP1=(CheckBox)findViewById(R.id.checkbox_audioP1) ;
        audioP2=(CheckBox)findViewById(R.id.checkbox_audioP2) ;
        audioP3=(CheckBox)findViewById(R.id.checkbox_audioP3) ;
        photoP1=(CheckBox)findViewById(R.id.checkbox_photoP1) ;
        photoP2=(CheckBox)findViewById(R.id.checkbox_photoP2) ;
        photoP3=(CheckBox)findViewById(R.id.checkbox_photoP3) ;

        View.OnClickListener Btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = editText1.getText().toString();
                String name2 = editText2.getText().toString();
                String name3 = editText3.getText().toString();
                String contact = editText4.getText().toString();
                String contact2 = editText5.getText().toString();
                String contact3 = editText6.getText().toString();
                String address = editText7.getText().toString();
                String address2 = editText8.getText().toString();
                String address3 = editText9.getText().toString();

                if (name.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (contact.length() < 10) {
                    Toast.makeText(ActivityPersonal.this, "re-enter the contact ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (address.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the address", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (name2.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (contact2.length() < 10) {
                    Toast.makeText(ActivityPersonal.this, "re-enter the contact ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (address2.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the address", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (name3.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (contact3.length() < 10) {
                    Toast.makeText(ActivityPersonal.this, "re-enter the contact ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (address3.equals("")) {
                    Toast.makeText(ActivityPersonal.this, "enter the address", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        };
        button.setOnClickListener(Btn_click);

    } ;


    public void onCheckboxClicked(View view) {


        String answer = "";
        if (audioP1.isChecked()) {
            answer = audioP1.getText().toString();
        }
        if (audioP2.isChecked()) {
            answer = audioP2.getText().toString();
        }
        if (audioP3.isChecked()) {
            answer = audioP3.getText().toString();
        }
        if (photoP1.isChecked()) {
            answer = photoP1.getText().toString();
        }
        if (photoP2.isChecked()) {
            answer = photoP2.getText().toString();
        }
        if (audioP3.isChecked()) {
            answer = audioP3.getText().toString();
        }


    }
}
