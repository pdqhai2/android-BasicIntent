package com.example.intentbasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        EditText editText = findViewById(R.id.editText);
        editText.setShowSoftInputOnFocus(false);
        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                intent.putExtra("message", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}