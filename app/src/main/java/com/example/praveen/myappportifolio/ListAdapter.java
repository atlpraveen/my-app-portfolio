package com.example.praveen.myappportifolio;

import android.content.Context;
import android.content.ClipData.Item;
import android.graphics.drawable.Drawable;
import android.widget.ArrayAdapter;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.Button;


/**
 * Created by praveen on 06/06/15.
 */
public class ListAdapter<Item> extends ArrayAdapter<Item> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<Item> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.portfoliolayout, null);
        }

        Item p = getItem(position);

        if (p != null) {
            Button b = (Button) v.findViewById(R.id.button_send);
            b.setMaxWidth(200);

            if (b!= null) {
                String appName = (String)p;
                b.setText(appName);
                if(appName.equals("Capstone: My Own App")) {
                    b.setBackgroundColor(getContext().getResources().getColor(R.color.Red));
                }
                //Drawable draw = getContext().
                //b.setBackground();
            }

           /* if (tt2 != null) {
                tt2.setText(p.getCategory().getId());
            }

            if (tt3 != null) {
                tt3.setText(p.getDescription());
            }*/
        }

        return v;
    }

}