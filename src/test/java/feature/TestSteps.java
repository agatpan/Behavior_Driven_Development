package feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class TestSteps {


    private int initial = 0;


    @Given("^number is (-?\\d+)$")
    public void number_is(int initial) {
        // Write code here that turns the phrase above into concrete actions
        this.initial = initial;
    }

   /* @When("^I subtract (-?\\d+) $")
    public void substractList(List<Integer> numbers) {

        for (Integer number : numbers){
            this.initial -= number;


        }
    }*/


    @When("^I subtract (-?\\d+)$")
    public void i_subtract(int number) {
        this.initial -= number;
    }

    @Then("^I get (-?\\d+) result$")
    public void resultOperation(int expected) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(initial, equalTo(expected));

    }



}
