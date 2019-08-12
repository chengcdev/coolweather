package com.example.a15085.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15085 on 2019/8/12.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
