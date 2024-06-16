package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ResultTxt;
        EditText heightFT,heightInch,wgt;
        Button ButtonTxt;
        wgt = findViewById(R.id.wgt);
        heightFT = findViewById(R.id.heightFt);
        heightInch = findViewById(R.id.heightInch);
        ButtonTxt = findViewById(R.id.SummitBtn);
        ResultTxt = findViewById(R.id.ResultTxt);

        ButtonTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int wt = Integer.parseInt(wgt.getText().toString());
                int ft = Integer.parseInt(heightFT.getText().toString());
                int in = Integer.parseInt(heightInch.getText().toString());
                int totalIn = ft*12 + in;
                double totalcm = totalIn*2.53;
                double totalHT = totalcm/100;
                double bmi = wt/(totalHT*totalHT);

                if (bmi > 25){
                    ResultTxt.setText("you are overweight");
                } else if (bmi <18) {
                    ResultTxt.setText("you are underweight");
                }
                else{
                    ResultTxt.setText("you are healthy");
                }

            }
        });


    }
}