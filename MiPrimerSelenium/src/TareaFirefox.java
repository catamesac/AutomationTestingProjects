import org.openqa.selenium.firefox.FirefoxDriver; //seleccionar el controlador 
import org.openqa.selenium.WebDriver; //Manipular... voy a utilizar la clase web driver
import org.openqa.selenium.By; //para localizar por algo Id, nombre)
public class TareaFirefox {

	
	public static void main(String[] args) {
	
		//Paso 2 Ubicar la carpeta que contiene el controlador
		//Dirigir el sistema al controlador de firefox que se llama gecko (intermediario entre firefox y selenium) y le damos la ubicacion en el sistema en el segundo parametro
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe"); //
		
		//Creo y declaro el webdriver  - mi robot que se llama Antonio
		WebDriver antonio = new FirefoxDriver(); //declaro el robot que me va hacer las busquedas
		//Hasta este punto se logra abrir el navegado 
		
		//Dar la orden al webdriver de ir a la pagina indicada
		antonio.get("https://www.google.com.co");
		
		//le digo al webdriver que busque el texbox que se llama q y digite el ultimo sismo
		antonio.findElement(By.name("q")).sendKeys("ultimo sismo");
		
		//Le digo al robot que me encuentre el boton de buscar y le de click
		antonio.findElement(By.name("btnK")).click();


	}

}
