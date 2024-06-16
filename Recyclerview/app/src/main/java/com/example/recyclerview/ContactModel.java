package com.example.recyclerview;

import android.widget.ImageView;
import android.widget.TextView;

public class ContactModel {
    String name,  number;
    int img;
    public ContactModel(int img, String name,String number){
        this.img = img;
        this.name = name;
        this.number = number;
    }
    public ContactModel( String name,String number){
        this.name = name;
        this.number = number;
    }
}
