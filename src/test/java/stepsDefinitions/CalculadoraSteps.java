package stepsDefinitions;

import static utils.Utils.*;
import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CalculadoraPage;

public class CalculadoraSteps {
	
	CalculadoraPage calculadora = new CalculadoraPage(driver);

	
	@Dado("que eu esteja acessando a calculadora")
	public void queEuEstejaAcessandoACalculadora() throws Exception {
		acessarKeep();
	}

	@Quando("eu digitar o numero {string}")
	public void euDigitarONumero(String string) {
		calculadora.DigitarDois();
	}

	@Quando("eu acionar na tecla mais")
	public void euAcionarNaTeclaMais() {
		calculadora.AcionarTeclaMais();
	}

	@Entao("a calculadora apresenta o resultado {string}")
	public void aCalculadoraApresentaOResultado(String string) {
		//assertEquals("4", driver.findElementById("com.android.calculator2:id/result"));
	}


}
