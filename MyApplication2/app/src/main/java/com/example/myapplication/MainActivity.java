package com.example.myapplication;

import android.os.Bundle;
import android.util.AndroidException;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    ArrayList<String> Roles = new ArrayList<>();
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
        Roles.add("JE");
        Roles.add("JE IT");
        Roles.add("IAS");
        Roles.add("IPS");
        Roles.add("IFS");
        Roles.add("SSE");

        ArrayAdapter<String> listveawAdpt = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,Roles);
        listview.setAdapter(listveawAdpt);
    }
}