import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Login {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_7/estacionamento.php");
		selenium.start();
	}

	@Test
	public void testTeste_login_completo() throws Exception {
		selenium.open("/carro_7/estacionamento.php");
		selenium.click("id=clickcadastro");
		selenium.type("id=cad_nome", "Giovane Galvão");
		selenium.type("id=cad_login", "giovane");
		selenium.type("id=cad_senha", "1");
		selenium.click("id=enviar");
		assertEquals("Por favor, verifique os campos novamente", selenium.getAlert());
		selenium.type("id=cad_senha", "1234");
		selenium.click("id=enviar");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
