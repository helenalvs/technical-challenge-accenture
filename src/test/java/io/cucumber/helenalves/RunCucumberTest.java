package io.cucumber.helenalves;

import cucumber.api.CucumberOptions;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectPackages("io.cucumber.helenalves")
@CucumberOptions(plugin = {"pretty"}, monochrome = true)
public class RunCucumberTest {
}
