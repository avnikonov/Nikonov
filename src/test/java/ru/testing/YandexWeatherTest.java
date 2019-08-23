package ru.testing;

import org.junit.jupiter.api.DisplayName;
import ru.testing.entities.Weather;
import ru.testing.gateway.YandexWeatherGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YandexWeatherTest {
    private static final String MOSCOW_LATITUDE = "55.75396";
    private static final String MOSCOW_LONGITUDE = "37.620393";
    private static final String LANGUAGE_RU = "ru_RU";

    @Test
    @DisplayName("Погода в Москве")
    public void getMoscowWeather(){
        YandexWeatherGateway yandexWeatherGateway = new YandexWeatherGateway();
        Weather moscowWeather = yandexWeatherGateway.getWeather(MOSCOW_LATITUDE, MOSCOW_LONGITUDE, LANGUAGE_RU);
        Assertions.assertEquals(moscowWeather.getInfo().getLat().toString(), MOSCOW_LATITUDE);
        Assertions.assertEquals(moscowWeather.getInfo().getLon().toString(), MOSCOW_LONGITUDE);
    }
}