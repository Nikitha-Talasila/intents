package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secj extends AppCompatActivity {
    TextView view,emaili,phnnu,cours,branc,yea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secj);
        Intent intent = getIntent();
        String user=intent.getStringExtra("user");
        String email =intent.getStringExtra("email");
        String phn =intent.getStringExtra("number");
        String course =intent.getStringExtra("course");
        String branch =intent.getStringExtra("branch");
        String year =intent.getStringExtra("year");
        view = findViewById(R.id.name);
        view.setText(user);
        emaili=findViewById(R.id.emaili);
        emaili.setText(email);
        phnnu=findViewById(R.id.phnnu);
        phnnu.setText(phn);
        cours=findViewById(R.id.cours);
        cours.setText(course);
        branc=findViewById(R.id.branc);
        branc.setText(branch);
        yea=findViewById(R.id.yea);
        yea.setText(year);
    }
}