package ru.testing.gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ru.testing.entities.Translation;

@Slf4j
public class YandexTranslateGateway {
    private static final String URL = "https://translate.yandex.net/api/v1.5/tr.json/translate";
    private static final String TOKEN = "trnsl.1.1.20190828T181138Z.a297420ecf6fdb7b.72ad3b4c90a993e47eaec5b06768e37e361e90b0";

    @SneakyThrows
    public Translation getTranslate(String textForTranslation) {
        Gson gson = new Gson();
        HttpResponse<String> response = Unirest.post(URL)
                .header("Accept", "*/*")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .field("key", TOKEN)
                .field("text", textForTranslation)
                .field("lang", "en-ru")
                .field("format", "plain")
                .field("options", 1)
                .asString();

        String strResponse = response.getBody();
        log.info("response: "+strResponse);
        return gson.fromJson(strResponse, Translation.class);
    }
}