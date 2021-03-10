package com.example.lession;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTshirts;
    CustomTshirtsAdappter adt;
    ArrayList<Tshirts> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvTshirts = findViewById(R.id.listviewTshirts);
        arrayList = new ArrayList<>();
        arrayList.add(new Tshirts("FireFox","90$",R.drawable.computer));
        arrayList.add(new Tshirts("Moblie","970$",R.drawable.download));
        arrayList.add(new Tshirts("engineeer","78$",R.drawable.nice_memory));
        arrayList.add(new Tshirts("google","78$",R.drawable.google));
        arrayList.add(new Tshirts("computer_o2","78$",R.drawable.computer_o2));
        arrayList.add(new Tshirts("worlds_best_developer","78$",R.drawable.worlds_best_developer));
        adt = new CustomTshirtsAdappter(this,R.layout.itemslayout,arrayList);
        lvTshirts.setAdapter(adt);
    }
}