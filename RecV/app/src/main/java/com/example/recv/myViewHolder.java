package com.example.recv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder {
    TextView txtHeader, txtBody;
    ImageView img;



    public myViewHolder(@NonNull View itemView) {
        super(itemView);
        txtHeader = itemView.findViewById(R.id.txtHeader);
        txtBody = itemView.findViewById(R.id.txtBody);
        img = itemView.findViewById(R.id.img);
    }
}
