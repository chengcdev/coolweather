package com.example.a15085.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15085 on 2019/8/12.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }
}
