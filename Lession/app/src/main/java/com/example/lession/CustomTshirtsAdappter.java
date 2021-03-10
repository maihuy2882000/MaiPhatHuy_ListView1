package com.example.lession;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomTshirtsAdappter extends BaseAdapter {
    Context context;
    int layoutItem;
    ArrayList<Tshirts> arrayList;

    public CustomTshirtsAdappter(Context context, int layoutItem, ArrayList<Tshirts> arrayList) {
        this.context = context;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(layoutItem,parent,false);
        TextView tvName = convertView.findViewById(R.id.textView1);
        TextView tvPrice = convertView.findViewById(R.id.textView2);
        ImageView imgView = convertView.findViewById(R.id.imageView1);

        tvName.setText(arrayList.get(position).getName());
        tvPrice.setText(arrayList.get(position).getPrice());
        imgView.setImageResource(arrayList.get(position).getImgTshirts());
        return convertView;

    }
}
