package com.example.recv;

import android.content.Context;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView main;
myAdapter adapter;
Context context;
ArrayList<Model> arr = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        main = findViewById(R.id.main);
        main.setLayoutManager(new LinearLayoutManager(this));
        setTitle("Recycler View & Card View");
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));
        arr.add(new Model("Dharmendra","Vaghela", R.drawable.ic_launcher_foreground));
        arr.add(new Model("Raj","Patil", R.drawable.ic_launcher_background));


        myAdapter adapter = new myAdapter(arr,getApplicationContext());
        main.setAdapter(adapter);


    }
}
