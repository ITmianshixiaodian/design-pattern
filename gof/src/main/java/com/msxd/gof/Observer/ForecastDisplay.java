package com.msxd.gof.Observer;

import java.util.List;

public class ForecastDisplay implements DisplayElement,Observer {
    private WeatherData weatherData;

    private List<Float> forecastTemperatures;//未来几天的温度
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("未来几天的气温");
        int count = forecastTemperatures.size();
        for (int i=0;i<count;i++){
            System.out.println("第"+i+"天:"+forecastTemperatures.get(i)+"℃");
        }
    }

    @Override
    public void update() {
        this.forecastTemperatures=this.weatherData.getForecastTemperatures();
        display();
    }
}
