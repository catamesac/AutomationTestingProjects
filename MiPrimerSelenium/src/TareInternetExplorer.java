/*Mi primer Selenium
 * Utilizando Internet Explorer
 * Autora: Catalina Mesa
 */

import org.openqa.selenium.ie.InternetExplorerDriver;
//Importar la libreria para utilizar el WebDriver
import org.openqa.selenium.WebDriver; 
//Importar la libreria para que el WebDriver localice algún objeto por id, nombre, xpath,etc.
import org.openqa.selenium.By; 

public class TareInternetExplorer {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe"); //
		
		//Creo y declaro el webdriver  - mi robot que se llama Antonio
		WebDriver antonio = new InternetExplorerDriver(); //declaro el robot que me va hacer las busquedas
		
		//Doy la orden al webdriver de ir a la pagina indicada
		antonio.get("https://www.google.com.co");
		
		//Le digo al webdriver que busque el texbox que se llama q y digíte el último sismo
		antonio.findElement(By.name("q")).sendKeys("ultimo sismo");
		
		//Le digo al robot que me encuentre el botón de buscar y le de click
		antonio.findElement(By.name("btnK")).click();
		
		//El webDriver se cierra
		antonio.close();

	}
}
