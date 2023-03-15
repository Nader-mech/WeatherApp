package com.plcoding.weatherapp.domain.weather

data class WeatherInfo (
    val weatherDataPerDay: Map<Int, List<WeatheraData>>,
    val currentWeatherData: WeatheraData?
        )