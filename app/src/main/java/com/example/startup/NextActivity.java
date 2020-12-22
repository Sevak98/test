package com.example.startup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class NextActivity extends AppCompatActivity implements  View.OnClickListener {
    ConnectDB connectDB = new ConnectDB(this);
    private final String TAG = "-------------------";
    private TextView textView = null;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textView = findViewById(R.id.textView);
        button2 = findViewById(R.id.button2);



//        Intent intent = new Intent();
//        String name = intent.getStringExtra("name");
//        Log.d(TAG, name);

        List<Student> students = connectDB.read();

        String text = "";

        for (Student std:students) {
            text += "Name:"+ std.name+"\n";

        }
        textView.setText(text);
    }

    @Override
    public void onClick(View v) {
        if (v.equals(button2)){
        this.deleteDatabase();
    }



}

    private void deleteDatabase() {

    }
    }