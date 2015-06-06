package com.example.praveen.myappportifolio;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String [] appListData = {"Spotify Streamer","Scores App","Library App","Build It Bigger","XYZ Reader","Capstone: My Own App"};

        List<String> appList = new ArrayList<String>(Arrays.asList(appListData));

        ArrayAdapter<String> adapterArray = new ListAdapter<String>(getActivity(),R.id.button_send,appList);
        ListView listView = (ListView) rootView.findViewById(R.id.listViewPortfolio);
        listView.setAdapter(adapterArray);
        return rootView;
    }
}
