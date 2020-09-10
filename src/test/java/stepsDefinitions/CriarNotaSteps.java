package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicialPage =  new TelaInicialPage(driver);

	@Dado("que eu aciono o get started")
	public void queEuAcionoOGetStarted() throws InterruptedException {
		Thread.sleep(2000);
		telaInicialPage.clicarBotaoStarted();
	}
	
	@Quando("eu clicar no botao new note")
	public void euClicarNoBotaoNewNote() {
	    telaInicialPage.clicarBotaoNewNote();
	}

	@Quando("eu informar no campo title {string}")
	public void euInformarNoCampoTitle(String title) {
		telaInicialPage.preencherCampoTitle(title);
	}

	@Quando("eu informar no campo note {string}")
	public void euInformarNoCampoNote(String note) {
		telaInicialPage.preencherCampoNote(note);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
		telaInicialPage.acionarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String tituloNota) {
		assertEquals(tituloNota, driver.findElement(By.id("com.google.android.keep:id/editable_title")).getText());
	}
	
	/*Metodos das configurações*/
	
	@Quando("eu acionar o menu")
	public void euAcionarOMenu() throws InterruptedException {
		Thread.sleep(2000);
		telaInicialPage.acionarBotaoMenu();
	}

	@Quando("eu acionar a aba settings")
	public void euAcionarAAbaSettings() throws InterruptedException {
		Thread.sleep(2000);
		telaInicialPage.clicarSettings();
	}

	@Quando("eu tocar no switch")
	public void euTocarNoSwitch() {
		telaInicialPage.clicarSwitch();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
		assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}

	@Quando("^eu acionar a nota$")
	public void euAcionarANota() throws Throwable {
		Thread.sleep(2000);
		telaInicialPage.clicarNotaCriada();
	}
	
}
