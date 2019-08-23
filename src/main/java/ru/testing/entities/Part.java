package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Part {
    @SerializedName("part_name")
    public String partName;
    @SerializedName("temp_min")
    public Integer tempMin;
    @SerializedName("temp_max")
    public Integer tempMax;
    @SerializedName("temp_avg")
    public Integer tempAvg;
    @SerializedName("feels_like")
    public Integer feelsLike;
    @SerializedName("icon")
    public String icon;
    @SerializedName("condition")
    public String condition;
    @SerializedName("daytime")
    public String daytime;
    @SerializedName("polar")
    public Boolean polar;
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
    @SerializedName("prec_mm")
    public Double precMm;
    @SerializedName("prec_period")
    public Integer precPeriod;
    @SerializedName("prec_prob")
    public Integer precProb;
}