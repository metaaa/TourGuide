package com.example.android.tourguide;

public class Place {
    //NAME OF THE PLACE
    private String mPlaceName;
    //ADDRESS OF THE PLACE
    private String mPlaceAddress;
    //DESCRIPTION OF PLACE
    private String mPlaceDescription;
    //ID OF THE IMAGE OF THE PLACE
    private int mImageOfPlaceId = NO_IMAGE_PROVIDED;
    //IN CASE OF THERES NO ATTACHED IMAGE
    private static final int NO_IMAGE_PROVIDED = -1;
    //LAT AND LONG COORDINATES FOR THE PLACE
    private String mPlaceLocation;
    //DEFINING PUBLIC CONSTRUCTOR OF PLACE WITH IMAGE
    public Place (String placeName, String placeAddress, String placeDescription, int imageOfPlaceId, String placeLocation){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
        mImageOfPlaceId = imageOfPlaceId;
        mPlaceLocation = placeLocation;
    }
    //DEFINING PUBLIC CONSTRUCTOR OF PLACE WITHOUT IMAGE
    public Place (String placeName, String placeAddress, String placeDescription, String placeLocation){
        mPlaceName = placeName;
        mPlaceAddress = placeAddress;
        mPlaceDescription = placeDescription;
        mPlaceLocation = placeLocation;
    }
    //GET THE PLACES NAME
    public String getPlaceName() {return mPlaceName;}
    //GET THE PLACES ADDRESS
    public String getPlaceAddress() {return mPlaceAddress;}
    //GET THE PLACES DESCRIPTION
    public String getPlaceDescription() {return mPlaceDescription;}
    //GET THE ID FOR IMAGE RESOURCE OF THE PLACE
    public int getImageOfPlaceId() {return mImageOfPlaceId;}
    //DOES IT HAVE IMAGE OR NOT
    public boolean hasImage() {return mImageOfPlaceId != NO_IMAGE_PROVIDED;}
    //GET THE LOCATION OF THE PLACE
    public String getPlaceLocation() {return mPlaceLocation;}
}
