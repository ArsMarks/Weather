package com.example.weather.fragments;

public class WeatherPresenter {
    private final WeatherModel model;

    public WeatherPresenter(WeatherModel model) {
        this.model = model;
        if (model != null)
            model.weatherPresenter = this;
    }
}
