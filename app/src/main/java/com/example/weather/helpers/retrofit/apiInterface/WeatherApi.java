package com.example.weather.helpers.retrofit.apiInterface;

import com.example.weather.fragments.apiModels.WeatherRequestBody;
import com.example.weather.fragments.apiModels.WeatherResponse;

import io.reactivex.Observable;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface WeatherApi {
    @POST("forecast/")
    Observable<WeatherResponse> weather(@Body WeatherRequestBody weatherRequestBody);
}
