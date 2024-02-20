package stepDefinitions;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;
    @Given("the user opens the {string} browser")
    public void the_user_opens_the_browser(String browser) {

        loginPage = new LoginPage(BrowserFactory.driver);
    }
    @Then("the user navigates to the {string}")
    public void the_user_navigates_to_the(String url) {
        driver.get(url);
    }
    @Then("the user should see username, password and login button")
    public void the_user_should_see_username_password_and_login_button() {
        Assert.assertTrue(loginPage.isUsernameInputDisplayed());
        Assert.assertTrue(loginPage.isPasswordInputDisplayed());
        Assert.assertTrue(loginPage.isLoginButtonInputDisplayed());

    }

    @Then("the user perform login with {string} and {string}")
    public void the_user_perform_login_with_and(String username, String password) {
        loginPage.doLogin(username,password);

    }
    @Then("the user should be navigated to the product page")
    public void the_user_should_be_navigated_to_the_product_page() {

        boolean isDisplayed = driver.findElement(By.className("product_label")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @And("the user closes the browser")
    public void the_user_closes_the_browser() {

        driver.quit();


    }
