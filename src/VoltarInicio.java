import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class VoltarInicio {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_8/estacionamento.php");
		selenium.start();
	}

	@Test
	public void testVoltarInicio() throws Exception {
		selenium.open("/carro_8/estacionamento.php");
		assertEquals("Vaga ocupada com Sucesso", selenium.getAlert());
		selenium.click("id=c6");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}