package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	Metodos m = new Metodos ();
	Elementos e = new Elementos ();
	@Given("^que o usuario acesse a url \"([^\"]*)\"$")
	public void que_o_usuario_acesse_a_url(String url) throws Throwable {
	   m.executarNavegador(url, "Abrindo navegador");
	}

	@And("^selecione o botao abrir nova conta$")
	public void selecione_o_botao_abrir_nova_conta() throws Throwable {
	   m.click(e.getBtnAbrirConta(), "Selecionando botao abrir conta");
	}

	@And("^selecionar o botao abrir conta para voce$")
	public void selecionar_o_botao_abrir_conta_para_voce() throws Throwable {
	   m.click(e.getBtnParaVoce(), "Selecionando botao abrir conta");
	}

	@When("^o usuario preencher o formulario$")
	public void o_usuario_preencher_o_formulario() throws Throwable {
	  m.preencher(e.getCampoNome(), "Flash code", "Preenchendo campo nome");
	  m.preencher(e.getCampotelefone(), "11111111111", "Preenchenco campo telefone");
	  m.preencher(e.getCampoEmail(), "teste@test.com.br", "Preenchendo campo email");
	  m.preencher(e.getCampoCpf(), "71439578796", "Preenchendo campo CPF");
	
	  
	}

	@When("^selecionar o botao quero ser cliente$")
	public void selecionar_o_botao_quero_ser_cliente() throws Throwable {
		  m.click(e.getBtnQueroSerCliente(), "Selecionando botao quero ser cliente");
	}

	@Then("^valido o texto falta pouco$")
	public void valido_o_texto_falta_pouco() throws Throwable {
	    
	}


}
