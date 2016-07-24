package com.example.arif.delivery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Arif on 24/07/16.
 */
public class ListAdapter extends ArrayAdapter<String> {
    String[] titles,company,qty,mrp;
    Context context;
    int[] images;
    public ListAdapter(Context context,String[] titles, String[] company,String[] qty,String[] mrp,int[] images) {
        super(context, R.layout.list_items,R.id.title,titles);
        this.context=context;
        this.titles=titles;
        this.company=company;
        this.qty=qty;
        this.mrp=mrp;
        this.images=images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row=convertView;
        MyViewHolder holder=null;
        LayoutInflater inflater;
        if(row==null)
        {
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=inflater.inflate(R.layout.list_items,parent,false);
            holder=new MyViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder= (MyViewHolder) row.getTag();
        }
        holder.image.setImageResource(images[position]);
        holder.titles.setText(titles[position]);
        holder.company.setText(company[position]);
        holder.qty.setText(qty[position]);
        holder.mrp.setText(mrp[position]);
        return row;
    }

}
