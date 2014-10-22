import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class MoverDoisCarroVaga {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_7/estacionamento.php");
		selenium.start();
	}

	@Test
	public void test2() throws Exception {
		selenium.open("http://localhost/carro_7/estacionamento.php");
		Thread.sleep(2000);
		selenium.highlight("id=c1");
		Thread.sleep(2000);
		selenium.highlight("id=v2");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c1", "id=v2");
		String teste = "2";
		System.out.println(teste);
		Thread.sleep(2000);
		// selenium.gotoIf("'${teste}'==1", "lbl");
		selenium.highlight("id=c2");
		Thread.sleep(2000);
		selenium.highlight("id=v2");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c2", "id=v2");
		// selenium.label("lbl");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
