package com.example.test2.ui

import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test2.data.WeatherMockDataSource
import com.example.test2.data.WeatherRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WeatherViewModel : ViewModel(){
    private val repository : WeatherRepository = WeatherRepository(WeatherMockDataSource())

    private val _weatherUiState = MutableStateFlow<String>("No weather Data")
    val weatherUiState : StateFlow<String> = _weatherUiState
    fun loadWeather(query: String) = viewModelScope.launch {
        _weatherUiState.value = repository.getWeather(query)
    }
}