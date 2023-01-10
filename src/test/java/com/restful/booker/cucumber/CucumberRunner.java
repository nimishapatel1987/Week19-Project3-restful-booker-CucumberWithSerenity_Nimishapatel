package com.restful.booker.cucumber;

import com.restful.booker.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Jay
 */
@CucumberOptions(features = "src/test/java/resources/feature")
@RunWith(CucumberWithSerenity.class)
public class CucumberRunner extends TestBase {
}