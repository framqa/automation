package com.tresit.cl;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class )
@CucumberOptions(
        features = "src/test/resources/features/1-LoginSuccessful.feature",
        glue = "com.tresit.cl.definitions",
        tags = "",
        plugin = {"pretty", "json:target/cucumber-reports.json", "com.aventstack.extentreports.cucumnber.adapter.ExtentCucumberAdapter:"}
)
public class Runner {


}
