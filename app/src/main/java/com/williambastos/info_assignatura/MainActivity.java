package com.williambastos.info_assignatura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonMobile = findViewById(R.id.buttonMobile);
        Button buttonCamera = findViewById(R.id.buttonCamera);
        buttonMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = ClickedActivity.newIntent(MainActivity.this, getString(R.string.desenvolupament), R.drawable.mobile_photo, getString(R.string.desenvolupamen_description));
                startActivity(intent);
            }
        });

        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = ClickedActivity.newIntent(MainActivity.this, getString(R.string.produccio), R.drawable.camera_photo, getString(R.string.produccio_description));
                startActivity(intent2);
            }
        });
    }
}