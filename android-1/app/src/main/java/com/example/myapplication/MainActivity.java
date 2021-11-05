package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginin(View view){
        Button btn = findViewById(R.id.login);
        btn.setText("logout");
        String msg = "登入成功!";
        Toast toast = Toast.makeText(
                this, msg, Toast.LENGTH_LONG
        );
        toast.show();
    }



}