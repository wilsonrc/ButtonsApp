package com.example.test2

import com.example.test2.data.WeatherMockDataSource
import com.example.test2.data.WeatherRepository
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val mockDataSource : WeatherMockDataSource = WeatherMockDataSource()

    @Test
    fun getWeather() = runBlocking {
        val weatherRepository = WeatherRepository(mockDataSource)
        val weather = weatherRepository.getWeather("12345")
        assertEquals("Weather for 12345", weather)
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}