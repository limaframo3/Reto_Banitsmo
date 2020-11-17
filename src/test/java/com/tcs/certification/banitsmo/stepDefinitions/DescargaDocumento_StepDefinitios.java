package com.tcs.certification.banitsmo.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.tcs.certification.banitsmo.tasks.OpenTheBrowser;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DescargaDocumento_StepDefinitios {
	
	@Managed(driver = "chrome")
	private WebDriver driver;

	private Actor Lina = Actor.named("Lina");

	@Before

	public void SetUp() {

		Lina.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^Lina ingresa en la Pagina de Banitsmo$")
	public void linaIngresaEnLaPaginaDeBanitsmo() {
	    // Write code here that turns the phrase above into concrete actions
		
		Lina.wasAbleTo(OpenTheBrowser.on());
	}

	@When("^Selecciona Cuenta de Ahorros Comercial$")
	public void seleccionaCuentaDeAhorrosComercial() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

    @Then("^ella puede descargar el Docuemento$")
    public void ellaPuedeDescargarElDocuemento() {
    // Write code here that turns the phrase above into concrete actions
    
}
   
}

    