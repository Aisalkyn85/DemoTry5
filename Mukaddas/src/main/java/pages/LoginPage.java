package pages;

public class LoginPage {
    WebDriver driver;



    public  LoginPage(WebDriver driver){

        this.driver=driver;
    }

    public void doLogin(String username, String password){
        driver.findElement(By.id("user-name"));
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
    public boolean isUsernameInputDisplayed(){
        return driver.findElement(By.id("user-name")).isDisplayed();}

    public boolean isPasswordInputDisplayed(){
        return driver.findElement(By.id("password")).isDisplayed();
    }
    public boolean isLoginButtonInputDisplayed(){
        return driver.findElement(By.id("login-button")).isDisplayed();
    }

}
}
