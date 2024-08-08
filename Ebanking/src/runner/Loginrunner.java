package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\SeleniumPrjEvngJuly\\Ebanking\\src\\feature\\Login.feature",
		                    "D:\\SeleniumPrjEvngJuly\\Ebanking\\src\\feature\\Role.feature"},
                 glue="stepdefination",monochrome=true,
                 plugin= {"pretty"})
public class Loginrunner 
{

}
