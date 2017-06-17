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
public class ToDoFragment extends Fragment {


    public ToDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //INFLATING THE LIST
        View rootView = inflater.inflate(R.layout.list, container, false);
        //CREATING THE ARRAYLIST FOR THE PLACES OF TODOS
        ArrayList<Place> todos = new ArrayList<Place>();
        //AQDDING PLACES TO THE ARRAYLIST
        todos.add(new Place(getString(R.string.squares_name), getString(R.string.squares_address), getString(R.string.squares_description), R.drawable.squares, getString(R.string.squares_location)));
        todos.add(new Place(getString(R.string.zoo_name), getString(R.string.zoo_address), getString(R.string.zoo_description), R.drawable.zoo, getString(R.string.zoo_location)));
        todos.add(new Place(getString(R.string.karasz_name), getString(R.string.karasz_address), getString(R.string.karasz_description), R.drawable.karasz, getString(R.string.karasz_location)));
        todos.add(new Place(getString(R.string.botanicalgarden_name), getString(R.string.botanicalgarden_address), getString(R.string.botanicalgarden_description), R.drawable.botanicalgarden, getString(R.string.botanicalgarden_location)));
        todos.add(new Place(getString(R.string.witchisland_name), getString(R.string.witchisland_address), getString(R.string.witchisland_description), R.drawable.witchisland, getString(R.string.witchisland_location)));
        //SETTING THE ADAPTER FOR THE PLACES OF TODOS
        PlaceAdapter adapter = new PlaceAdapter(getActivity(),todos);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        //RETURNING THE FRAGMENT
        return rootView;
    }
}
