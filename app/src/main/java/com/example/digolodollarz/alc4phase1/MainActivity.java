package com.example.digolodollarz.alc4phase1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button aboutAlcBtn;
    Button myProfileBtn;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.context = this;

        aboutAlcBtn = (Button) findViewById(R.id.about_alc_btn);
        myProfileBtn = (Button) findViewById(R.id.my_profile_btn);

        aboutAlcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, AboutALC.class));
            }
        });

        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, MyProfile.class));
            }
        });
    }
}
