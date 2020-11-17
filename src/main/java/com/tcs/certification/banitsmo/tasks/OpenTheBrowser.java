package com.tcs.certification.banitsmo.tasks;



import com.tcs.certification.banitsmo.userinterface.OpenBrowser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenTheBrowser implements Task {

	@Override
	public <T extends Actor> void performAs(T Lina) {
		// TODO Auto-generated method stub
		
		Lina.attemptsTo(Open.browserOn(new OpenBrowser()));
	}
	
	public static OpenTheBrowser on(){   
		
		     return Tasks.instrumented(OpenTheBrowser.class);
		

}
}