package com.example.gourmet_go;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ForgotIDActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText phoneEditText;
    private Button findIDButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_idactivity);

        nameEditText = findViewById(R.id.nameEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        findIDButton = findViewById(R.id.findIDButton);

        findIDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String phone = phoneEditText.getText().toString();

                if (name.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(ForgotIDActivity.this, "Please enter your name and phone number.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ForgotIDActivity.this, "Finding ID...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}