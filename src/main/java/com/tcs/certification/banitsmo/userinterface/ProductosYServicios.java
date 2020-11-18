package com.tcs.certification.banitsmo.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosYServicios  extends PageObject{

	public static final Target ProductosYservicios = Target.the("ProductosYservicios").located(By.xpath("//*[@id=\"main-menu\"]/div[2]/ul[1]/li[2]/a"));
	public static final Target Depositos = Target.the("Depositos").located(By.xpath("//*[@id=\"productosPersonas\"]/div/div[1]/div/div/div[1]/div/a"));
	public static final Target CuentaDeAhorroComercial = Target.the("CuentaDeAhorroComercial").located(By.xpath("//*[@id=\"none\"]/div/div/div[2]/div[2]/div/div[2]/h2/a"));
	public static final Target Documentos = Target.the("Documentos").located(By.xpath("//*[@id=\"filialTabs\"]/li[5]/a"));	
	public static final Target Descarga = Target.the("Descarga").located(By.xpath("//*[@id=\"tab5\"]/table/tbody/tr/td[2]/a/img"));
	

}
