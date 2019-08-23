package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Info {
    @SerializedName("lat")
    public Double lat;
    @SerializedName("lon")
    public Double lon;
    @SerializedName("url")
    public String url;
}