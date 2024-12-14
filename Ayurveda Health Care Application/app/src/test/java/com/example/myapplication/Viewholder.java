package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {
ImageView img;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.Imageview);
    }
}
