package com.tcs.certification.banitsmo.stepDefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebDriver;
import com.tcs.certification.banitsmo.questions.Categoria;
import com.tcs.certification.banitsmo.tasks.Descarga;
import com.tcs.certification.banitsmo.tasks.IngresaA;
import com.tcs.certification.banitsmo.tasks.OpenTheBrowser;
import com.tcs.certification.banitsmo.tasks.Selecciona;
import com.tcs.certification.banitsmo.tasks.SeleccionaCuenta;
import com.tcs.certification.banitsmo.tasks.SeleccionaOpcion;

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
	    
		Lina.wasAbleTo(OpenTheBrowser.on());

	}

	@When("^ella selecciona Productos y Servicios$")
	public void ellaSeleccionaProductosYServicios() {
	    
		Lina.attemptsTo(IngresaA.ProductosYservicios());
	}

	@Then("^puede ver la categoria Depositos$")
	public void puedeVerLaCategoriaDepositos() {
	    
		Lina.should(seeThat(Categoria.Depositos(), is("Depósitos")));
	}

	
	@Given("^Lina selecciona categoria Depositos$")
	public void linaSeleccionaCategoriaDepositos() {
	    
		Lina.attemptsTo(SeleccionaOpcion.Depositos());
	}

	@When("^ella selecciona Cuenta de Ahorro Comecial$")
	public void ellaSeleccionaCuentaDeAhorroComecial() {
	    
		Lina.attemptsTo(SeleccionaCuenta.DeAhorroComercial());
	}

	@Then("^selecciona opcion Documentos$")
	public void seleccionaOpcionDocumentos() {
	    
		Lina.attemptsTo(Selecciona.OpcionDocumentos());
	}

	@Then("^Descarga el documento$")
	public void descargaElDocumento() {
	    
		Lina.attemptsTo(Descarga.Documento());
	}


	   
}

    