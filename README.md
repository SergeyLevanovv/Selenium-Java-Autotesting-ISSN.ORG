# Selenium-Java-Autotesting-ISSN.ORG
`Selenium-Java-Autotesting`

<p align="center"><a href="https://selenium.dev"><img src="https://selenium.dev/images/selenium_logo_square_green.png" width="100" alt="Selenium"/></a></p>

`Selenium` — это бесплатная среда для автоматизированного тестирования (с открытым исходным кодом), которая используется при проверке веб-приложений в различных браузерах и на разных платформах. Для создания тестовых сценариев`Selenium` мы можем использовать разные языки программирования, такие как `Java, C#, Python, Ruby , PHP` и т.д. 


## 1. Как установить JDK version 17 на Windows?

Средства разработки `Java` используют 3 основные технологии, которые позволяют пользователям писать, дорабатывать и запускать приложения:

* `JDK (Java Development Kit)` – для создания приложений;
* `JVM (Java Virtual Machine)` – виртуальная машина для запуска приложений;
* `JRE (Java Runtime Environment)` – платформа для исполнения приложений и JVM.

Вам необходимо скачать JDK, если вы собираетесь работать в таких Java-средах как:

`Sun Java Studio Creator`;
`NetBeans IDE`;
`IntelliJ IDEA`;
`Borland JBuilder`;
`JDeveloper`;
`Eclipse` и других.

Прежде чем установить `JDK` на Windows 11 или 10 проверьте её наличие через командную строку с помощью команды `java – -version`. Если среда уже установлена, то можно начинать работу, если же нет, то скачиваете подходящую для вашей системы с официального сайта или другого источника. Затем запускаете установочный файл и ставите комплект как обычную программу. 

* Скачать `Java Platform JDK 17` с официального сайта:
```
https://www.oracle.com/java/technologies/downloads/
```
* Установить `java` с настройками по умолчанию
* Если машина Windows нажмите `Win+R` и наберите `sysdm.cpl` перейдите во вкладку дополнительно/переменные среды.
* Создайте переменную: `JAVA_HOME`.
  * Значение переменной: `<путь куда установлена java>` например `(C:\Program Files\Java\jdk1.8.0_65)`.
* Также нужно добавить значение: `<путь куда установлена java>\bin` в переменную `PATH`: Нажать `Edit` и добавить: `C:\Program Files\Java\jdk1.8.0_65\bin`
После установки переменной следует перезапустить cmd консоль. Проверим `java` в `cmd`: `java –version`. Если вы видите `java-версию` в `console`, значит, установка `java` и обновление прошли успешно.


## 2. Как установить `IntelliJ IDEA`?
`IntelliJ IDEA` — это интегрированная среда разработки `(IDE)`, то есть система программных средств для создания проектов на разных языках программирования.
* Скачать `ntelliJ IDEA` с официального сайта:
```
* https://www.jetbrains.com/ru-ru/idea/
```
* Установить `IntelliJ IDEA` с настройками по умолчанию

## 3. Как загрузить драйвер клиента `Selenium Java`?
* Скачать `Selenium Java Client Driver` можно перейдя по ссылке:
```
https://www.selenium.dev/downloads/.
```
На странице будет список клиентских драйверов для других языков, но мы выбираем только драйвер для `Java`
* Эта загрузка скачивается в виде ZIP-файла с именем `«selenium-3.14.0.zip»`. Для дальнейшей простоты использования распакуйте содержимое этого ZIP-файла на диске C, чтобы у вас был каталог `«C:\selenium\»`.

## 4. Установка драйвера браузера: Windows
* Для установки откройте сайт
```
https://sites.google.com/a/chromium.org/chromedriver/ downloads
```
и скачайте ту версию `ChromeDriver`, которая соответствует версии вашего браузера.
* Чтобы узнать свою `browser version`, откройте новое окно в Chrome, в строке поиска введите:
```
chrome://version/
```
и нажмите `Enter`. В верхней строке вы увидите информацию информацию о `browser version`.
* Разархивируйте скачанный файл. Создайте на диске C: папку webdrivers и поместите разархивированный ранее файл chromedriver.exe в папку C:\webdrivers.
*  Добавьте в системную переменную `PATH` папку `C:\webdrivers`.


## 5. Автономный сервер `Selenium (Selenium Server Standalone)`
Для запуска теста на удаленной машине нужно запустить на ней сервер, который будет принимать по сети команды, запускать браузер и выполнять их. Предполагается, что `Java` на машине уже установлена. Запуск сервера выполняется следующей командой, набранной в командной строке:
```bash
cd ..
```
```bash
cd ..
```
`Selenium Grid` — это инструмент, который запускает тесты на нескольких физических или виртуальных машинах, чтобы скрипты могли выполняться параллельно. По сути, `Selenium Grid` — это кластер, состоящий из нескольких `Selenium-серверов`. Он предназначен для организации распределённой сети, позволяющей параллельно запускать несколько браузеров на большом количестве машин.
* `Hub` — это сервер, который выступает в качестве центральной точки, где будут запускаться тесты. `Selenium Grid` имеет только один концентратор и запускается на одной машине один раз.
* `Node` — это `Selenium-экземпляры`, которые прикреплены к концентратору, и которые выполняют тесты. В сетке может быть один или несколько узлов, которые могут быть любой ОС и могут содержать любой из поддерживаемых браузеров.


#  1. Selenium + Java
## 1.1 Подключите Selenium к проекту IntelliJ

Необходимо перейти по ссылке

    https://www.selenium.dev/downloads/
    
Найдите `Java` среди доступных языков и нажмите на `Download`

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/efe013f2-f986-4f4b-9816-c0a448fe56fb)

Распакуйте `archive`. Содержимое будет примерно таким:

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/d7aa20b8-87cf-4fe1-bb61-0faa51f76d25)

Откройте свой проект `IntelliJ` и нажмите `File → Project Structure` Выбрать `Modules`, затем нажмите на плюс справа и выберите `1. JARs or directories…`
Перейдите в папку, куда вы только что распаковали архив, и выберите все `.jar` файлы из корня и из `libs` подпапки.
Нажмите `OK`

![image](https://github.com/ArtemA1ekseev/selenium-java-testing/assets/113195869/749ba53c-a49f-45ee-9510-29876a37c937)

## 1.2 Подключение browser driver
Независимо от того, на каком языке программирования вы напишете код, операция подключения `browser driver` будет примерно одинаковой.

Об этом можно прочитать в статье [Connecting the browser driver in Selenium](https://testsetup.ru/selenium/#driver)

## 1.3 Простой тест

Чтобы убедиться, что `Selenium` успешно подключен, вставьте следующий код и скомпилируйте его.

```java
package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe"); //setting the path for chrome driver

        WebDriver driver = new ChromeDriver(); //creating object for chrome driver

        driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL
        

    }
}
```

Если вы не хотите или не можете редактировать `PATH` переменную, попробуйте зарегистрировать путь к драйверу - вставьте перед строкой `WebDriver driver = ...`

```java
driver.get("https://www.selenium.dev/selenium/web/web-form.html"); //opens the browser and navigates to the URL
```

#  2. Поиск элементов
## 2.1 Простой тест

Прежде всего, необходимо подключит `By` в `Java`, это делается следующим образом:

```java
import org.openqa.selenium.By;
```

Часто бывает недостаточно просто найти элемент. Чтобы выполнить какие-то действия над найденным, подключите `WebElement`

```java
import org.openqa.selenium.WebElement;
```

## 2.2 Заполнение простых форм
