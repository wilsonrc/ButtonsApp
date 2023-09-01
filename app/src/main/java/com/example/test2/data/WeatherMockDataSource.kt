package com.example.test2.data

class WeatherMockDataSource : WeatherDataSource {
    override suspend fun getWeather(zipCode: String): String {
        return "Weather for $zipCode"
    }
}
