package com.maning.gankmm.http.rolltools;

import com.maning.gankmm.bean.rolltools.HolidaySingleResultBean;
import com.maning.gankmm.bean.rolltools.WeatherFuturedaysResultBean;
import com.maning.gankmm.http.BuildApi;
import com.maning.gankmm.http.callback.CommonHttpCallback;

/**
 * @author : maning
 * @date : 2020-09-29
 * @desc :
 */
public class RolltoolsApi {


    /**
     * 获取指定日期的节假日及万年历信息
     *
     * @param date yyyyMMdd
     */
    public static void getHolidaySingle(String date, CommonHttpCallback<HolidaySingleResultBean> httpCallback) {
        BuildApi.getRooltoolsAPIService().getHolidaySingle(date).enqueue(httpCallback);
    }

    /**
     * 获取特定城市今天及未来天气信息
     *
     * @param cityName     {城市名} 传入你需要查询的城市，请尽量传入完整值，否则系统会自行匹配，可能会有误差
     * @param httpCallback
     */
    public static void getCityWeatherFutureDays(String cityName, CommonHttpCallback<WeatherFuturedaysResultBean> httpCallback) {
        BuildApi.getRooltoolsAPIService().getCityWeatherFutureDays(cityName).enqueue(httpCallback);
    }


}
