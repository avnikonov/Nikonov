package ru.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.entities.Translate;
import ru.testing.gateway.YandexTranslateGateway;

public class YandexTranslateTest {
    private static final String TEXT = "Всем привет!";


    @Test
    @DisplayName("Перевод строки")
    public void getTranslate(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        Translate newTranslate = yandexTranslateGateway.getTranslate(TEXT);
        Assertions.assertEquals(newTranslate.getText().toString(), TEXT);
    }
}