package ru.testing.gateway;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import ru.testing.entities.Translate;

import javax.print.DocFlavor;

@Slf4j
public class YandexTranslateGateway {
    private static final String URL = "https://translate.yandex.net/api/v1.5/tr/translate";
    private static final String TOKEN = "trnsl.1.1.20190828T181138Z.a297420ecf6fdb7b.72ad3b4c90a993e47eaec5b06768e37e361e90b0";

    @SneakyThrows
    public Translate getTranslate(String text, String lang, String format, String options) {
        Gson gson = new Gson();
        HttpResponse<String> response = Unirest.post(URL)
                .header("Accept", "*/*")
                .field("key", TOKEN)
                .field("text", text)
                .field("lang", lang)
                .field("format", format)
                .field("options", options)
                .asString();
        String strResponse = response.getBody();
        log.info("response: "+strResponse);
        return gson.fromJson(strResponse, Translate.class);
    }
}