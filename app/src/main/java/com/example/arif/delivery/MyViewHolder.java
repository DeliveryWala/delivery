package com.example.arif.delivery;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Arif on 24/07/16.
 */
public class MyViewHolder{
    ImageView image;
    TextView titles,company,qty,mrp;
    MyViewHolder(View v){
        image= (ImageView) v.findViewById(R.id.productImage);
        titles= (TextView) v.findViewById(R.id.title);
        company= (TextView) v.findViewById(R.id.company);
        qty= (TextView) v.findViewById(R.id.qty);
        mrp= (TextView) v.findViewById(R.id.mrp);
    }

}