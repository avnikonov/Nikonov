package ru.testing.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Detected {
    @SerializedName("lang")
    @Expose
    private String lang;

    }
