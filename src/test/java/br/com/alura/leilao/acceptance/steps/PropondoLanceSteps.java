package br.com.alura.leilao.acceptance.steps;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class PropondoLanceSteps {

    private Lance lance;

    private Leilao leilao;

    @Given("um lance valido")
    public void um_lance_valido() {
        Usuario usuario = new Usuario("fulano");
        lance = new Lance(usuario, BigDecimal.TEN);
    }

    @When("propoe um lance")
    public void propoe_um_lance() {
        leilao = new Leilao("Tablet XPTO");
        leilao.propoe(lance);
    }

    @Then("o lance e aceito")
    public void o_lance_e_aceito() {
        Assertions.assertEquals(1, leilao.getLances().size());
        Assertions.assertEquals(lance, leilao.getLances().get(0));
    }
}
