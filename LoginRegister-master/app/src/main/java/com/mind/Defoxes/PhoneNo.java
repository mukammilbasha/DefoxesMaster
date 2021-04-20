package com.mind.Defoxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.mind.Defoxes.CLibrary.AppConstant;
public class PhoneNo extends AppCompatActivity {

    Button Probtn;
    private EditText numberphone;
    ImageButton signbck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_no);

        Probtn = findViewById(R.id.Probtn);
        numberphone = findViewById(R.id.PhoneNum);
        clear();
        Probtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Transfer Data to Contact page

                String contact_number =numberphone.getText().toString();


                if (!contact_number.isEmpty() & contact_number.length()>=10 )
                {
                    AppConstant.contact_number = contact_number;
                    Intent intent = new Intent(PhoneNo.this,ContactDetails.class);
                    intent.putExtra("keynum",contact_number );
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(PhoneNo.this, "Error: Please enter the Valid Phone No !", Toast.LENGTH_SHORT).show();
                    return;
                }
                    // Goes to next Page

            }
        });

        ImageButton ib = (ImageButton)findViewById(R.id.signbck);
        ib.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void clear() {
        numberphone.requestFocus();
        numberphone.setText("");
    }



}

