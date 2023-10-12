package seminar_5_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
//        webDriver.findElement(By.xpath("//*[text() = 'https://www.selenium.dev']"));
        String URL = webDriver.getCurrentUrl();
        assertEquals(URL, "https://www.selenium.dev" );
        webDriver.quit();
    }
}
