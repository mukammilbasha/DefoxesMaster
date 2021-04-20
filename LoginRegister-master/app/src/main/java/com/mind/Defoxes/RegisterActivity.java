package com.mind.Defoxes;

import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    Button ResiBtn;

    // creating variables for our edittext,
    // button, textview and progressbar.
    private EditText EmailEdit, userNamEdit, PsswrdEdi, RetyPsswrdEdit;
    private Button signbtn;
    private TextView responseTV;
    private ProgressBar loadingPB;

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_residential_details);
//
//        ResiBtn = findViewById(R.id.ResiBtn);
//
//        ResiBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(RegisterActivity.this,Profile.class);
//                startActivity(intent);
//            }
//        });
//
//        // initializing our views
//        EmailEdit = findViewById(R.id.txtEmail);
//        userNamEdit = findViewById(R.id.txtuserNam);
//        PsswrdEdi = findViewById(R.id.txtPsswrd);
//        RetyPsswrdEdit = findViewById(R.id.txtRetyPsswrd);
//
//        // adding on click listener to our button.
//        signbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // validating if the text field is empty or not.
//                if (EmailEdit.getText().toString().isEmpty() && userNamEdit.getText().toString().isEmpty() && PsswrdEdi.getText().toString().isEmpty() && RetyPsswrdEdit.getText().toString().isEmpty()) {
//                    Toast.makeText(RegisterActivity.this, "Please enter all the values", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//                // calling a method to post the data and passing our name and job.
//                postData(EmailEdit.getText().toString(), userNamEdit.getText().toString(), PsswrdEdi.getText().toString(), RetyPsswrdEdit.getText().toString());
//            }
//        });
//    }
//
//
//
//    private void postData(String EmailAPI, String userNamAPI,String PsswrdAPI, String RetyPsswrdAPI) {
//        // below line is for displaying our progress bar.
//        loadingPB.setVisibility(View.VISIBLE);
//
//        // on below line we are creating a retrofit
//        // builder and passing our base url
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://reqres.in/api/")
//                // as we are sending data in json format so
//                // we have to add Gson converter factory
//                .addConverterFactory(GsonConverterFactory.create())
//                // at last we are building our retrofit builder.
//                .build();
//        // below line is to create an instance for our retrofit api class.
//        RegisterAPI RegisterAPI = retrofit.create(RegisterAPI.class);
//
//        // passing data from our text fields to our modal class.
//        RegisterModal modal = new RegisterModal(EmailAPI, userNamAPI, PsswrdAPI, RetyPsswrdAPI);
//
//        // calling a method to create a post and passing our modal class.
//        Call<RegisterModal> call = RegisterAPI.createPost(modal);
//
//        // on below line we are executing our method.
//        call.enqueue(new Callback<RegisterModal>() {
//            @Override
//            public void onResponse(Call<RegisterModal> call, Response<RegisterModal> response) {
//                // this method is called when we get response from our api.
//                Toast.makeText(RegisterActivity.this, "Data added to API", Toast.LENGTH_SHORT).show();
//
//                // below line is for hiding our progress bar.
//                loadingPB.setVisibility(View.GONE);
//
//                // on below line we are setting empty text
//                // to our both edit text.
////                usernameEdit.setText("");
////                passwordEdit.setText("");
//                EmailEdit.setText("");
//                userNamEdit.setText("");
//                PsswrdEdi.setText("");
//                RetyPsswrdEdit.setText("");
//
//                // we are getting response from our body
////                // and passing it to our modal class.
////                RegisterModal responseFromAPI = response.body();
////
////                // on below line we are getting our data from modal class and adding it to our string.
////                String responseString = "Response Code : " + response.code() + "\nUserName : " + responseFromAPI.getUserName() + "\n" + "password : " + responseFromAPI.getpassword();
////
////                // below line we are setting our
////                // string to our text view.
////                responseTV.setText(responseString);
//            }
//
//            @Override
//            public void onFailure(Call<RegisterModal> call, Throwable t) {
//                // setting text to our text view when
//                // we get error response from API.
//                responseTV.setText("Error found is : " + t.getMessage());
//            }
//        });
//
//    }
}

//    private RelativeLayout rlayout;
//    private Animation animation;
//    Button signbtn;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
//        Toolbar toolbar = findViewById(R.id.bgHeader);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        signbtn = findViewById(R.id.signbtn);
//        signbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(RegisterActivity.this,ContactDetails.class);
//                startActivity(intent);
//            }
//        });
//
//        rlayout = findViewById(R.id.rlayout);
//        animation = AnimationUtils.loadAnimation(this,R.anim.uptodowndiagonal);
//        rlayout.setAnimation(animation);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case android.R.id.home :
//                onBackPressed();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}
