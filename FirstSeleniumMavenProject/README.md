**[ENG]**


**Stack:**

- Java 11

- Selenium v.3

- TestNG v.7.4

- WebDriverManager v.4.4.1

***


**Description:**

Designed for the development of UI autotests for the Yandex Market service, section Computers -> Laptops

***

**YandexMarketTest**

The script:

1. Launch a full-screen browser.

2. Go to the website https://market .yandex.ru/

3. Go to the "Computers" section and select "Laptops".

4. Set the search parameters:
- Manufacturer: Lenovo
- Price: from 25,000 rubles to 30,000 rubles.

5. On the first page with the results, make sure that the products found match the specified search parameters.

6. Close the browser.



**Running the test:**

The test is run in YandexMarketTest, the test passes all the steps of the script, performs 3 checks:
1. All search results contain "Lenovo"
2. All search results display a price of more than 25,000
3. All search results display a price less than 30,000

**Configurable parameters:**

- Selecting a directory section: change the HomePage on line 38 "Computers" to any other section

- Selecting a page with products inside the section: change the HomePage on line 39 "Laptops" to any other page inside the section

- Manufacturer's choice:

1. change in the LaptopPage on line 32 "Lenovo" to any other manufacturer listed
2. change in YandexMarketTest on line 33 "Lenovo" to the value set in LaptopPage

- Changing the search values Price from and Price to:

1. change in LaptopPage on line 34-35 "25000" and "30000" to any values from valid for the corresponding fields
2. change in YandexMarketTest on line 42-43 "25000" and "30000" to the values set in LaptopPage

***

**[RU]**


**Стек:**

- Java 11 

- Selenium v.3

- TestNG v.7.4

- WebDriverManager v.4.4.1

***


**Описание:**

Предназначен для разработки UI-автотестов  для сервиса Yandex Market, раздел Компьютеры -> Ноутбуки, тесты запускаются в GoogleChrome

***

**YandexMarketTest**

Сценарий:

1. Запуск развёрнутого на весь экран браузера.

2. Переход на сайт https://market.yandex.ru/

3. Перейти к разделу "Компьютеры" и выбрать "Ноутбуки".

4. Задать параметры поиска:
- Производитель: Lenovo 
- Цена: от 25000 руб. до 30000 руб.

5. На первой странице с результатами убедиться, что найденные товары соответствуют заданным параметрам поиска.

6. Закрыть браузер.



**Запуск теста:**

Запуск теста производится в YandexMarketTest, тест проходит все шаги сценария, проводит 3 проверки: 
1. Во всех результатах поиска содержится "Lenovo"
2. Во всех результатах поиска отображается цена более 25000
3. Во всех результатах поиска отображается цена менее 30000

**Настраиваемые параметры:** 

- Выбор раздела каталога: изменить в HomePage на 38 строке "Компьютеры" на любой другой раздел

- Выбор страницы с продуктами внутри раздела: изменить в HomePage на 39 строке "Ноутбуки" на любую другую страницу внутри раздела

- Выбор производителя:

1. изменить в LaptopPage на 32 строке "Lenovo" на любого другого производителя представленного в списке
2. изменить в YandexMarketTest на 33 строке "Lenovo" на значение установленное в LaptopPage

- Изменение поисковых значений Цена от и Цена до: 

1. изменить в LaptopPage на 34-35 строке "25000" и "30000" на любые значения из валидных для соответствующих полей
2. изменить в YandexMarketTest на 42-43 строке "25000" и "30000" на значения установленные в LaptopPage


