import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver

//Mobile.startApplication('kobiton-store:10717', false)
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
capabilities.setCapability("app", "kobiton-store:496952")

AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(kobitonServerUrl))
