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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //INFLATING THE LIST
        View rootView = inflater.inflate(R.layout.list, container, false);
        //CREATING THE ARRAYLIST FOR THE PLACES OF RESTAURANTS
        ArrayList<Place> eat = new ArrayList<Place>();
        //AQDDING PLACES TO THE ARRAYLIST
        eat.add(new Place(getString(R.string.tiszavirag_name), getString(R.string.tiszavirag_address), getString(R.string.tiszavirag_description), R.drawable.tiszavirag, getString(R.string.tiszavirag_location)));
        eat.add(new Place(getString(R.string.malata_name), getString(R.string.malata_address), getString(R.string.malata_description), R.drawable.malata, getString(R.string.malata_location)));
        eat.add(new Place(getString(R.string.jobbotthon_name), getString(R.string.jobbotthon_address), getString(R.string.jobbotthon_description), R.drawable.jobbotthon, getString(R.string.jobbotthon_location)));
        eat.add(new Place(getString(R.string.kiskorossy_name), getString(R.string.kiskorossy_address), getString(R.string.kiskorossy_description), R.drawable.kiskorossy, getString(R.string.kiskorossy_location)));
        eat.add(new Place(getString(R.string.pizzaepasta_name), getString(R.string.pizzaepasta_address), getString(R.string.pizzaepasta_description), R.drawable.pizzaepasta, getString(R.string.pizzaepasta_location)));
        eat.add(new Place(getString(R.string.szegedetterem_name), getString(R.string.szegedetterem_address), getString(R.string.szegedetterem_description), R.drawable.szegedetterem, getString(R.string.szegedetterem_location)));
        eat.add(new Place(getString(R.string.cirmi_name), getString(R.string.cirmi_address), getString(R.string.cirmi_description), R.drawable.cirmi, getString(R.string.cirmi_location)));
        eat.add(new Place(getString(R.string.tajmahal_name), getString(R.string.tajmahal_address), getString(R.string.tajmahal_description), R.drawable.tajmahal, getString(R.string.tajmahal_location)));
        eat.add(new Place(getString(R.string.classiccafe_name), getString(R.string.classiccafe_address), getString(R.string.classiccafe_description), R.drawable.classicgarden, getString(R.string.classiccafe_location)));
        //SETTING THE ADAPTER FOR THE PLACES OF RESTAURANTS
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),eat);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        //RETURNING THE FRAGMENT
        return rootView;
    }

}
