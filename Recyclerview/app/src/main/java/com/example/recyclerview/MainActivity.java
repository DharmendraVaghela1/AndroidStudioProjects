package com.example.recyclerview;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    RecyclerContactAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerContract);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Button btnOpenDialog = findViewById(R.id.btnOpenDialog);

        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);
                EditText edtName=dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnAction = dialog.findViewById(R.id.btnAction);

                btnAction.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name= edtName.getText().toString();
                        String number = edtNumber.getText().toString();

                        arrContacts.add(new ContactModel(name,number));
                        adapter.notifyItemInserted(arrContacts.size()-1);
                        recyclerView.scrollToPosition(arrContacts.size()-1);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));
        arrContacts.add(new ContactModel(R.drawable.ic_launcher_foreground,"A","124567897"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}