package com.tresit.cl.pages.chatboxIA;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class loginPage extends PageObject {

    // Input para ingresar email
    @FindBy(xpath = "//*[@id=\"login\"]/form/div[2]/div/input")
    protected WebElementFacade txt_email;
    // Input para ingresar contaseña
    @FindBy(xpath = "//*[@id=\"login\"]/form/div[3]/div/input")
    protected WebElementFacade txt_password;
    // Boton para iniciar sesión
    @FindBy( xpath = "//*[@id=\"login\"]/form/button")
    protected WebElementFacade btn_login;


}
