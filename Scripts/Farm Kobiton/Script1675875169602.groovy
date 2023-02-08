import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import io.appium.java_client.android.AndroidDriver

String kobitonServerUrl = "https://debora.falcao:4cd66388-16e2-43ac-8bad-272b8edb65f8@api.kobiton.com/wd/hub";

DesiredCapabilities capabilities = new DesiredCapabilities();
// The generated session will be visible to you only. 
capabilities.setCapability("sessionName", "Automation test session");
capabilities.setCapability("sessionDescription", "");
capabilities.setCapability("deviceOrientation", "portrait");
capabilities.setCapability("captureScreenshots", true);
capabilities.setCapability("useConfiguration", "");
capabilities.setCapability("autoWebview", true);
capabilities.setCapability("browserName", "chrome");
capabilities.setCapability("deviceGroup", "KOBITON");
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
capabilities.setCapability("deviceName", "Galaxy S10");
capabilities.setCapability("platformVersion", "12");
capabilities.setCapability("platformName", "Android"); 
capabilities.setCapability("app", "kobiton-store:496238")

//Mobile.startApplication('kobiton-store:496238', true)

Mobile.tap(findTestObject('Object Repository/Farm Kobiton/android.widget.TextView - Me'), 0)

Mobile.closeApplication()

