package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhengbei on 2017/1/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
