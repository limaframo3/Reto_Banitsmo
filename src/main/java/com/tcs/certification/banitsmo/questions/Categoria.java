package com.tcs.certification.banitsmo.questions;


import com.tcs.certification.banitsmo.userinterface.ProductosYServicios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Categoria implements Question <String>{

	@Override
	public String answeredBy(Actor Lina) {
		
		return Text.of(ProductosYServicios.Depositos).viewedBy(Lina).asString();
	}

	public static Categoria Depositos () {
		
		return new Categoria();
	}
		
}
