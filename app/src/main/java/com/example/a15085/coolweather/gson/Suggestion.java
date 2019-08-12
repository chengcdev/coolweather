package com.example.a15085.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 15085 on 2019/8/12.
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
