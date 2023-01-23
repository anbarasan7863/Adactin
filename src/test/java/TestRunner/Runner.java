package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\fb\\com\\features",
glue = {"fb.com.Stepdefination","Hooks"},tags = "@Adactin-Tc102",dryRun = false,
stepNotifications = true,plugin = {"html:target\\report\\Adactin.html",
"json:target\\report\\Adactin_j.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {

}
