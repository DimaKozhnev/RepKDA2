package file_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.loginField = loginField;
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
    @FindBy(xpath = "//*[contains(@id, 'passp-field-login')]")
    private WebElement loginField;
   


    @FindBy(xpath = "//html/body/div[6]/div[1]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/a/span/span")
    private WebElement loginBtn;

    public void clickLoginBtn(){
        loginBtn.click();
    }

//*[@id="passp:sign-in"]
    //*[@id="passp:sign-in"

}
