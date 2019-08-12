package com.example.a15085.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15085 on 2019/8/12.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
