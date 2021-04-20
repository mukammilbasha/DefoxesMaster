package com.mind.Defoxes;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mind.Defoxes.CLibrary.AppConstant;
import com.mind.Defoxes.Modal.LeadModal;
import com.mind.Defoxes.Interface.RetrofitAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
//import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

import com.mind.Defoxes.Modal.LoginModal ;
import com.mind.Defoxes.Modal.LeadModal;
import com.mind.Defoxes.Modal.ProfileModal;
import com.mind.Defoxes.Modal.ContactModal;

public class LeadDetails extends AppCompatActivity {

    // creating variables for our edittext,
    // button, textview and progressbar.
    private EditText nameEdt, phoneNoEdt,emailEdt,descriEdt;
    private Button Leadbtn;
    private ProgressDialog progressDialog;
    private ProgressDialog pDialog;
    ImageButton signbck;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lead_details);

        // initializing our views
        Leadbtn = findViewById(R.id.BtnLead);
        nameEdt = findViewById(R.id.txtname);
        phoneNoEdt = findViewById(R.id.txtPhone);
        emailEdt = findViewById(R.id.txtEmail);
        descriEdt = findViewById(R.id.txtDescrip);


        // adding on click listener to our button.
        Leadbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name =nameEdt.getText().toString();
                String PhoneNo =phoneNoEdt.getText().toString();
                String Email =emailEdt.getText().toString();
                String Description =descriEdt.getText().toString();

                if (!Name.isEmpty() & !PhoneNo.isEmpty() & !Email.isEmpty() & !Description.isEmpty() )
                {
                    if (Email.length() != 0) {

                        if (Email.matches(emailPattern)) {
                            AppConstant.Leadname = Name;
                            AppConstant.Leademail = Email;
                            AppConstant.Leadcontact_number = PhoneNo;
                            AppConstant.note = Description;
                            AppConstant.another_note = "test";

                            Create_ContactPost(AppConstant.name,AppConstant.email,AppConstant.contact_number);
                            Create_LeadPost(AppConstant.Leadname,AppConstant.Leademail,AppConstant.Leadcontact_number,AppConstant.note,AppConstant.another_note);
                            Create_BusinessPost( AppConstant.display_name, AppConstant.business_name, AppConstant.registered_name,AppConstant.address,AppConstant.locality,AppConstant.district,AppConstant.city,AppConstant.state,AppConstant.country,AppConstant.postal_code);

                            Intent intent = new Intent(LeadDetails.this,ProfieCreatedpage.class);
                            startActivity(intent);
                        }
                    }


                }
                else
                {
                    Toast.makeText(LeadDetails.this, "Error: Please enter the correct Details and all field's are mandatory !", Toast.LENGTH_SHORT).show();
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

    public void ShowDialog(Context context) {
        //setting up progress dialog
        progressDialog = new ProgressDialog(context);
        progressDialog.show();
//        progressDialog.setContentView(R.layout.progress_dialog);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    public void Create_ContactPost( String name, String email, String contact_number) {
        Retrofit retrofit = AppConstant.getRetrofitBuilder(AppConstant.APP_URL);
        RetrofitAPI apiService = retrofit.create(RetrofitAPI.class);

        ContactModal contact = new ContactModal(name, email, contact_number);
        Call<ContactModal> callPost = apiService.createContactPost(contact);
        callPost.enqueue(new Callback<ContactModal>() {
            @Override
            public void onResponse(Call<ContactModal> call, Response<ContactModal> response) {
                int statusCode = response.code();
                if (statusCode == 200 || statusCode == 201) {
                    Toast.makeText(LeadDetails.this, "Created Contact Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(LeadDetails.this, String.valueOf(statusCode), Toast.LENGTH_SHORT).show();
                }
                pDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ContactModal> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(LeadDetails.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Create_LeadPost( String name, String email, String contact_number,String note,String another_note) {
        Retrofit retrofit = AppConstant.getRetrofitBuilder(AppConstant.APP_URL);
        RetrofitAPI apiService = retrofit.create(RetrofitAPI.class);

        LeadModal lead = new LeadModal(name, email, contact_number,note,another_note);
        Call<LeadModal> callPost = apiService.create_leadPost(lead);
        callPost.enqueue(new Callback<LeadModal>() {
            @Override
            public void onResponse(Call<LeadModal> call, Response<LeadModal> response) {
                int statusCode = response.code();
                if (statusCode == 200 || statusCode == 201) {
                    Toast.makeText(LeadDetails.this, "Created Lead Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(LeadDetails.this, String.valueOf(statusCode), Toast.LENGTH_SHORT).show();
                }
                pDialog.dismiss();
            }

            @Override
            public void onFailure(Call<LeadModal> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(LeadDetails.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Create_BusinessPost( String display_name, String business_name, String registered_name,String address,String locality,String district,String city,String state,String country,String postal_code) {
        Retrofit retrofit = AppConstant.getRetrofitBuilder(AppConstant.APP_URL);
        RetrofitAPI apiService = retrofit.create(RetrofitAPI.class);

        ProfileModal business = new ProfileModal(display_name, business_name, registered_name,address,locality,district,city,state,country,postal_code);
        Call<ProfileModal> callPost = apiService.create_ProfilePost(business);
        callPost.enqueue(new Callback<ProfileModal>() {
            @Override
            public void onResponse(Call<ProfileModal> call, Response<ProfileModal> response) {
                int statusCode = response.code();
                if (statusCode == 200 || statusCode == 201) {
                    Toast.makeText(LeadDetails.this, "Created Business Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(LeadDetails.this, String.valueOf(statusCode), Toast.LENGTH_SHORT).show();
                }
                pDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ProfileModal> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(LeadDetails.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
