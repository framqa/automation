package com.tresit.cl.definitions.chatboxIA;
import com.tresit.cl.steps.chatboxIA.academicStep;
import com.tresit.cl.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class academicDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    academicStep academic;

    //Login exitoso

    @Given("Usuario navega hacia login para autenticarse")
    public void userNavigateTo() throws InterruptedException {
        url.navigateTo("https://qa-iplacex-front.3it.cl/");
        academic.waitForUser();
    }

    @When("Ingresar usuario administador")
    public void whenLoginWithValidCredentials() throws InterruptedException {
        academic.typeEmail("admin.test");
    }

    @And("Ingresar contraseña")
    public void userAuthentication() throws InterruptedException {
        academic.typePassword("admin2024");
        academic.clickLogin();
        academic.waitForUser();
    }

    @Then("Me redirige a la vista principal del administrador")
    public void iplacexFrontPage () throws InterruptedException {
        academic.waitForUser();
    }


}