package com.tcs.certification.banitsmo.runner;

import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/Features/Descarga.feature",
                 snippets = SnippetType.CAMELCASE, 
                // tags="@Prueba",
                 glue = "com/tcs/certification/banitsmo/stepDefinitions") 


public class DescargaDocumento_Runner {

}
