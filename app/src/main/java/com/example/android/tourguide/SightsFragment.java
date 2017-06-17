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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //INFLATING THE LIST
        View rootView = inflater.inflate(R.layout.list, container, false);
        //CREATING THE ARRAYLIST FOR THE PLACES OF SIGHTS
        final ArrayList<Place> sights = new ArrayList<Place>();
        //AQDDING PLACES TO THE ARRAYLIST
        sights.add(new Place(getString(R.string.synagogue_name), getString(R.string.synagogue_address), getString(R.string.synagogue_description), R.drawable.synagogue, getString(R.string.synagogue_location)));
        sights.add(new Place(getString(R.string.reok_name), getString(R.string.reok_address), getString(R.string.reok_description), R.drawable.reok, getString(R.string.reok_location)));
        sights.add(new Place(getString(R.string.oldlady_name), getString(R.string.oldlady_address), getString(R.string.oldlady_description), R.drawable.oldlady, getString(R.string.oldlady_location)));
        sights.add(new Place(getString(R.string.moramuseum_name), getString(R.string.moramuseum_address), getString(R.string.moramuseum_description), R.drawable.moramuseum, getString(R.string.moramuseum_location)));
        sights.add(new Place(getString(R.string.votivechurch_name), getString(R.string.votivechurch_address), getString(R.string.votivechurch_description), R.drawable.votivechurch, getString(R.string.votivechurch_location)));
        sights.add(new Place(getString(R.string.annaspring_name), getString(R.string.annaspring_address), getString(R.string.annaspring_description), R.drawable.annaspring, getString(R.string.annaspring_location)));
        //SETTING THE ADAPTER FOR THE PLACES OF SIGHTS
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), sights);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        //RETURNING THE FRAGMENT
        return rootView;
    }

}
