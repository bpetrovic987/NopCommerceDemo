package pages;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage (WebDriver driver) {
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
    //By loginButtonBy = By.id("login-button");
    //By errorMessageBy = By.xpath("//*[@id=\'login_button_container\']/div/form/div[3]");


    public LoginPage goToBaseUrl(){
        driver.get(baseUrl);
        return this;
    }

    public LoginPage clickOnRegister(){
        click(registerBy);
        return this;
    }

    public LoginPage login (String username, String password){
        writeText(passwordBy, password);
        //click(loginButtonBy);
        return this;
    }

    public LoginPage clickOnFemale(){
        click(genderFemaleBy);
        return this;
    }

    public LoginPage enterFirstAndLastName (String firstName, String lastName){
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        return this;
    }

    public LoginPage clickOnDateOfBirth (){
        click(dayOfBirthBy);
        click(monthOfBirthBy);
        click(yearOfBirthBy);
        return this;
    }

    public LoginPage enterEmail (String email){
        writeText(emailBy, email);
        return this;
    }

    public LoginPage enterCompany (String company){
        writeText(companyNameBy, company);
        return this;
    }

    public LoginPage clickOnNewsletter (){
        click(newsletterBy);
        return this;
    }

    public LoginPage enterPassword(String password, String ConfirmPassword){
        writeText(passwordBy, password);
        writeText(confirmPasswordBy, ConfirmPassword);
        return this;
    }

    public LoginPage clickOnRegisterButton (){
        click(registerButtonBy);
        return this;
    }

}
    
