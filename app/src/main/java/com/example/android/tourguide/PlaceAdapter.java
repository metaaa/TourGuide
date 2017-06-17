package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> items){
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //GET THE ID OF THE ACTUAL PLACE FROM THE LIST
        Place currentPlace = getItem(position);
        //GETTING THE PROPERTIES FOR THE OBJECT
        String placeNameToIntent = currentPlace.getPlaceName();
        String placeAddressToIntent = currentPlace.getPlaceAddress();
        String placeDescriptionToIntent = currentPlace.getPlaceDescription();
        int placeImageIdToIntent = currentPlace.getImageOfPlaceId();
        String placeLocationToIntent = currentPlace.getPlaceLocation();
        //FINDING THE TEXTVIEW FOR THE NAME AND SET IT
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name_view);
        placeName.setText(currentPlace.getPlaceName());
        //FINDING THE TEXTVIEW FOR THE ADDRESS AND SET IT
        TextView placeAddress = (TextView) listItemView.findViewById(R.id.place_address_view);
        placeAddress.setText(currentPlace.getPlaceAddress());
        //FINDING THE IMAGEVIEW FOR THE NAME AND SET IT
        ImageView imageOfPlaceId = (ImageView) listItemView.findViewById(R.id.place_image_view);
        //SETTING THE VISIBILITY OF THE IMAGE IN CASE IT HAS IMAGE OR NOT
        if (currentPlace.hasImage()){
            imageOfPlaceId.setImageResource(currentPlace.getImageOfPlaceId());
            imageOfPlaceId.setVisibility(View.VISIBLE);
        }
        else{
            imageOfPlaceId.setVisibility(View.GONE);
        }
        //CREATING AN INTENT FOR THE DETAILED VIEW
        final Intent itemIntent = new Intent(context, PlaceDetailedActivity.class);
        //PUTTING THE PROPERTIES TO THE INTENT
        itemIntent.putExtra("placeName", placeNameToIntent);
        itemIntent.putExtra("placeAddress", placeAddressToIntent);
        itemIntent.putExtra("placeDescription", placeDescriptionToIntent);
        itemIntent.putExtra("placeImage", placeImageIdToIntent);
        itemIntent.putExtra("placeLocation", placeLocationToIntent);
        //STARTING THE INTENT IN CASE THE USER TAPS ON A LIST ITEM
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(itemIntent);
            }
        });
        //RETURNING THE LISTITEMVIEW FOR LATER INFLATION
        return listItemView;
    }
}