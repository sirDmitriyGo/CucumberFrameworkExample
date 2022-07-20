package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/AboutItemIsPresent.feature",

        glue = "steps", stepNotifications = true,

        dryRun = true,

        monochrome = true,

        tags = "@AdHoc",
        plugin= {"html:target/cucumber.html", "pretty", "json:target/cucumber.json",
                "rerun:target/failed.txt"

        }

)
public class Runner {
    // here would be implemented TestNG plugin if I need to perform parallel testing
}
