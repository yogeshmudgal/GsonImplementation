package com.example.gsonimplementaion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Car {

    @SerializedName("model_name")
            @Expose
    String mModelName;

    @SerializedName("makeYear")
    @Expose(serialize = false)
    int mMakeYear;
    @SerializedName("brand")
            @Expose
    String mBrand;
@SerializedName("CarOwner")
@Expose(deserialize = false)
    CarOwner carOwner;
    @SerializedName("Passenger")
            @Expose
ArrayList<Passenger> passengerArrayList;



    public Car(String mModelName, int mMakeYear, String mBrand, CarOwner carOwner, ArrayList<Passenger> passengerArrayList) {
        this.mModelName = mModelName;
        this.mMakeYear = mMakeYear;
        this.mBrand = mBrand;
        this.carOwner = carOwner;
        this.passengerArrayList = passengerArrayList;
    }
}
