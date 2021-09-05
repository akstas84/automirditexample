# Автотесты для сайта https://www.mir-dit.ru/
___
## Используемые технологии и инструменты
| GitHub | IntelliJ IDEA | Java | Gradle | Junit5 | Selenide |
|:------:|:----:|:----:|:------:|:------:|:--------:|
| <img src="images/GitHub.svg" width="40" height="40"> | <img src="images/IDEA.svg" width="40" height="40"> | <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |

| Jenkins | Selenoid | Allure Report | Allure TestOps | Telegram |
|:--------:|:-------------:|:---------:|:-------:|:--------:|
| <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | <img src="images/Allure Report.svg" width="40" height="40"> | <img src="images/Allure TestOps.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |
___

## Список тестов
* 1 Успешный переход на страницу https://www.mir-dit.ru/
    * Переходим на https://www.mir-dit.ru/
    * Проверяем что есть надпись "Мир данных ИТ"
    * 
* 2 Успешное изменение языка на русский
    * Переходим на 'www.mir-dit.ru/administration
    * Проверка кликабельности кнопки "Заказать аудит баз данных"
    * Проверяем что у кнопки есть надпись "Заказать аудит баз данных"
  
* 3 Успешный переход на страницу https://www.mir-dit.ru/development
    * Переходим на https://www.mir-dit.ru/development
    * Проверяем что есть надпись "Мир данных ИТ | Разработка"

* 4 Успешный переход на страницу https://www.mir-dit.ru/tenders
    * Переходим на https://www.mir-dit.ru/tenders
    * Проверяем что есть надпись "Центр разработки «МИР ДАННЫХ ИТ"

* 5 Успешный переход на страницу https://www.mir-dit.ru/promotion
    * Переходим на https://www.mir-dit.ru/promotion
    * Проверяем что есть надпись "Мир данных ИТ | Продвижение"

* 6 Успешный переход на страницу https://www.mir-dit.ru/oracle
    * Переходим на https://www.mir-dit.ru/oracle
    * Проверяем что есть надпись "Мир данных ИТ | Oracle"

* 7 Успешный переход на страницу https://www.mir-dit.ru/articles
    * Переходим на https://www.mir-dit.ru/articles
    * Проверяем что есть надпись "Мир данных ИТ | Статьи и публикации"

---

## Как запускать тесты

Запуск тестов происходит через джобу в Jenkins
https://jenkins.autotests.cloud/job/job-start-mirdit-tests/

![alt "бот в телеграмме"](./images/Jenkins.png "бот в телеграмме")


### Run tests with filled local.properties:

```bash
gradle clean mirdit
```

### Run tests with not filled local.properties:

```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

### Serve allure report:

```bash
allure serve build/allure-results
```

---

## Оповещение о результатах прохождения тестов происходит через бот в телеграм

После прохождения всех тестов приходит отчет в телегу

![alt "бот в телеграмме"](./images/telegram.png "бот в телеграмме")

---

## Анализ результатов

Более подробно с результатми тестов (шаги, скриншоты, видео прохождения теста, page source и browser console log) можно ознакомиться в:
* Jenkins через Allure Reports
  (перейти по ссылке в отчете телеграм)
* и в Allure TestOps.

## Анализ результатов в Jenkins через Allure Reports
![alt "Allure Reports"](./images/Allure.png "Allure Reports")
## Анализ результатов в Allure TestOps

![alt "Allure TestOps"](./images/AllureTestOps.png "Allure TestOps")

## Видео прохождения теста "3 Успешный поиск тура", взятое из среды выполнения (из Selenoid)

![alt "Video from Selenoid"](./images/selenoid.gif "Video from Selenoid")