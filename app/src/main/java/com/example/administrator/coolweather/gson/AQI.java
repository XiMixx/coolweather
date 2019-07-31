package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2019/7/29.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
