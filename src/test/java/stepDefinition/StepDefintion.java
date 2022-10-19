package stepDefinition;

import io.cucumber.java.en.Given;
import teamDetails.RCB;

public class StepDefintion {

	RCB objRCB = new RCB();

	@Given("^Read through the json file of team RCB$")
	public void ReadJson() {
		objRCB.ReadThroughJson();
	}
	
	@Given("^Verify if the criteria are met$")
	public void Verification() {
		objRCB.VerifyCriteria();
	}

}
