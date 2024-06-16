package com.example.list;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> Post =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);

        // Initialize the ArrayList
//        Post = new ArrayList<>();
        Post.add("JE");
        Post.add("SSE");
        Post.add("IAS");
        Post.add("IPS");
        Post.add("PGT");
        Post.add("TGT");

        ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Post);
        listview.setAdapter(listAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==0){
                    Toast.makeText(MainActivity.this, "Position 1 click", Toast.LENGTH_SHORT).show();
                } else if (position ==1) {
                    Toast.makeText(MainActivity.this, "Position 2 click", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
