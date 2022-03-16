package br.masmangan.beecrowd.bee1059;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bee1059Steps {
    
    @When("program runs")
    public void program_runs() {
        // Write code here that turns the phrase above into concrete actions
        Main.main(null);
        throw new io.cucumber.java.PendingException();
    }

    @Then("first output should be")
    public void first_output_should_be(String docString) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("second output should be")
    public void second_output_should_be(String docString) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("last output should be")
    public void last_output_should_be(String docString) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
