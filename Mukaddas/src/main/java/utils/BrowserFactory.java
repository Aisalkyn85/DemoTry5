package utils;

public class BrowserFactory {
    public static WebDriver driver;

    public static void setBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }else{
            driver = new EdgeDriver();
        }

    }

}
