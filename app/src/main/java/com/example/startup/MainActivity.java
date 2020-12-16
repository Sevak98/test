package com.example.startup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.DragStartHelper;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageView;

import javax.security.auth.callback.PasswordCallback;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText name;
    private EditText password;
    private Button button;
    private final String TAG = "-------------------------------";
    private ImageView imageView2;

    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        name.getText().toString();
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        password = findViewById(R.id.editTextTextPassword);
        password.getText().toString();
        imageView2 = findViewById(R.id.imageView2);
//        imageView2.setImageDrawable();



    }


    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "The program will restart ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "The program will start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "The program will Stopped");
    }


    @Override
    public void onClick(View v) {
        if (v.equals(button)) {
            startActivity(new Intent(this, LoginActivity.class));

        }

        //Barev
        //aaaaaaaaaaaa
        //bdfjksdfajhf

    }

}