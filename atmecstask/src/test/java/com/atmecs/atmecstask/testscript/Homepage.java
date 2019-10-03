package com.atmecs.atmecstask.testscript;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.atmecs.atmecstask.reports.LogReport;
import com.atmecs.atmecstask.testsuite.AtmecsPageActions;
import com.atmecs.atmecstask.testsuite.TestBase;
import com.atmecs.atmecstask.utils.AtmecsProperties;
import com.atmecs.atmecstask.validationresult.ValidationTestResult;

public class Homepage extends TestBase {
	@Test
	public static void home() throws Exception {
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		LogReport log = new LogReport();
		AtmecsProperties atmprop = new AtmecsProperties();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.explore.btn"));
		ValidationTestResult.validation();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,1000)");
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.aiml.btn"));
		ValidationTestResult.validationaiml();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,2000)");
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.arvr.btn"));
		ValidationTestResult.validationarvr();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,2200)");
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.iot.btn"));
		ValidationTestResult.validationiot();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,2300)");
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.rpac.btn"));
		ValidationTestResult.validationrpac();
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.home.btn"));
		scroll.executeScript("window.scrollBy(0,2500)");
		AtmecsPageActions.clickOnElement(atmprop.readExplorePagePropertiesFile("explorepage.block.btn"));
		ValidationTestResult.validationblock();
		log.info("Successfully validated homepage");

	}
}
