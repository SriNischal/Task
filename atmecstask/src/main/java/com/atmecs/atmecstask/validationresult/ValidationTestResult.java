package com.atmecs.atmecstask.validationresult;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.atmecstask.constants.ProjectBaseConstantPaths;
import com.atmecs.atmecstask.reports.LogReport;
import com.atmecs.atmecstask.testsuite.TestBase;
import com.atmecs.atmecstask.utils.ReadLocatorsFile;

public class ValidationTestResult extends TestBase{
	static Properties properties, properties1;
	static String actualbreadcrumb1, actualcontent11;
	public static void validation() throws IOException {
		LogReport log=new LogReport();
		properties = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.LOCATORS_FILE2);
		properties1 = ReadLocatorsFile.loadProperty(ProjectBaseConstantPaths.TESTDATA_FILE);
   String actualcontent=driver.findElement(By.xpath("//h1[text()='Services']")).getText();
   String expectedcontent="Services";
   Assert.assertEquals(actualcontent,expectedcontent ,"actual not equal expected");
   log.info("Successfully validated content");
	String actualbreadcrumb=driver.findElement(By.xpath("(//div[@class='breadcrumb-list'])")).getText();
	String expectedbreadcrumb="Home › Services";
	Assert.assertEquals(actualbreadcrumb, expectedbreadcrumb,"actual not equal to expected");
	log.info("Successfully validated breadcrumb");
	}
	public static void validationaiml() throws IOException {
		LogReport log=new LogReport();
   String actualcontentaiml=driver.findElement(By.xpath("//b[text()='Leap at the possibilities of emerging Artificial Intelligence']")).getText();
   String expectedcontentaiml="Leap at the possibilities of emerging Artificial Intelligence";
   Assert.assertEquals(actualcontentaiml,expectedcontentaiml ,"actual not equal expected");
   log.info("Successfully validated contentaiml");
	String actualbreadcrumaiml=driver.findElement(By.xpath("(//div[@class='breadcrumb-list'])")).getText();
	String expectedbreadcrumaiml="Home › Services › Digital Life › Artificial Intelligence / Machine Learning";
	Assert.assertEquals(actualbreadcrumaiml, expectedbreadcrumaiml,"actual not equal to expected");
	log.info("Successfully validated breadcrumbaiml");
	}
	public static void validationarvr() {
		LogReport log=new LogReport();
		String actualcontentarvr=driver.findElement(By.xpath("//li[text()='Design and development of AR/VR applications and seamless integration with services such as geolocation, image recognition, speech recognition etc.']")).getText();
        String expectedcontentarvr="Design and development of AR/VR applications and seamless integration with services such as geolocation, image recognition, speech recognition etc.";
        Assert.assertEquals(actualcontentarvr, expectedcontentarvr,"actual not equal to expected");
        log.info("Successfully validated contentarvr");
        String actualbreadcrumbarvr=driver.findElement(By.xpath("//div[@class='breadcrumb-list']")).getText();
        String expectedbreadcrumbarvr="Home › Services › Digital Life › Augmented Reality / Virtual Reality";
        Assert.assertEquals(actualbreadcrumbarvr, expectedbreadcrumbarvr,"actual not equal to expected");
        log.info("Successfully validated breadcrumbarvr");
	}
	public static void validationiot() {
	LogReport log=new LogReport();
	String actualcontentiot=driver.findElement(By.xpath("//b[text()='Reform your customer experience with IoT data']")).getText();
	String expectedcontentiot="Reform your customer experience with IoT data";
	Assert.assertEquals(actualcontentiot, expectedcontentiot,"actual not equal to expected");
	log.info("Successfully validated contentiot");
	String actualbreadcrumbiot=driver.findElement(By.xpath("//div[@class='breadcrumb-list']")).getText();
	String expectedbreadcrumbiot="Home › Services › Digital Life › Internet of Things";
	Assert.assertEquals(actualbreadcrumbiot, expectedbreadcrumbiot,"actual not equal to expected");
	log.info("Successfully validated breadcrumbiot");
	}
	public static void validationrpac() {
		LogReport log=new LogReport();
		String actualcontentrpac=driver.findElement(By.xpath("//b[text()='Pave way for digital transformation with RPA']")).getText();
		String expectedcontentrpac="Pave way for digital transformation with RPA";
		Assert.assertEquals(actualcontentrpac, expectedcontentrpac,"actual not equal to expected");
		log.info("Successfully validated contentrpac");
		String actualbreadcrumbrpac=driver.findElement(By.xpath("//div[@class='breadcrumb-list']")).getText();
		String expectedbreadcrumbrpac="Home › Services › Digital Life › Robotic Process Automation & ChatBOTs";
		Assert.assertEquals(actualbreadcrumbrpac, expectedbreadcrumbrpac,"actual not equal to expected");
		log.info("Successfully validated breadcrumbrpac");
	}
	public static void validationblock() {
		LogReport log=new LogReport();
		String actualcontentblock=driver.findElement(By.xpath("//span[text()='Build Proof-Of-Concept for specific use cases using latest Ethereum Blockchain development tools.']")).getText();
		String expectedcontentblock="Build Proof-Of-Concept for specific use cases using latest Ethereum Blockchain development tools.";
		Assert.assertEquals(actualcontentblock, expectedcontentblock,"actual not equal to expected");
		log.info("Successfully validated contentblock");
		String actualbradcrumbblock=driver.findElement(By.xpath("//div[@class='breadcrumb-list']")).getText();
		String expectedbreadcrumbblock="Home › Services › Digital Life › Blockchain";
		Assert.assertEquals(actualbradcrumbblock, expectedbreadcrumbblock,"actual not equal expected");
		log.info("Successfully validated breadcrumbblock");
	}
}
