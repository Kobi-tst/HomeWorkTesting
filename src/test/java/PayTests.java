import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayTests {
    static WebDriver driver;
    public static MtsHomePage mtsHomePage;
    public static final String PAGE_URL = "https://www.mts.by/";

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.get(PAGE_URL);
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    @DisplayName("Заголовок формы")
    public void title() {
        String name = "Заголовок";
        try {
            String actualValue = mtsHomePage.getPaySectionTitle();
            assertEquals("Онлайн пополнение без комиссии", actualValue, name + " не совпадает");
            System.out.println(name + " совпадает: " + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }

    @ParameterizedTest
    @DisplayName("Картинки платежных систем")
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    void payPics(String src) {
        try {
            assertTrue(mtsHomePage.isDisplayedImg(src), "Картинка " + src + " не отображается");
            System.out.println("Картинка " + src + " отображается");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Картинка " + src + " не найдена");
        }
    }

    @Test
    @DisplayName("Ссылка 'Подробнее о сервисе'")
    void detailLink() {
        String urlLink = null;
        try {
            urlLink = mtsHomePage.getLinkUrl();
            int linkResponseCode = mtsHomePage.getRespCode(urlLink);
            assertTrue(linkResponseCode < 400, "Ссылка " + urlLink + " битая (код: " + linkResponseCode + ")");
            System.out.println("Ссылка " + urlLink + " рабочая (код: " + linkResponseCode + ")");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Нет ссылки");
        } catch (MalformedURLException e) {
            assertTrue(false, "Не корректный url: " + urlLink);
        } catch (IOException e) {
            assertTrue(false, "Проблема с соединением");
        }
    }

    @Test
    @DisplayName("Работа кнопки 'Продолжить'")
    void payForm() {
        String name = "Окно оплаты";
            mtsHomePage.clickCancelCookie();
            mtsHomePage.setPhoneField("297777777");
            mtsHomePage.setSumField("50");
            mtsHomePage.clickPayBtn();
            System.out.println(name + " открылось");
        // Ожидание загрузки фрейма
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@style='visibility: visible;'][1]")));

    }
}