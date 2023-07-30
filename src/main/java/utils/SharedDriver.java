package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SharedDriver {
    private static final WebDriver REAL_DRIVER;

    static {
        String browser = System.getProperty("browser", "firefox").toLowerCase();
        switch (browser) {
            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                REAL_DRIVER = new FirefoxDriver();
            }
            case "edge" -> {
                WebDriverManager.edgedriver().setup();
                REAL_DRIVER = new EdgeDriver();
            }
            default -> {
                WebDriverManager.chromedriver().setup();
                REAL_DRIVER = new ChromeDriver();
            }
        }
        Runtime.getRuntime().addShutdownHook(new Thread(REAL_DRIVER::quit));
    }

    public SharedDriver() {
    }

    public static WebDriver getDriver() {
        return REAL_DRIVER;
    }
}