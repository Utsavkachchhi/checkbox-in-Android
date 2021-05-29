package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox a1,a2,a3,a4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a1= findViewById(R.id.c1);
        a2= findViewById(R.id.c2);
        a3= findViewById(R.id.c3);
        a4 = findViewById(R.id.c4);
        button = findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int total=0;
                StringBuilder result = new StringBuilder();
                result.append("You Have Ordered: ");
                if(a1.isChecked()) {
                    result.append("\n Burger +$50");
                    total +=50;
                }

                if(a2.isChecked()) {
                    result.append("\n Pizza +$50");
                    total +=50;
                }

                if(a3.isChecked()) {
                    result.append("\n Tea +$10");
                    total +=10;
                }

                if(a4.isChecked()) {
                    result.append("\n Coffee +$20");
                    total +=20;
                }

                result.append("\n Total Amount is: "+total);
                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}