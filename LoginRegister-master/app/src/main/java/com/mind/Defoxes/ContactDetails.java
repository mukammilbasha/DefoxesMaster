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

public class ContactDetails extends AppCompatActivity {

    Button contactbtn;
    ImageButton signbck;
    private EditText PhNoEdt;
    private EditText EmailEdt;
    private EditText NameEdt;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        clear();
        contactbtn = findViewById(R.id.contactbtn);
        PhNoEdt = findViewById(R.id.txtPhoneNo);
        NameEdt = findViewById(R.id.txtName);
        EmailEdt = findViewById(R.id.txtEmailAddress);

        String phonenumber = getIntent().getStringExtra("keyname");
        PhNoEdt.setText(AppConstant.contact_number);

        contactbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name =NameEdt.getText().toString();
                String Email =EmailEdt.getText().toString();
                String contact_number =PhNoEdt.getText().toString();

                if (!Name.isEmpty() & !Email.isEmpty() & !contact_number.isEmpty()  )
                {
                    if (Email.length() != 0) {

                        if (Email.matches(emailPattern)) {
                            AppConstant.name = Name;
                            AppConstant.email = Email;
//                            AppConstant.contact_number = contact_number;
                            Intent intent = new Intent(ContactDetails.this,ResidentialDetails.class);
                            startActivity(intent);
                        }
                    }


                }
                else
                {
                    Toast.makeText(ContactDetails.this, "Error: Please enter the correct Name, Email Address !", Toast.LENGTH_SHORT).show();
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
    public void clear() {
        NameEdt.requestFocus();
        NameEdt.setText("");
        EmailEdt.setText("");
        PhNoEdt.setText("");

    }
}
