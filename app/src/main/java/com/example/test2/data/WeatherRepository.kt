package com.example.test2.data

class WeatherRepository(private val dataSource : WeatherDataSource) {
    suspend fun getWeather(zipCode: String) : String {
        return dataSource.getWeather(zipCode)
    }
}