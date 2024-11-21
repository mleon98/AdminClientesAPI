package com.example.adminclientes.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String WEATHER_API_URL = "http://api.weatherapi.com/v1/current.json";
    private final String API_KEY = "7f32274db5c84723a9324341242011"; // Reemplaza con tu API Key de WeatherAPI

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format("%s?key=%s&q=%s", WEATHER_API_URL, API_KEY, city);
        return restTemplate.getForObject(url, String.class);
    }
}
