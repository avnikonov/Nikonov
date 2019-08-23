package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Fact {
    @SerializedName("temp")
    public Integer temp;
    @SerializedName("feels_like")
    public Integer feelsLike;
    @SerializedName("icon")
    public String icon;
    @SerializedName("condition")
    public String condition;
    @SerializedName("wind_speed")
    public Double windSpeed;
    @SerializedName("wind_gust")
    public Double windGust;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("pressure_mm")
    public Integer pressureMm;
    @SerializedName("pressure_pa")
    public Integer pressurePa;
    @SerializedName("humidity")
    public Integer humidity;
    @SerializedName("daytime")
    public String daytime;
    @SerializedName("polar")
    public Boolean polar;
    @SerializedName("season")
    public String season;
    @SerializedName("obs_time")
    public Integer obsTime;
}