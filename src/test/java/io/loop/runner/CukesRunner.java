package io.loop.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"html:target/html-reports/cucumber-report.html",
                 "json:target/json-reports/json-report.json"},
        features = "src/test/resources/features",
        glue ="io/loop/step_definitions",
        dryRun = false,
        tags="@orderSmartBearTest",
        // @wip (work in process) if not ready yet;
        // "or" will run both matching, if you have test1-run it , if you have test2 run it
        // tags = "@smoke and @regression" - will run which have both tagsи
        monochrome=true // if true - show less warnings and less unnecessary data
)

public class CukesRunner {

}
