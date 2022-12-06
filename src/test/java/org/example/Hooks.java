package org.example;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.example.driver.DriverManager;

public class Hooks {
    DriverManager driverManager = new DriverManager();



@Before
    public void setup() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.gotoUrl();
        driverManager.maxBrowser();
        driverManager.applyImplicitWait();

    }
    @After
    public void tearDown(Scenario scenario){
    if (scenario.isFailed()){
        driverManager.takeScreenshot(scenario);
    }
        driverManager.closeBrowse();
    }

}
