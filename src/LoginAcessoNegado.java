import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class LoginAcessoNegado {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_7/estacionamento.php");
		selenium.start();
	}

	@Test
	public void testTeste_login() throws Exception {
		selenium.open("/carro_7/estacionamento.php");
		selenium.click("id=entrar");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}