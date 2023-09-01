package com.example.test2.data

interface WeatherDataSource {
    suspend fun getWeather(zipCode: String)  : String
}