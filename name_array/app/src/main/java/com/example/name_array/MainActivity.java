package com.example.name_array;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    Button b1,b2;

    int index = -1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.textView);
        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button2);



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] str = getResources().getStringArray(R.array.Yash);
                int len = str.length;
               if (index<(len-1))
                {
                   index++;
                    tv1.setText(str[index]);

               }
               else{
                    tv1.setText("NO MORE RECORDS");
               }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] Str=getResources().getStringArray(R.array.Yash);
                if(index>0){

                    tv1.setText(Str[index]);
                    index--;
                }
                else{
                    tv1.setText(Str[index]);
                }
            }
        });

    }
}