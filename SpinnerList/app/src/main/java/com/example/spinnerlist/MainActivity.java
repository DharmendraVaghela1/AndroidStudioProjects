package com.example.spinnerlist;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> IDs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        IDs.add("PAN");
        IDs.add("ADDHAAR CARD");
        IDs.add("VOTER ID");
        IDs.add("DRIVING LISIENCE");
        IDs.add("ID CARD");

        ArrayAdapter<String> adpt = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,IDs);
        spinner.setAdapter(adpt);

    }
}