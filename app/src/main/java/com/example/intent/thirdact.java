package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class thirdact extends AppCompatActivity {
    EditText e1,e2,e3;
    ImageButton b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdact);
        e1=findViewById(R.id.to);
        e2=findViewById(R.id.sub);
        e3=findViewById(R.id.messa);
        b1=findViewById(R.id.ma);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to=e1.getText().toString();
                String subject=e2.getText().toString();
                String message=e3.getText().toString();
                Intent email=new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT,subject);
                email.putExtra(Intent.EXTRA_TEXT,message);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email,"Choose an Email client:"));
            }
        });

    }
}