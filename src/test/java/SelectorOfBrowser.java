import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorOfBrowser {
    public WebDriver getWebDriver(String browser){
        switch (browser){
            case "chrome":
                return new ChromeDriver();
            case "yandex":
                System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\yandexdriver-24.1.0.2570-win64\\yandexdriver.exe");
                return new ChromeDriver();
            default:
                throw new RuntimeException("invalid browser name");
        }

}}
