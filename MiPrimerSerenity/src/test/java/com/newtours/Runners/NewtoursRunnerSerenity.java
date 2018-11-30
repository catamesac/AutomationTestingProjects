package com.newtours.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
/*Clase runner que me corre el feature y me guarda el reporte en html*/

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerSerenity\\Features\\newtoursSerenity.Feature",
glue="com.newtours.StepsDefinitions",
plugin= {"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\MiPrimerSerenity\\HTMLSerenity"})


public class NewtoursRunnerSerenity {

}
