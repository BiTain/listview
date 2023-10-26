package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Student> {

    Context ct;
    List<Student> arr;

    int layoutResource;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull List<Student> objects) {
        super(context, resource, objects);
            this.ct = context;
            this.arr = new ArrayList<>(objects);
            this.layoutResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = LayoutInflater.from(ct);
            convertView = inflater.inflate(layoutResource,null);
        }
        if(arr.size()>0){
            TextView name,code;
            name = convertView.findViewById(R.id.name);
            code = convertView.findViewById(R.id.code);
            Student std = arr.get(position);
            name.setText(std.getName());
            code.setText(std.getCode());
        }
        return convertView;
    }
}
