package com.example.simplemathapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListPage extends AppCompatActivity {

    ListView myListView;
    String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items); //This line refers to the items in strings.xml

        //Merge items (which is an array of strings with myListView) by using what is called an 'adaptor'
        myListView.setAdapter(new ArrayAdapter<String>(this, R.layout.my_listview_detail, items));

    }
}