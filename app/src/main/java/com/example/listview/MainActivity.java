package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    private String[] number = {"161250533502","161250533405","151250533308","161250533207","151250533113","131250532378"};

    List<Student> arr;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.lvMaSinhVien);
        arr = new ArrayList<>();
        arr.add(new Student("Lê Quốc Bảo","21115053120104"));
        arr.add(new Student("Nguyễn Đăng Duy","21115053120104"));
        arr.add(new Student("Võ Đình Huy","21115053120104"));
        arr.add(new Student("Mã Phan Thành Đạt","21115053120104"));
        arr.add(new Student("Nguyễn Kim Hiếu","21115053120104"));

        adapter = new CustomAdapter(MainActivity.this,R.layout.listview_layout,arr);
        lv.setAdapter(adapter);

    }
}