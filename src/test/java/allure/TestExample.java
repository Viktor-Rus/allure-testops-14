package allure;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestExample {

    @Test()
    @Owner("vaurusov")
    @DisplayName("Проверка отображения логотипа на главной странице")
    void mainLogoVisible() {
        step("Проверка отображаения логотипа на главной странице ", ()-> {
            System.out.println("Удачно");
        });

    }


}
