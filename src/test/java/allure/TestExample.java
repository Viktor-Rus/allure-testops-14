package allure;

import io.qameta.allure.AllureId;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestExample {


    @Test()
    @AllureId("12898")
    @DisplayName("Авторизация через google")
    @Owner("allure8")
    void authorizationWithGoogle() {
        step("Открываем главную страницу");
        step("Кликаем на значок авторизации через Google");
        step("Вводим логин/пароль и нажимаем кнопку Войти");
        step("Проверяем что пользователь авторизовался");
    }

    @Test
    @AllureId("12905")
    @DisplayName("Проверка отображения логотипа на главной странице")
    @Owner("allure8")
    void checkLogoVisible() {
        step("Перейти на главную страницу приложения");
        step("Убедиться что в левом верхнем углу отображается логотип приложения");
    }


}
