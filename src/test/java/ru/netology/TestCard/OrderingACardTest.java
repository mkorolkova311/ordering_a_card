package ru.netology.TestCard;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class OrderingACardTest {
    @Test
    void shouldSumbitRequestTest(){
       open("http://localhost:7777/");
        SelenideElement form = $(".form");
        form.$("[data-test-id=name] input").setValue("Маргарита Королькова");
        form.$("[data-test-id=phone] input").setValue("+798122222");
        form.$("[data-test-id=agreement]").click();
        form.$("[type=button]").click();
        $("[data-test-id=order-success]").shouldHave(Condition.exactText(" Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
