package com.example.gsonimplementaion;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CarOwner {

    @SerializedName("firstName")
            @Expose
    String mFirstName;
    @SerializedName("lastName")
            @Expose
    String mLastName;
    @SerializedName("Age")
            @Expose
    int mAge;

    public CarOwner(String mFirstName, String mLastName, int mAge) {
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mAge = mAge;
    }
}
