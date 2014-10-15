// import cucumber.api.PendingException;

import org.junit.Assert;

import cucumber.api.java.pt.*;

public class StepDefinitions {
	SodaMachine sm = null;

	@Dado("^I have \\$(\\d+) in my account$")
	public void i_have_$_in_my_account(float value) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		sm = new SodaMachine(value);

		// throw new PendingException();
	}

	@Quando("^I wave my magic ring at the machine$")
	public void i_wave_my_magic_ring_at_the_machine() throws Throwable {
		// Write code here that turns the phrase above into concrete actions	
		sm.putMoney(2.0f);
		Assert.assertTrue(sm.getAccountBalance() >= 2);
		// throw new PendingException();
	}

	@Então("^I should get a soda$")
	public void i_should_get_a_soda() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(sm.getAccountBalance() >= 2);
		sm.releaseSoda();
		// throw new PendingException();
	}
}
