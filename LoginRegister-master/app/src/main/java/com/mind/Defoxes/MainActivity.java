package com.mind.Defoxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mind.Defoxes.Modal.LoginModal;
import com.mind.Defoxes.Interface.RetrofitAPI;
//import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
public class MainActivity extends AppCompatActivity {

    Button Loginbtn;
    ImageButton Registerbtn;
    // creating variables for our edittext,
    // button, textview and progressbar.
    private EditText usernameEdit, passwordEdit;
//    private Button postDataBtn;
    private TextView responseTV;
    private ProgressBar loadingPB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Loginbtn = findViewById(R.id.Loginbtn);
        Registerbtn = findViewById(R.id.btRegister);

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usernameEdit = findViewById(R.id.txtusername);
                passwordEdit = findViewById(R.id.txtpassword);

                if (usernameEdit.getText().toString().equals("admin") && passwordEdit.getText().toString().equals("admin")) {

                    //correcct password
                    Intent intent = new Intent(MainActivity.this, ProfieCreatedpage.class);
                    startActivity(intent);
                } else {
                    //wrong password
                    Toast.makeText(MainActivity.this, "Error: Please enter the Correct Username and Password", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

        Registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhoneNo.class);
                startActivity(intent);

            }
        });
    }
}