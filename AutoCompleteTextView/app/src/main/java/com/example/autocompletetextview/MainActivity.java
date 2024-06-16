package com.example.autocompletetextview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    ArrayList<String> Lang = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        actv = findViewById(R.id.actv);
        Lang.add("C");
        Lang.add("C++");
        Lang.add("PHP");
        Lang.add("JAVA");
        Lang.add("PYTHON");
        Lang.add("C#");

        ArrayAdapter<String> adptr = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,Lang);
        actv.setAdapter(adptr);
        actv.setThreshold(1);

    }
}