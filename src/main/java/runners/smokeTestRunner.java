package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

//        path for the my feature Files
        features = {"src/test/java/resources"},

//        location of the step definitions
        glue={"stepDefinition"},

//        if the dry run is true it is making sure your feature files steps are
//          created in the step definition
        dryRun=false
)

public class smokeTestRunner extends AbstractTestNGCucumberTests {



}
