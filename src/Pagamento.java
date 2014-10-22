import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class Pagamento {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/carro_8/estacionamento.php");
		selenium.start();
	}

	@Test
	public void testTeste_pagamento() throws Exception {
		selenium.open("/carro_8/estacionamento.php");
		assertEquals("Vaga ocupada com Sucesso", selenium.getAlert());
		assertEquals("<br />\n<font size='1'><table class='xdebug-error xe-deprecated' dir='ltr' border='1' cellspacing='0' cellpadding='1'>\n<tr><th align='left' bgcolor='#f57900' colspan=\"5\"><span style='background-color: #cc0000; color: #fce94f; font-size: x-large;'>( ! )</span> Deprecated: mysql_connect(): The mysql extension is deprecated and will be removed in the future: use mysqli or PDO instead in C:\\wamp\\www\\carro_8\\banco\\conexao.php on line <i>6</i></th></tr>\n<tr><th align='left' bgcolor='#e9b96e' colspan='5'>Call Stack</th></tr>\n<tr><th align='center' bgcolor='#eeeeec'>#</th><th align='left' bgcolor='#eeeeec'>Time</th><th align='left' bgcolor='#eeeeec'>Memory</th><th align='left' bgcolor='#eeeeec'>Function</th><th align='left' bgcolor='#eeeeec'>Location</th></tr>\n<tr><td bgcolor='#eeeeec' align='center'>1</td><td bgcolor='#eeeeec' align='center'>0.0000</td><td bgcolor='#eeeeec' align='right'>255128</td><td bgcolor='#eeeeec'>{main}(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>0</td></tr>\n<tr><td bgcolor='#eeeeec' align='center'>2</td><td bgcolor='#eeeeec' align='center'>0.0010</td><td bgcolor='#eeeeec' align='right'>257472</td><td bgcolor='#eeeeec'>require_once( <font color='#00bb00'>'C:\\wamp\\www\\carro_8\\banco\\conexao.php'</font> )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>2</td></tr>\n<tr><td bgcolor='#eeeeec' align='center'>3</td><td bgcolor='#eeeeec' align='center'>0.0010</td><td bgcolor='#eeeeec' align='right'>258216</td><td bgcolor='#eeeeec'><a href='http://www.php.net/function.mysql-connect' target='_new'>mysql_connect</a>\n(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\conexao.php' bgcolor='#eeeeec'>..\\conexao.php<b>:</b>6</td></tr>\n</table></font>\n<br />\n<font size='1'><table class='xdebug-error xe-notice' dir='ltr' border='1' cellspacing='0' cellpadding='1'>\n<tr><th align='left' bgcolor='#f57900' colspan=\"5\"><span style='background-color: #cc0000; color: #fce94f; font-size: x-large;'>( ! )</span> Notice: Undefined offset: 1 in C:\\wamp\\www\\carro_8\\banco\\pagamento.php on line <i>17</i></th></tr>\n<tr><th align='left' bgcolor='#e9b96e' colspan='5'>Call Stack</th></tr>\n<tr><th align='center' bgcolor='#eeeeec'>#</th><th align='left' bgcolor='#eeeeec'>Time</th><th align='left' bgcolor='#eeeeec'>Memory</th><th align='left' bgcolor='#eeeeec'>Function</th><th align='left' bgcolor='#eeeeec'>Location</th></tr>\n<tr><td bgcolor='#eeeeec' align='center'>1</td><td bgcolor='#eeeeec' align='center'>0.0000</td><td bgcolor='#eeeeec' align='right'>255128</td><td bgcolor='#eeeeec'>{main}(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>0</td></tr>\n</table></font>\n<br />\n<font size='1'><table class='xdebug-error xe-notice' dir='ltr' border='1' cellspacing='0' cellpadding='1'>\n<tr><th align='left' bgcolor='#f57900' colspan=\"5\"><span style='background-color: #cc0000; color: #fce94f; font-size: x-large;'>( ! )</span> Notice: Undefined offset: 1 in C:\\wamp\\www\\carro_8\\banco\\pagamento.php on line <i>32</i></th></tr>\n<tr><th align='left' bgcolor='#e9b96e' colspan='5'>Call Stack</th></tr>\n<tr><th align='center' bgcolor='#eeeeec'>#</th><th align='left' bgcolor='#eeeeec'>Time</th><th align='left' bgcolor='#eeeeec'>Memory</th><th align='left' bgcolor='#eeeeec'>Function</th><th align='left' bgcolor='#eeeeec'>Location</th></tr>\n<tr><td bgcolor='#eeeeec' align='center'>1</td><td bgcolor='#eeeeec' align='center'>0.0000</td><td bgcolor='#eeeeec' align='right'>255128</td><td bgcolor='#eeeeec'>{main}(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>0</td></tr>\n</table></font>\n<br />\n<font size='1'><table class='xdebug-error xe-notice' dir='ltr' border='1' cellspacing='0' cellpadding='1'>\n<tr><th align='left' bgcolor='#f57900' colspan=\"5\"><span style='background-color: #cc0000; color: #fce94f; font-size: x-large;'>( ! )</span> Notice: Undefined offset: 1 in C:\\wamp\\www\\carro_8\\banco\\pagamento.php on line <i>36</i></th></tr>\n<tr><th align='left' bgcolor='#e9b96e' colspan='5'>Call Stack</th></tr>\n<tr><th align='center' bgcolor='#eeeeec'>#</th><th align='left' bgcolor='#eeeeec'>Time</th><th align='left' bgcolor='#eeeeec'>Memory</th><th align='left' bgcolor='#eeeeec'>Function</th><th align='left' bgcolor='#eeeeec'>Location</th></tr>\n<tr><td bgcolor='#eeeeec' align='center'>1</td><td bgcolor='#eeeeec' align='center'>0.0000</td><td bgcolor='#eeeeec' align='right'>255128</td><td bgcolor='#eeeeec'>{main}(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>0</td></tr>\n</table></font>\n<br />\n<font size='1'><table class='xdebug-error xe-notice' dir='ltr' border='1' cellspacing='0' cellpadding='1'>\n<tr><th align='left' bgcolor='#f57900' colspan=\"5\"><span style='background-color: #cc0000; color: #fce94f; font-size: x-large;'>( ! )</span> Notice: Undefined offset: 2 in C:\\wamp\\www\\carro_8\\banco\\pagamento.php on line <i>37</i></th></tr>\n<tr><th align='left' bgcolor='#e9b96e' colspan='5'>Call Stack</th></tr>\n<tr><th align='center' bgcolor='#eeeeec'>#</th><th align='left' bgcolor='#eeeeec'>Time</th><th align='left' bgcolor='#eeeeec'>Memory</th><th align='left' bgcolor='#eeeeec'>Function</th><th align='left' bgcolor='#eeeeec'>Location</th></tr>\n<tr><td bgcolor='#eeeeec' align='center'>1</td><td bgcolor='#eeeeec' align='center'>0.0000</td><td bgcolor='#eeeeec' align='right'>255128</td><td bgcolor='#eeeeec'>{main}(  )</td><td title='C:\\wamp\\www\\carro_8\\banco\\pagamento.php' bgcolor='#eeeeec'>..\\pagamento.php<b>:</b>0</td></tr>\n</table></font>\n5@3@@@0@@", selenium.getAlert());
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
