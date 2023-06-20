package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

      public HomePage (WebDriver driver) {
        super(driver);
    }

    By expectedTextRegistrationCompletedBy = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
    

    public HomePage verifySuccessfulRegistration(String expectedText){
        String actualText = readText(expectedTextRegistrationCompletedBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

}
