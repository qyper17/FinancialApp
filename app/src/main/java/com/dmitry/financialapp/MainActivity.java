package com.dmitry.financialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String[] categsArr = new String[] {"Продукты", "Быт", "Транспорт", "Учёба", "Развлечения", "Займ", "+ Добавить"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.categs_item, R.id.categs_name, categsArr);
        listView.setAdapter(adapter);
    }
}