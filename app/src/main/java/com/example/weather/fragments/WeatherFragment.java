package com.example.weather.fragments;

import androidx.fragment.app.Fragment;

import com.example.weather.fragments.apiModels.WeatherRequestBody;

public class WeatherFragment extends Fragment {

    public static WeatherRequestBody createRequestBody() {
        WeatherRequestBody weatherRequestBody = new WeatherRequestBody(12, 32 );
        return weatherRequestBody;
    }
}
