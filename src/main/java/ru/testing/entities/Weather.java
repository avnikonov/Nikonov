package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Weather {
    @SerializedName("now")
    public Integer now;
    @SerializedName("now_dt")
    public String nowDt;
    @SerializedName("info")
    public Info info;
    @SerializedName("fact")
    public Fact fact;
    @SerializedName("forecast")
    public Forecast forecast;
}