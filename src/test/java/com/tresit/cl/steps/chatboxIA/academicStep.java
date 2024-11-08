package com.tresit.cl.steps.chatboxIA;
import com.tresit.cl.pages.chatboxIA.loginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.time.Duration;

public class academicStep extends loginPage {

    WebDriver driver = Serenity.getDriver();

    // Funciones de tiempo

    @Step("Tiempo de espera elemento especifico")
    public void waitUser(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textoEsperado")));
    }

    @Step("Tiempo de espera usuario")
    public void waitForUser() throws InterruptedException {
        Thread.sleep(4000);
    }
    //Login correcto

    @Step("Ingresar correo electrónico")
    public void typeEmail(String email) {
        txt_email.sendKeys(email);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password) {
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton iniciar sesión")
    public void clickLogin() {
        btn_login.click();
    }


}
