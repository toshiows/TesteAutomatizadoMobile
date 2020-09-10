package stepsDefinitions;

import static utils.Utils.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setup() throws Exception {
		acessarKeep();
	}

	@After
	public void fecharCalculadora() {
		fechar();
	}
}
