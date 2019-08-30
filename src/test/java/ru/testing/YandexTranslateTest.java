package ru.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testing.entities.Translation;
import ru.testing.gateway.YandexTranslateGateway;

public class YandexTranslateTest {
    private static final String TEXTFORTRANSLATION = "Hello World!";
    private static final String PURPOSEFORTRANSLATION = "Всем Привет!";


    @Test
    @DisplayName("Перевод строки!")
    public void currentTranslation(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        Translation translation = yandexTranslateGateway.getTranslate(TEXTFORTRANSLATION);
        Assertions.assertEquals(PURPOSEFORTRANSLATION, translation.getText().get(0));
    }
}