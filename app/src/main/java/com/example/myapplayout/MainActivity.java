package com.example.myapplayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_registration);

//        TextView textQuestion = findViewById(R.id.textQuestions);
//        Button buttonNext = findViewById(R.id.buttonNext);
//
//        buttonNext.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                textQuestion.setText("What is the capital city of Somalia?");
//            }
//        });

    }

    public void onClick(View v){
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextKastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        TextView textViewFirstName = findViewById(R.id.textFirstName);
        TextView textViewLastName = findViewById(R.id.textLastName);
        TextView textViewEmail = findViewById(R.id.textEmail);

        textViewFirstName.setText("First Name: " + editTextFirstName.getText());
        textViewLastName.setText("Last Name: " + editTextLastName.getText());
        textViewEmail.setText("Email: " + editTextEmail.getText());

    }

}