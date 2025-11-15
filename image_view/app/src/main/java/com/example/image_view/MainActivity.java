package com.example.image_view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView im1;
    Button next,pre;
    int index=0;
        int [] images={

                R.drawable.insta,
                R.drawable.loginbkg,
                R.drawable.mahadev
        };

        int avtar=R.drawable.avtar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        im1=findViewById(R.id.imageview3);
        pre=findViewById(R.id.button1);
        next=findViewById(R.id.button2);

        im1.setImageResource(images[index]);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<images.length - 1){

                    im1.setImageResource(images[index]);
                    index++;
                }
                else {
                    im1.setImageResource(avtar);
                }
            }
        });

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index>0){
                    index--;
                    im1.setImageResource(images[index]);
                }
                else {
                    im1.setImageResource(images[index]);
                }
            }
        });


    }
}