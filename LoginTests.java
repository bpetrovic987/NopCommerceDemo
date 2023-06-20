package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest{

    public LoginPage loginPage;
    public HomePage homePage;
    
    String firstName = "Biljana";
    String lastName = "Ristic";
    String email = "bristic@gmail.com";
    String password = "bristic";
    String confirmPassword = "bristic";
    String company = "Smederevo Company";
    String expectedTextRegistrationCompleted = "Your registration completed";
   

    @Test
    public void verifySuccessfulRegistration(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.goToBaseUrl();
        loginPage.clickOnRegister();
        loginPage.clickOnFemale();
        loginPage.enterFirstAndLastName(firstName, lastName);
        loginPage.clickOnDateOfBirth();
        loginPage.enterEmail(email);
        loginPage.enterCompany(company);
        loginPage.clickOnNewsletter();
        loginPage.enterPassword(password, confirmPassword);
        loginPage.clickOnRegisterButton();
        homePage.verifySuccessfulRegistration(expectedTextRegistrationCompleted);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }
    
}
