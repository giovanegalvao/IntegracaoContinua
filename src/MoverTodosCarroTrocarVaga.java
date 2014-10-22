import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class MoverTodosCarroTrocarVaga {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_7/estacionamento.php");
		selenium.start();
	}

	@Test
	public void test6() throws Exception {
		selenium.open("http://localhost/carro_7/estacionamento.php");
		Thread.sleep(2000);
		selenium.highlight("id=c1");
		Thread.sleep(2000);
		selenium.highlight("id=v2");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c1", "id=v2");
		Thread.sleep(2000);
		selenium.highlight("id=c2");
		Thread.sleep(2000);
		selenium.highlight("id=c1");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c2", "id=v1");
		Thread.sleep(2000);
		selenium.highlight("id=c3");
		Thread.sleep(2000);
		selenium.highlight("id=v3");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c3", "id=v3");
		Thread.sleep(2000);
		selenium.highlight("id=c4");
		Thread.sleep(2000);
		selenium.highlight("id=v4");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c4", "id=v4");
		Thread.sleep(2000);
		selenium.highlight("id=c5");
		Thread.sleep(2000);
		selenium.highlight("id=v5");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c5", "id=v5");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c5", "id=v6");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c4", "id=v5");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c3", "id=v4");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c2", "id=v3");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=c1", "id=v2");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
