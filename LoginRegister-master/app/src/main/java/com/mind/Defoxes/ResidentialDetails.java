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

public class ResidentialDetails extends AppCompatActivity {
    Button Residentialbtn;
    ImageButton signbck;
    private EditText AddressEdt;
    private EditText LocalityEdt;
    private EditText DistrictEdt;
    private EditText CityEdt;
    private EditText StateEdt;
    private EditText CountryEdt;
    private EditText Postal_codeEdt;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residential_details);
//        clear();
        Residentialbtn = findViewById(R.id.ResiBtn);
        AddressEdt = findViewById(R.id.txtAddress);
        LocalityEdt = findViewById(R.id.txtline2);
        DistrictEdt = findViewById(R.id.txtcity_district);
        CityEdt = findViewById(R.id.txtcity_district);
        StateEdt = findViewById(R.id.txtstate);
        CountryEdt = findViewById(R.id.txtcountry);
        Postal_codeEdt = findViewById(R.id.txtpostalcode);


        Residentialbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Address =AddressEdt.getText().toString();
                String Locality =LocalityEdt.getText().toString();
                String District =DistrictEdt.getText().toString();
                String City =CityEdt.getText().toString();
                String State =StateEdt.getText().toString();
                String Country =CountryEdt.getText().toString();
                String Postal_code =Postal_codeEdt.getText().toString();

                if (!Address.isEmpty() & !Locality.isEmpty() & !District.isEmpty() & !City.isEmpty() & !State.isEmpty() & !Country.isEmpty() & !Postal_code.isEmpty())
                {
                    AppConstant.address = Address;
                    AppConstant.locality = Locality;
                    AppConstant.district = District;
                    AppConstant.city = City;
                    AppConstant.state = State;
                    AppConstant.country = Country;
                    AppConstant.postal_code = Postal_code;
                    Intent intent = new Intent(ResidentialDetails.this,Profile.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(ResidentialDetails.this, "Error: Please enter the correct Details and all field's are mandatory !", Toast.LENGTH_SHORT).show();
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