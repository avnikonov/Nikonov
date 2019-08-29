package ru.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.entities.Translate;
import ru.testing.gateway.YandexTranslateGateway;

public class YandexTranslateTest {
    private static final String TEXTFORTRANSLATE = "Всем привет!";
    private static final String LANGFORTRANSLATE = "en-ru";
    private static final String FORMATFORTRANSLATE = "plain";
    private static final String OPTIONSFORTRANSLATE = "1";


    @Test
    @DisplayName("Перевод строки")
    public void getTranslate(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        Translate newTranslate = yandexTranslateGateway.getTranslate(TEXTFORTRANSLATE, LANGFORTRANSLATE, FORMATFORTRANSLATE, OPTIONSFORTRANSLATE);
        Assertions.assertEquals(newTranslate.getText().toString(), TEXTFORTRANSLATE);
    }
}