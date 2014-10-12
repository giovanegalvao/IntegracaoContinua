import static org.junit.Assert.*;

import org.junit.Test;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class MoverTodosCarroVaga {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/jquery-ui-1.11.0/development-bundle/demos/droppable/estacionamento_versao_3_IMG.php");
		selenium.start();
	}

	@Test
	public void test2() throws Exception {
		selenium.open("http://localhost/jquery-ui-1.11.0/development-bundle/demos/droppable/estacionamento_versao_3_IMG.php");
		Thread.sleep(2000);
		selenium.highlight("id=1");
		Thread.sleep(2000);
		selenium.highlight("id=vaga2");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=1", "id=vaga2");
		Thread.sleep(2000);
		selenium.highlight("id=2");
		Thread.sleep(2000);
		selenium.highlight("id=vaga1");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=2", "id=vaga1");
		Thread.sleep(2000);
		selenium.highlight("id=3");
		Thread.sleep(2000);
		selenium.highlight("id=vaga3");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=3", "id=vaga3");
		Thread.sleep(2000);
		selenium.highlight("id=4");
		Thread.sleep(2000);
		selenium.highlight("id=vaga4");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=4", "id=vaga4");
		Thread.sleep(2000);
		selenium.highlight("id=5");
		Thread.sleep(2000);
		selenium.highlight("id=vaga5");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=5", "id=vaga5");
		Thread.sleep(2000);
		selenium.highlight("id=6");
		Thread.sleep(2000);
		selenium.highlight("id=vaga6");
		Thread.sleep(2000);
		selenium.dragAndDropToObject("id=6", "id=vaga6");
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
