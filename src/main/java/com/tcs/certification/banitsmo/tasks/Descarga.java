package com.tcs.certification.banitsmo.tasks;

import com.tcs.certification.banitsmo.userinterface.ProductosYServicios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Descarga implements Task {

	@Override
	public <T extends Actor> void performAs(T Lina) {
		// TODO Auto-generated method stub
		Lina.attemptsTo(Click.on(ProductosYServicios.Descarga));
	}

	public static Descarga Documento() {
		return Tasks.instrumented(Descarga.class);
		
	}
}
