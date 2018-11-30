/*Mi primer Selenium
 * Utilizando Firefox
 * Autora: Catalina Mesa
 */

//Importar las librerias para firefox
import org.openqa.selenium.firefox.FirefoxDriver;
//Importar la libreria para utilizar el WebDriver
import org.openqa.selenium.WebDriver; 
//Importar la libreria para que el WebDriver localice algún objeto por id, nombre, xpath,etc.
import org.openqa.selenium.By; 

public class TareaFirefox {

	
	public static void main(String[] args) {

		//Dirigir el sistema al controlador de firefox que se llama gecko (intermediario entre firefox y selenium) y le damos la ubicacion en el sistema en el segundo parametro
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe"); //
		
		//Creo y declaro el webdriver  - mi robot que se llama Antonio
		WebDriver antonio = new FirefoxDriver(); //declaro el robot que me va hacer las busquedas
		
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
