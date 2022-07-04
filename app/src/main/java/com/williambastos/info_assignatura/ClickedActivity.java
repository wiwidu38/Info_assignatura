package com.williambastos.info_assignatura;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClickedActivity extends AppCompatActivity {

    String title;
    String description;
    int drawable;

    public static Intent newIntent(Context packageContext, String title, int drawable, String description) {
        Intent intent = new Intent(packageContext, ClickedActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("idPhoto",drawable);
        intent.putExtra("description",description);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked);
        title = getIntent().getStringExtra("title");
        description = getIntent().getStringExtra("description");
        drawable = getIntent().getIntExtra("idPhoto",R.drawable.ic_launcher_foreground);

        TextView titleView = (TextView) findViewById(R.id.titleClicked);
        titleView.setText(title);

        TextView des = (TextView)  findViewById(R.id.descriptionClicked);
        des.setText(description);

        ImageView photo = (ImageView) findViewById(R.id.photoClicked);
        photo.setImageResource(drawable);

    }
}