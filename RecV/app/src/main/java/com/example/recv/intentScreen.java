package com.example.recv;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class intentScreen extends AppCompatActivity {
    ImageView img1;
    TextView txt1, txt2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intent_screen);
        img1 = (ImageView) findViewById(R.id.img1);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        img1.setImageResource(getIntent().getIntExtra("imgName",0));
        txt1.setText(getIntent().getStringExtra("Header"));
        txt2.setText(getIntent().getStringExtra("Body"));

    }
}