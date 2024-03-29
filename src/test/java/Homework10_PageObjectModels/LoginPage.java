package Homework10_PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(css = "#user-name")
    WebElement userName;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#login-button")
    WebElement loginButton;
    // first page opening, user name and pass must to be written and login button must to be clicked

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }
    public void loginUser(String userName, String password){
        System.out.println("Login user method");
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.loginButton.click();

    }
}

