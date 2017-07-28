package com.byethost5.egle.BeautyRoom;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class NewEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_entry);
    }

    /*final Spinner procedura = (Spinner) findViewById(R.id.new_entry_procedura_id);
    List<String> list = new ArrayList<String>();
    list.add("Limfodrenažinis masažas");
    list.add("Soliariumas");
    list.add("Masažas");
    ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, list);
    dataAdapter.setDropDownViewResourse(android.R.layout.simple_spinner_dropdown_item);
    procedura.setAdapter(dataAdapter);*/
}
