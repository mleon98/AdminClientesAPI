package com.example.adminclientes.controller;

import com.example.adminclientes.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clima")
@CrossOrigin(origins = "*")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // Endpoint para obtener el clima por ciudad
    @GetMapping("/{ciudad}")
    public String getClima(@PathVariable String ciudad) {
        return weatherService.getWeather(ciudad);
    }
}
