package com.example.loginform;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {

    TextView username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        username = findViewById(R.id.textView2);

        final String instaurl = "https://www.instagram.com/unique__yash_7858?igsh=MWNtdXF0dDFheGU2MQ==";

        View.OnClickListener openinsta = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(instaurl));
                intent.setPackage("com.instagram.android");

                try {
                    startActivity(intent);
                } catch (Exception e) {
                    // if Instagram app not installed, open in browser
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(instaurl));
                    startActivity(webIntent);
                }
            }
        };

        username.setOnClickListener(openinsta);
    }
}
