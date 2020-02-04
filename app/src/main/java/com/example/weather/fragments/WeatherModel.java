package com.example.weather.fragments;

import com.example.weather.fragments.apiModels.WeatherResponse;
import com.example.weather.helpers.retrofit.ApiService;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class WeatherModel {
    public WeatherPresenter weatherPresenter;
    private List<WeatherResponse> weatherResponses = new ArrayList<>();

    public void getWeather() {
        ApiService.getInstance().getWeatherApi().weather(WeatherFragment.createRequestBody())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<WeatherResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(WeatherResponse weatherResponse) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

}
