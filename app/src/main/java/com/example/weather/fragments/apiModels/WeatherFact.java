package com.example.weather.fragments.apiModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class WeatherFact {
    @SerializedName("temp")
    @Expose
    private int temp;

    @SerializedName("feels_like")
    @Expose
    private int feelsLike;

    @SerializedName("temp_water")
    @Expose
    private int temp_water;

    @SerializedName("icon")
    @Expose
    private String icon;

    @SerializedName("condition")
    @Expose
    private String condition;

    @SerializedName("wind_speed")
    @Expose
    private int windSpeed;

    @SerializedName("wind_gust")
    @Expose
    private int windGust;

    @SerializedName("wind_dir")
    @Expose
    private String windDir;

    @SerializedName("pressure_mm")
    @Expose
    private int pressureMm;

    @SerializedName("pressure_pa")
    @Expose
    private int pressurePa;

    @SerializedName("humidity")
    @Expose
    private int humidity;

    @SerializedName("daytime")
    @Expose
    private String daytime;

    @SerializedName("polar")
    @Expose
    private boolean polar;

    @SerializedName("season")
    @Expose
    private String season;

    @SerializedName("obs_time")
    @Expose
    private int obsTime;

    @SerializedName("prec_type")
    @Expose
    private int precType;

    @SerializedName("prec_strength")
    @Expose
    private int precStrength;

    @SerializedName("cloudness")
    @Expose
    private int cloudness;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(int feelsLike) {
        this.feelsLike = feelsLike;
    }

    public int getTemp_water() {
        return temp_water;
    }

    public void setTemp_water(int temp_water) {
        this.temp_water = temp_water;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getWindGust() {
        return windGust;
    }

    public void setWindGust(int windGust) {
        this.windGust = windGust;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public int getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(int pressureMm) {
        this.pressureMm = pressureMm;
    }

    public int getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(int pressurePa) {
        this.pressurePa = pressurePa;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public boolean isPolar() {
        return polar;
    }

    public void setPolar(boolean polar) {
        this.polar = polar;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getObsTime() {
        return obsTime;
    }

    public void setObsTime(int obsTime) {
        this.obsTime = obsTime;
    }

    public int getPrecType() {
        return precType;
    }

    public void setPrecType(int precType) {
        this.precType = precType;
    }

    public int getPrecStrength() {
        return precStrength;
    }

    public void setPrecStrength(int precStrength) {
        this.precStrength = precStrength;
    }

    public int getCloudness() {
        return cloudness;
    }

    public void setCloudness(int cloudness) {
        this.cloudness = cloudness;
    }
}
