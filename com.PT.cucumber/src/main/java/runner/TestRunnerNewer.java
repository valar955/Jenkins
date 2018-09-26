package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ELCOT\\git\\Jenkins\\com.PT.cucumber\\Feature\\HooksTags.feature",glue= {"stepDefi"},format= {"pretty","html:test-output"},
				//plugin= {"html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"}
		        monochrome=true,
                strict=true,
		        dryRun=false
		        //tags= {"@SmokeTest", "@RegressionTest"}
    
		
		)






public class TestRunnerNewer {

}
