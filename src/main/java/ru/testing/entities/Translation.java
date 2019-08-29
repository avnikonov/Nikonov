package ru.testing.entities;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Translation {
    @SerializedName("code")
    public Integer code;
    @SerializedName("detected")
    public Detected detected;
    @SerializedName("lang")
    public String lang;
    @SerializedName("text")
    public String text;
}