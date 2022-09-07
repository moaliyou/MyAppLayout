package com.example.myapplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class StartActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplayout.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText edtName = findViewById(R.id.edtName);
        String name = edtName.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, name);
        startActivity(intent);
    }

}