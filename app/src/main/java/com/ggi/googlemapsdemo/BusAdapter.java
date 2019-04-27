package com.ggi.googlemapsdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BusAdapter extends ArrayAdapter<Bus> {

    public BusAdapter(@NonNull Context context, @NonNull ArrayList<Bus> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Bus temp = getItem(position);

        if (convertView==null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_of_buses,parent,false);

        }

        TextView place = convertView.findViewById(R.id.title1);
        TextView time = convertView.findViewById(R.id.time1);

        place.setText(temp.getPlace());
        time.setText(temp.getTime());





        return convertView;
    }
}
