package com.example.vishalchandrola.sunshinelearn;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        String[] forecastArray ={
         "ahmedabad - sunny",
         "vadodara - hot",
         "surat  - dry",
         "ahmedabad - sunny",
         "ahmedabad - sunny",
         "morbi - thunderstorm",
         "ahmedabad - sunny",
         "ahmedabad - sunny",
                "ahmedabad - sunny",
                "ahmedabad - sunny",
                "ahmedabad - sunny",
                "ahmedabad - sunny",
        };



        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        ArrayAdapter<String> forecast = new ArrayAdapter<>(getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,weekForecast);

        View view = inflater.inflate(R.layout.fragment_main,container,false);

        ListView listview = (ListView)view.findViewById(R.id.listview_forecast);
        listview.setAdapter(forecast);

        return view;
    }
}
