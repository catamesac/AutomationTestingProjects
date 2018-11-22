import org.openqa.selenium.chrome.ChromeDriver; //seleccionar el controlador 
import org.openqa.selenium.WebDriver; //Manipular... voy a utilizar la clase web driver
import org.openqa.selenium.By; //para localizar por algo Id, nombre)

public class MiPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Paso 2 Ubicar el controlador
		//El controlador se encuentra en la direccione especifica
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); //
		
		//Crear el robot que nombro Daniel
		WebDriver Daniel = new ChromeDriver(); //el robot que abre el navergador lo delcaro, crea una variable del sistema
		//Hasta este punto se logra abrir el navegado 
		
		//Especifico la direccion que quiero trabajar
		Daniel.get("http://www.google.com");
		
		//que google me bsuque la cajita de texto
		Daniel.findElement(By.name("q")).sendKeys("Suso");
		
		//Encuentra con el Id del elemento que seria la caja de texto
		//Daniel.findElement(By.id("lst-ib")).clear();
	//hacer click al boton buscar-- hacerlo 
				

	}

}
