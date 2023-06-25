package pages;

import java.util.Random;

import javax.swing.text.html.parser.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {
    public RegistrationPage (WebDriver driver) {
        super(driver);
    }

    String baseUrl = "https://demo.nopcommerce.com/";
    By registerBy = By.className("ico-register");
    By genderMaleBy = By.id("gender-male");
    By genderFemaleBy = By.id("gender-female");
    By firstNameBy = By.id("FirstName");
    By lastNameBy = By.id("LastName");
    By dayOfBirthBy = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[20]");
    By monthOfBirthBy = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[8]");
    By yearOfBirthBy = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[76]");
    By emailBy = By.id("Email");
    By companyNameBy = By.id("Company");
    By newsletterBy = By.id("Newsletter");
    By passwordBy = By.id("Password");
    By confirmPasswordBy = By.id("ConfirmPassword");
    By registerButtonBy = By.id("register-button");
    By firstNameErrorBy = By.id("FirstName-error");
    By lastNameErrorBy = By.id("LastName-error");
    By emailErrorBy = By.xpath("//*[@id=\"Email-error\"]");
    By wrongEmailBy = By.xpath("//*[@id=\"Email-error\"]");
    By emailAlreadyExistsBy = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li");
    By confirmPasswordErrorBy = By.id("ConfirmPassword-error");
    By passwordError1By = By.xpath("//*[@id=\"Password-error\"]/p");
    By passwordError2By = By.xpath("//*[@id=\"Password-error\"]/ul/li");

    //By loginButtonBy = By.id("login-button");
    //By errorMessageBy = By.xpath("//*[@id=\'login_button_container\']/div/form/div[3]");


    public RegistrationPage goToBaseUrl(){
        driver.get(baseUrl);
        return this;
    }

    public RegistrationPage clickOnRegister(){
        click(registerBy);
        return this;
    }

    public RegistrationPage login (String username, String password){
        writeText(passwordBy, password);
        //click(loginButtonBy);
        return this;
    }

    public RegistrationPage clickOnFemale(){
        click(genderFemaleBy);
        return this;
    }

    public RegistrationPage enterFirstAndLastName (String firstName, String lastName){
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        return this;
    }

    public RegistrationPage clickOnDateOfBirth (){
        click(dayOfBirthBy);
        click(monthOfBirthBy);
        click(yearOfBirthBy);
        return this;
    }

    public RegistrationPage enterEmail (String email){
        writeText(emailBy, email);
        return this;
    }

    public RegistrationPage enterCompany (String company){
        writeText(companyNameBy, company);
        return this;
    }

    public RegistrationPage clickOnNewsletter (){
        click(newsletterBy);
        return this;
    }

    public RegistrationPage enterPassword(String password, String ConfirmPassword){
        writeText(passwordBy, password);
        writeText(confirmPasswordBy, ConfirmPassword);
        return this;
    }

    public RegistrationPage clickOnRegisterButton (){
        click(registerButtonBy);
        return this;
    }

    public  RegistrationPage verifyUnsuccessfulRegistrationEmptyFirstName(String expectedText){
        String actualText = readText(firstNameErrorBy);
        assertTextEquals(expectedText, actualText);
        return this; 
    }

    public RegistrationPage verifyUnsuccessfulRegistrationEmptyLastName(String expectedText){
        String actualText = readText(lastNameErrorBy);
        assertTextEquals(expectedText, actualText);
        return this; 
    }

    public RegistrationPage verifyUnsuccessfulRegistrationEmptyEmail(String expectedText){
        String actualText = readText(emailErrorBy);
        assertTextEquals(expectedText, actualText);
        return this; 
    }

    public RegistrationPage verifyUnsuccessfulRegistrationWrongEmail(String expectedText){
        String actualText = readText(wrongEmailBy);
        assertTextEquals(expectedText, actualText);
        return this; 
    }

    public RegistrationPage verifyUnsuccessfulRegistrationEmailAlreadyExists(String expectedText){
        String actualText = readText(emailAlreadyExistsBy);
        assertTextEquals(expectedText, actualText);
        return this; 
    }

    public RegistrationPage verifyUnsuccessfulRegistrationPasswordEmpty (String expectedText){
        String actualText = readText(confirmPasswordErrorBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public RegistrationPage verifyUnsuccessfulRegistrationConfirmPasswordEmpty (String expectedText){
        String actualText = readText(confirmPasswordErrorBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public RegistrationPage verifyUnsuccessfulRegistrationPasswordDoNotMatch (String expectedText){
        String actualText = readText(confirmPasswordErrorBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public RegistrationPage verifyUnsuccessfulRegistrationInvalidPassword1 (String expectedText){
        String actaulText = readText(passwordError1By);
        assertTextEquals(expectedText, actaulText);
        return this;
    }

    public RegistrationPage verifyUnsuccessfulRegistrationInvalidPassword2 (String expectedText){
        String actualText = readText(passwordError2By);
        assertTextEquals(expectedText, actualText);
        return this;
    }
}
    
