package com.mind.Defoxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mind.Defoxes.CLibrary.AppConstant;

public class Profile extends AppCompatActivity {

    Button Profilebtn;
    ImageButton signbck;

    // creating variables for our edittext,
    // button, textview and progressbar.
    private EditText BusinessNameEdt, RegisterNameEdt, DisplayNameEdt;
    private CheckBox ChkPro1, ChkPro2 ;
    private Button Probtn;
    private TextView responseTV;
    private ProgressBar loadingPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Profilebtn = findViewById(R.id.BtnProfile);
        // initializing our views
        BusinessNameEdt = findViewById(R.id.txtBusipro);
        RegisterNameEdt = findViewById(R.id.txtRegispro);
        ChkPro1 = findViewById(R.id.checkbox1Pro);
        ChkPro2 = findViewById(R.id.checkbox2Pro);

        Profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display_name ="";
                String business_name =BusinessNameEdt.getText().toString();
                String registered_name =RegisterNameEdt.getText().toString();

                if (!business_name.isEmpty() & !registered_name.isEmpty() ) {
                    AppConstant.business_name = business_name;
                    AppConstant.registered_name = registered_name;
                    if (ChkPro1.isChecked()) {
                        AppConstant.display_name = AppConstant.name;
                    }
                    else if (ChkPro2.isChecked()) {
                        AppConstant.display_name = business_name;
                    }
                    else
                    {
                        AppConstant.display_name = display_name;
                    }


                    Intent intent = new Intent(Profile.this, LeadDetails.class);
                    startActivity(intent);
                }

                else
                {
                    Toast.makeText(Profile.this, "Error: Please enter the correct Details and all field's are mandatory !", Toast.LENGTH_SHORT).show();
                    return;
                }
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

}