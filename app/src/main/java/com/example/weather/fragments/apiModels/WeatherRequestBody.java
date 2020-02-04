package com.example.weather.fragments.apiModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherRequestBody {
    @SerializedName("lat")
    @Expose
    private int lat;

    @SerializedName("lon")
    @Expose
    private int lon;

    public WeatherRequestBody(int lat, int lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}
