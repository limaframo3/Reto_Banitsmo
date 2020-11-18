package com.tcs.certification.banitsmo.tasks;



import com.tcs.certification.banitsmo.userinterface.ProductosYServicios;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class IngresaA implements Task{

	@Override
	public <T extends Actor> void performAs(T Lina) {
		
		Lina.attemptsTo(Click.on(ProductosYServicios.ProductosYservicios));
		
	}
	
	public static IngresaA ProductosYservicios() {
		return Tasks.instrumented(IngresaA.class);
		
	}

}
