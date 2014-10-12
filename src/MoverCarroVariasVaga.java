import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class MoverCarroVariasVaga {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/jquery-ui-1.11.0/development-bundle/demos/droppable/estacionamento_versao_3_IMG.php");
		selenium.start();
	}

	@Test
	public void test5() throws Exception {
		selenium.open("http://localhost/jquery-ui-1.11.0/development-bundle/demos/droppable/estacionamento_versao_3_IMG.php");
		Thread.sleep(2000);
		selenium.highlight("id=1");
		Thread.sleep(2000);
		selenium.highlight("id=vaga2");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=1", "id=vaga1");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=1", "id=vaga3");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=1", "id=vaga2");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
