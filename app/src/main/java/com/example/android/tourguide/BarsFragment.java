package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarsFragment extends Fragment {


    public BarsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //INFLATING THE LIST
        View rootView = inflater.inflate(R.layout.list, container, false);
        //CREATING THE ARRAYLIST FOR THE PLACES OF BARS
        ArrayList<Place> bars = new ArrayList<Place>();
        //AQDDING PLACES TO THE ARRAYLIST
        bars.add(new Place(getString(R.string.malata_name), getString(R.string.malata_address), getString(R.string.malata_description), R.drawable.malata, getString(R.string.malata_location)));
        bars.add(new Place(getString(R.string.sorokhaza_name), getString(R.string.sorokhaza_address), getString(R.string.sorokhaza_description), R.drawable.sorokhaza, getString(R.string.sorokhaza_location)));
        bars.add(new Place(getString(R.string.bohemtanya_name), getString(R.string.bohemtanya_address), getString(R.string.bohemtanya_description), R.drawable.bohemtanya, getString(R.string.bohemtanya_location)));
        bars.add(new Place(getString(R.string.lobby_name), getString(R.string.lobby_address), getString(R.string.lobby_description), R.drawable.lobbycafe, getString(R.string.lobby_location)));
        bars.add(new Place(getString(R.string.campus_name), getString(R.string.campus_address), getString(R.string.campus_description), R.drawable.campus, getString(R.string.campus_location)));
        bars.add(new Place(getString(R.string.hungi_name), getString(R.string.hungi_address), getString(R.string.hungi_description), R.drawable.hungi, getString(R.string.hungi_location)));
        bars.add(new Place(getString(R.string.vitrin_name), getString(R.string.vitrin_address), getString(R.string.vitrin_description), R.drawable.vitrin, getString(R.string.vitrin_location)));
        //SETTING THE ADAPTER FOR THE PLACES OF BARS
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),bars);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        //RETURNING THE FRAGMENT
        return rootView;
    }

}
