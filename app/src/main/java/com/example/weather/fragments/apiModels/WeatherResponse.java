package com.example.weather.fragments.apiModels;

import com.example.weather.fragments.apiModels.WeatherFact;
import com.example.weather.fragments.apiModels.WeatherForecasts;
import com.example.weather.fragments.apiModels.WeatherInfo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherResponse {
    @SerializedName("now")
    @Expose
    private int now;

    @SerializedName("now_dt")
    @Expose
    private String now_dt;

    @SerializedName("info")
    @Expose
    private WeatherInfo info;

    @SerializedName("fact")
    @Expose
    private WeatherFact fact;

    @SerializedName("forecasts")
    @Expose
    private WeatherForecasts forecasts;

    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public String getNow_dt() {
        return now_dt;
    }

    public void setNow_dt(String now_dt) {
        this.now_dt = now_dt;
    }

    public WeatherInfo getInfo() {
        return info;
    }

    public void setInfo(WeatherInfo info) {
        this.info = info;
    }

    public WeatherFact getFact() {
        return fact;
    }

    public void setFact(WeatherFact fact) {
        this.fact = fact;
    }

    public WeatherForecasts getForecasts() {
        return forecasts;
    }

    public void setForecasts(WeatherForecasts forecasts) {
        this.forecasts = forecasts;
    }
}
