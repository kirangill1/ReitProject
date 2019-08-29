package com.example.reitproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityBilling extends AppCompatActivity {
    EditText editText1, editText2, editText3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);

        editText1 = (EditText) findViewById(R.id.bankname);
        editText2 = (EditText) findViewById(R.id.accountno);
        editText3 = (EditText) findViewById(R.id.code);
        button = (Button) findViewById(R.id.billingbutton);

        View.OnClickListener Btn_click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String bankname = editText1.getText().toString();
                String accountno = editText2.getText().toString();
                String code = editText3.getText().toString();

                if (bankname.length() < 8) {
                    Toast.makeText(ActivityBilling.this, "Re-enter Bank Name ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (accountno.length() < 15) {
                    Toast.makeText(ActivityBilling.this, "Re-enter Accont number", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (code.length() < 11) {
                    Toast.makeText(ActivityBilling.this, "Re-enter IFSC code", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
        };
        button.setOnClickListener(Btn_click);
    }
}