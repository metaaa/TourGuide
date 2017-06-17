package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PlaceDetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_detailed);
        //GETTING PROPERTIES FROM THE INTENT
        Bundle bundle = getIntent().getExtras();
        String placeName = bundle.getString("placeName");
        String placeAddress = bundle.getString("placeAddress");
        String placeDescription = bundle.getString("placeDescription");
        int placeImage = bundle.getInt("placeImage");
        final String placeLocation = bundle.getString("placeLocation");
        //FINDING THE IMAGEVIEW AND SETTING THE IMAGE IN THE DETAILED ACTIVITY
        ImageView imageView = (ImageView) findViewById(R.id.detailed_image);
        imageView.setImageResource(placeImage);
        //FINDING THE TEXTVIEW AND SETTING THE PLACES NAME IN THE DETAILED ACTIVITY
        TextView detailedName = (TextView) findViewById(R.id.detailed_name);
        detailedName.setText(placeName);
        //FINDING THE TEXTVIEW AND SETTING THE PLACES ADDRESS IN THE DETAILED ACTIVITY
        TextView detailedAddress = (TextView) findViewById(R.id.detailed_address);
        detailedAddress.setText(placeAddress);
        //FINDING THE TEXTVIEW AND SETTING THE PLACES DESCRIPTION IN THE DETAILED ACTIVITY
        TextView detailedDescription = (TextView) findViewById(R.id.detailed_description);
        detailedDescription.setText(placeDescription);
        //FINDING THE LINEARLAYOUT WHICH CONTAINS THE LOCATIONS COORDINATES IN THE DETAILED ACTIVITY
        LinearLayout placeMapsLink = (LinearLayout) findViewById(R.id.detailed_location);
        //CREATING AN INTENT WHICH OPENS THE NAVIGATION APP WITH THE OBJECTS COORDINATES WHEN THE USER CLICKS ON THE AREA OF THE LINEARLAYOUT
        placeMapsLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //PREPARING THE LINK FOR THE GOOGLE MAPS INTENT
                Uri geoLocation = Uri.parse("geo:0,0?q=" + placeLocation);
                Intent placeMapIntent = new Intent(Intent.ACTION_VIEW, geoLocation);
                startActivity(placeMapIntent);
            }
        });
        //SETTING THE PLACES NAME AS THE TITLE IN THE TOOLBAR
        this.setTitle(placeName);
        //ACTIVATING UP BUTTON TO THE MAIN ACTIVITY ON THE TOOLBAR
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
