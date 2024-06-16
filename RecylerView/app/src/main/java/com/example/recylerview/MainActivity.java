package com.example.recylerview;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    myAdapter adapter;
    ArrayList<com.example.recyclerview.ModelClass> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reviews);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Button btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

        // Add initial dummy data
        arr.add(new ModelClass("A", "1234567890"));
        // Add more items to the ArrayList as needed

        adapter = new Adapter(this, arr);
        recyclerView.setAdapter(adapter);
    }

    private void showDialog() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.layout_dialog);
        EditText edtName = dialog.findViewById(R.id.edtName);
        EditText edtNumber = dialog.findViewById(R.id.edtNumber);
        Button btnAction = dialog.findViewById(R.id.btnAction);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String number = edtNumber.getText().toString();

                arr.add(new ModelClass(name, number));
                adapter.notifyItemInserted(arr.size() - 1);
                recyclerView.scrollToPosition(arr.size() - 1);

                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
