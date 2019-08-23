package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("date_ts")
    public Integer dateTs;
    @SerializedName("week")
    public Integer week;
    @SerializedName("sunrise")
    public String sunrise;
    @SerializedName("sunset")
    public String sunset;
    @SerializedName("moon_code")
    public Integer moonCode;
    @SerializedName("moon_text")
    public String moonText;
    @SerializedName("parts")
    public List<Part> parts;
}