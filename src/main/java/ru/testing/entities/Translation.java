package ru.testing.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class Translation {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("detected")
    @Expose
    private Detected detected;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("text")
    @Expose
    private List<String> text = null;


}