package com.demoaut.newtours.certification.pages;

import org.junit.runner.RunWith; //es el encargado de arrancar las pruebas
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//RunWIth se utiliza para indicar que dicha clase se correr� como una extensi�n o tipo de otra clase, referencia la clase de Junit que ejecuta las suite
//Mediante las suites podemos asignar m�todos de prueba a grupos
@RunWith(Suite.class)
//se utiliza para indicar que un Test Suite correr� los test de las clases que tenga por parametros, se ponen entre llaves y separadas por comas.
@SuiteClasses({ NewToursLoginMain.class, NewToursLoginMain2.class }) 
public class AllTests {

}
