package ru.akstas84.qa.tests.mirdit;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Tag;
import ru.akstas84.qa.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.akstas84.qa.tests.TestBase;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("mirdit")
public class mirditTests extends TestBase {

  @Test
  @Description("Soon to be implemented by you (or QA.GURU engineers)")
  @DisplayName("Page main should have text")
  void mainPageTest() {
    step("Open url 'https://www.mir-dit.ru/'", () ->
            open("https://www.mir-dit.ru/"));

    step("Page title should have text 'Мир данных ИТ'", () -> {
      String expectedTitle = "Мир данных ИТ";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("UI check main title test")
  @DisplayName("Page administration should have enabled button with text")
  void buttonInAdministrationPageTest() {
    step("Open url 'www.mir-dit.ru/administration'", () ->
            open("https://www.mir-dit.ru/administration"));

    step("Page should have button with text 'Заказать аудит баз данных'" +
            " and check is clickable", () -> {
      Condition clickable = and("can be clicked", visible, Condition.enabled);
      $(".the-button--danger").shouldHave(text("Заказать аудит баз данных"));
      $(".the-button--danger").shouldBe(clickable);
    });
  }

  @Test
  @Description("UI check development title test")
  @DisplayName("Page title should have header text")
  void titleDevelopmentPageTest() {
    step("Open url 'https://www.mir-dit.ru/development'", () ->
            open("https://www.mir-dit.ru/development"));

    step("Центр разработки «МИР ДАННЫХ ИТ»'", () -> {
      String expectedTitle = "Мир данных ИТ | Разработка";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("UI check tenders title test")
  @DisplayName("Page title should have header text")
  void titleTendersPageTest() {
    step("Open url 'https://www.mir-dit.ru/tenders'", () ->
            open("https://www.mir-dit.ru/tenders"));

    step("Page title should have text 'Центр разработки «МИР ДАННЫХ ИТ'", () -> {
      String expectedTitle = "Мир данных ИТ | Тренды";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("UI check promotion title test")
  @DisplayName("Page promotion title should have header text")
  void titlePromotionTest() {
    step("Open url 'https://www.mir-dit.ru/promotion'", () ->
            open("https://www.mir-dit.ru/promotion"));

    step("Page title should have text 'Продвижение партнеров'", () -> {
      String expectedTitle = "Мир данных ИТ | Продвижение";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("UI check oracle title test")
  @DisplayName("Page oracle title should have header text")
  void titleOraclePageTest() {
    step("Open url 'https://www.mir-dit.ru/oracle'", () ->
            open("https://www.mir-dit.ru/oracle"));

    step("Page title should have text 'Мир данных ИТ'", () -> {
      String expectedTitle = "Мир данных ИТ | Oracle";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("UI check articles/ title test")
  @DisplayName("Page articles title should have header text")
  void titleArticlesTest() {
    step("Open url 'https://www.mir-dit.ru/articles/'", () ->
            open("https://www.mir-dit.ru/articles/"));

    step("Page title should have text 'Статьи и публикации'", () -> {
      String expectedTitle = "Мир данных ИТ | Статьи и публикации";
      String actualTitle = title();

      assertThat(actualTitle).isEqualTo(expectedTitle);
    });
  }

  @Test
  @Description("console test")
  @DisplayName("Page console log should not have errors")
  void consoleShouldNotHaveErrorsTest() {
    step("Open url 'https://www.mir-dit.ru/'", () ->
            open("https://www.mir-dit.ru/"));

    step("Console logs should not contain text 'SEVERE'", () -> {
      String consoleLogs = DriverUtils.getConsoleLogs();
      String errorText = "SEVERE";

      assertThat(consoleLogs).doesNotContain(errorText);
    });
  }
}
