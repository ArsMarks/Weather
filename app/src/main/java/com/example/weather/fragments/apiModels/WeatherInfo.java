package com.example.weather.fragments.apiModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class WeatherInfo {
    @SerializedName("lat")
    @Expose
    private int lat;

    @SerializedName("lom")
    @Expose
    private int lom;

    @SerializedName("tzinfo")
    @Expose
    private WeatherTzInfo tzinfo;

    @SerializedName("offset")
    @Expose
    private int offset;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("abbr")
    @Expose
    private String abbr;

    @SerializedName("dst")
    @Expose
    private boolean dst;

    @SerializedName("def_pressure_mm")
    @Expose
    private int defPressureMm;

    @SerializedName("def_pressure_pa")
    @Expose
    private int defPressurePa;

    @SerializedName("url")
    @Expose
    private String url;

    public int getLat() {
        return lat;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLom() {
        return lom;
    }

    public void setLom(int lom) {
        this.lom = lom;
    }

    public WeatherTzInfo getTzinfo() {
        return tzinfo;
    }

    public void setTzinfo(WeatherTzInfo tzinfo) {
        this.tzinfo = tzinfo;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public boolean isDst() {
        return dst;
    }

    public void setDst(boolean dst) {
        this.dst = dst;
    }

    public int getDefPressureMm() {
        return defPressureMm;
    }

    public void setDefPressureMm(int defPressureMm) {
        this.defPressureMm = defPressureMm;
    }

    public int getDefPressurePa() {
        return defPressurePa;
    }

    public void setDefPressurePa(int defPressurePa) {
        this.defPressurePa = defPressurePa;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
