import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class LoginAcesso {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_7/estacionamento.php");
		selenium.start();
	}

	@Test
	public void testLoginAcesso() throws Exception {
		selenium.open("/carro_7/estacionamento.php");
		selenium.type("id=login", "giovane");
		selenium.type("id=senha", "1");
		selenium.click("id=entrar");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}