package com.example.nicholas.nramsay_top;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view){
        Toast.makeText(this, "registration", Toast.LENGTH_LONG).show();
        Intent intent= new Intent(this, registration.class);
        startActivity(intent);
    }
}
