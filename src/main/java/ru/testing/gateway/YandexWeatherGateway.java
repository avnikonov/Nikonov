package ru.testing.gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ru.testing.entities.Weather;

@Slf4j
public class YandexWeatherGateway {
    private static final String URL = "https://api.weather.yandex.ru/v1/informers";
    private static final String TOKEN = "";

    @SneakyThrows
    public Weather getWeather(String latitude, String longitude, String language) {
        Gson gson = new Gson();
        HttpResponse<String> response = Unirest.get(URL)
                .header("Accept", "*/*")
                .header("X-Yandex-API-Key", TOKEN)
                .queryString("lat", latitude)
                .queryString("lon", longitude)
                .queryString("lang", language)
                .asString();
        String strResponse = response.getBody();
        log.info("response: "+strResponse);
        return gson.fromJson(strResponse, Weather.class);
    }
}