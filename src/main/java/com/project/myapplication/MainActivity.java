package com.project.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.project.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "lifecycle";
    private ActivityMainBinding binding; //generate a java class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater()); //solve findViewbyId thing
        setContentView(binding.getRoot()); //root is layout;

        //TextView welcomeTextView = findViewById(R.id.welcomeTextView); //R(all the resources).collection.key
        //EditText nameEditText = findViewById(R.id.nameEditText);
        //EditText emailEditText = findViewById(R.id.emailEditText);
        //Button submitButton = findViewById(R.id.submitButton);

        //View.OnClickListener(): interface
        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = binding.nameEditText.getText().toString();
                String email = binding.emailEditText.getText().toString();
                binding.welcomeTextView.setText("Welcome " + name + ", your email is: " + email);
            }
        });
    }

    //when click the button, trigger onClickListener, call onClick method
    //a lambda function
    //v is the button
        /*
        submitButton.setOnClickListener(v -> {
            String name = nameEditText.getText().toString();
            String email = emailEditText.getText().toString();
            welcomeTextView.setText("Welcome " + name + ", your email is: " + email);
        });
    }
         */
}