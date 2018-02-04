package com.example.dell.waterquality;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText usernameEditText,passwordEditText;
    TextView forgotPasswordTextView;
    Button signinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = (EditText)findViewById(R.id.usernameEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        signinButton = (Button)findViewById(R.id.signinButton);
        forgotPasswordTextView = (TextView)findViewById(R.id.forgotPasswordTextView);

        validateUser();


    }

    public void validateUser()
    {
        if(usernameEditText.getText().toString()== "")
            Toast.makeText(getApplicationContext(),"Please enter username",Toast.LENGTH_LONG).show();
        if(passwordEditText.getText().toString()=="")
            Toast.makeText(getApplicationContext(),"Please enter password",Toast.LENGTH_LONG).show();

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitUserDetails();
            }
        });


    }

    public void submitUserDetails()
    {
        Intent intent = new Intent(LoginActivity.this,SensorDataActivity.class);
        startActivity(intent);
    }


}
