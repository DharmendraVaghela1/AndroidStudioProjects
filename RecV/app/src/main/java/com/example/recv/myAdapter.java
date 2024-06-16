package com.example.recv;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myViewHolder> {

    ArrayList<Model> data ;
    Context context;

    public myAdapter(ArrayList<Model> data , Context context) {

        this.data = data;
        this.context =context;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row,parent,false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final myViewHolder holder, @SuppressLint("RecyclerView") int position) {
        final Model temp = data.get(position);

        holder.img.setImageResource(data.get(position).img);
        holder.txtHeader.setText(data.get(position).txtHeader);
        holder.txtBody.setText(data.get(position).txtBody);

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,intentScreen.class);
                intent.putExtra("imgName",data.get(position).img);
                intent.putExtra("Header",data.get(position).txtHeader);
                intent.putExtra("Body",data.get(position).txtBody);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });


    }



    @Override
    public int getItemCount() {

        return data.size();
    }
}
