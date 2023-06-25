package tests;

import java.util.UUID;

import org.junit.Test;

import pages.HomePage;
import pages.RegistrationPage;

public class RegistrationTests extends BaseTest{

    public RegistrationPage loginPage;
    public HomePage homePage;
    
    String firstName = "Biljana";
    String emptyFirstName = "";
    String lastName = "Ristic";
    String emptyLastName = "";
    String randomEmail = randomEmail();
    String email = "bristic@sdgrejanje.rs";
    String emptyEmail = "";
    String wrongEmail = "2222222";
    String password = "bristic";
    String invalidPassword = "333";
    String invalidConfirmPassword = "333";
    String confirmPassword = "bristic";
    String emptyPassword = "";
    String emptyConfirmPassword = "";
    String wrongConfirmPassword = "milica";
    String company = "Smederevo Company";
    String expectedTextRegistrationCompleted = "Your registration completed";
    String expectedTextErrorFirstName = "First name is required.";
    String expectedTextErrorLastName = "Last name is required.";
    String expectedTextErrorEmail = "Email is required.";
    String expectedTextWrongEmail = "Wrong email";
    String expectedTextEmailAlreadyExists = "The specified email already exists";
    String expectedTextPasswordRequired = "Password is required.";
    String expextedTextEmptyPasswordField = "The password and confirmation password do not match.";
    String expectedTextEmptyConfirmPassword = "Password is required.";
    String expectedTextPasswordsDoNotMatch = "The password and confirmation password do not match.";
    String expectedTextInvalidPassword1 = "Password must meet the following rules:";
    String expectedTextInvalidPassword2 = "must have at least 6 characters";

    private static String randomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@gmail.com";
    }


    @Test
    public void verifySuccessfulRegistration(){
        RegistrationPage registerPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registerPage.goToBaseUrl();
        registerPage.clickOnRegister();
        registerPage.clickOnFemale();
        registerPage.enterFirstAndLastName(firstName, lastName);
        registerPage.clickOnDateOfBirth();
        registerPage.enterEmail(randomEmail);
        registerPage.enterCompany(company);
        registerPage.clickOnNewsletter();
        registerPage.enterPassword(password, confirmPassword);
        registerPage.clickOnRegisterButton();
        homePage.verifySuccessfulRegistration(expectedTextRegistrationCompleted);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }


    @Test
    public void unsuccessfulRegistrationEmptyFirstName(){
        RegistrationPage registerPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registerPage.goToBaseUrl();
        registerPage.clickOnRegister();
        registerPage.clickOnFemale();
        registerPage.enterFirstAndLastName(emptyFirstName, lastName);
        registerPage.clickOnDateOfBirth();
        registerPage.enterEmail(randomEmail);
        registerPage.enterCompany(company);
        registerPage.clickOnNewsletter();
        registerPage.enterPassword(password, confirmPassword);
        registerPage.clickOnRegisterButton();
        registerPage.verifyUnsuccessfulRegistrationEmptyFirstName(expectedTextErrorFirstName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationEmptyLastName(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, emptyLastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(randomEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, confirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationEmptyLastName(expectedTextErrorLastName);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

     @Test
    public void unsuccessfulRegistrationEmptyEmail(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(emptyEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, confirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationEmptyEmail(expectedTextErrorEmail);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationWrongEmail(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(wrongEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, confirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationWrongEmail(expectedTextWrongEmail);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationEmailAlreadyExists(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(email);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, confirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationEmailAlreadyExists(expectedTextEmailAlreadyExists);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationPasswordEmpty(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(randomEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(emptyPassword, confirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationPasswordEmpty(expextedTextEmptyPasswordField);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationConfirmPasswordEmpty(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(randomEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, emptyConfirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationConfirmPasswordEmpty(expectedTextEmptyConfirmPassword);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

     @Test
    public void unsuccessfulRegistrationPasswordsDoNotMatch(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(randomEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(password, wrongConfirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationPasswordDoNotMatch(expectedTextPasswordsDoNotMatch);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    @Test
    public void unsuccessfulRegistrationRequiredPassword(){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        HomePage homePage = new HomePage(driver);
        registrationPage.goToBaseUrl();
        registrationPage.clickOnRegister();
        registrationPage.clickOnFemale();
        registrationPage.enterFirstAndLastName(firstName, lastName);
        registrationPage.clickOnDateOfBirth();
        registrationPage.enterEmail(randomEmail);
        registrationPage.enterCompany(company);
        registrationPage.clickOnNewsletter();
        registrationPage.enterPassword(invalidPassword, invalidConfirmPassword);
        registrationPage.clickOnRegisterButton();
        registrationPage.verifyUnsuccessfulRegistrationInvalidPassword1(expectedTextInvalidPassword1);
        registrationPage.verifyUnsuccessfulRegistrationInvalidPassword2(expectedTextInvalidPassword2);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
    }

    
 
   // First name and last name are equals??
   // Password already exists????
}
