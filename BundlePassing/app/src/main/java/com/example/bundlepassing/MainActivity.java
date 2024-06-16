package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        EditText datas;

        btn = findViewById(R.id.btn);
        datas = findViewById(R.id.datas);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNext = new Intent(MainActivity.this, secondActivity.class);
                Bundle iBundle = new Bundle();
                iBundle.putString("key1", "GFG :- Main Activity");
                iNext.putExtras(iBundle);
                startActivity(iNext);
//                iNext.putExtra(String data)
            }
        });
    }
}