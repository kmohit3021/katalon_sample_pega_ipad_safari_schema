package webKeywords

import java.util.regex.Matcher
import java.util.regex.Pattern

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



class ApplicationFunction {

	public static Map<String, String> map = new HashMap<String, String>();
	public static List<String> list = new ArrayList<String>();
	public static Set<String> set = new HashSet<String>();


	@Keyword(keywordObject='WebCustomKeyword')
	def waitToLoadElement(TestObject testLocator) {
		int intCount =1;
		WebUI.delay(2)
		while(intCount < 180) {
			try {
				boolean loadingDisplay = WebUI.verifyElementVisible(testLocator)
				if (loadingDisplay==true) {
					WebUI.delay(2)
				}
				else {
					break;
				}
			} catch (Exception e) {
				break;
			}
		}
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def validateLoginMessage(TestObject tstlocator) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(tstlocator, 1)
			if (element.getText()=="Login failed! Please ensure the username and password are valid.") {
				KeywordUtil.markFailed("Login Failed")
			}
			else {
				KeywordUtil.markPassed("Login Successfully")
			}
		} catch (Exception e) {
			KeywordUtil.markPassed("Login Successfully")
		}
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def failureExpectedMarkLoginTestPass(TestObject tstlocator) {
		try {
			WebElement element = WebUiCommonHelper.findWebElement(tstlocator, 1)
			if (element.getText()=="Login failed! Please ensure the username and password are valid.") {
				KeywordUtil.markPassed("Login Failed")
			}
			else {
				KeywordUtil.markPassed("Login Successfully")
			}
		} catch (Exception e) {
			KeywordUtil.markPassed("Login Successfully")
		}
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def putValueInVariable(String strKey, String strValue) {
		ApplicationFunction.
				map.put(strKey, strValue)
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def String getValueFromVariable(Object strKey) {
		String strval=map.get(strKey)
		return strval
	}

	@Keyword(keywordObject='WebCustomKeyword')
	public String getRandomEmail(String suffix,String prefix){
		int randomNo = (int)(Math.random() * 100000);
		return suffix + randomNo + "@" + prefix;
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def static TestObject GetTableValue(int rowIndex, int colIndex) {
		TestObject to = new TestObject()
		to.addProperty("xpath", ConditionType.EQUALS, ".//*[@class='w3-example']//table//tr["+rowIndex+"]/td["+colIndex+"]")
		return to
	}

	@Keyword(keywordObject='WebCustomKeyword')
	public String extractTextFromContent(String msgcontent) {
		Pattern p1 = Pattern.compile('<input type="hidden" name="code" value="(.*)"/>')

		Matcher m1 = p1.matcher(msgcontent)

		if (m1.find()) {
			return m1.group(1)
		}
	}

	@Keyword(keywordObject='WebCustomKeyword')
	def static enhancedSetViewportSize(int width, int height) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		int browserWidthGap = webDriver.manage().window().getSize().width - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerWidth || 0)', null).toString())
		int browserHeightGap = webDriver.manage().window().getSize().height - Integer.parseInt(WebUiBuiltInKeywords.executeJavaScript('return (window.innerHeight || 0)', null).toString())
		float ratio = Float.parseFloat(WebUiBuiltInKeywords.executeJavaScript('return (window.devicePixelRatio || 1)', null).toString())
		int actualWidth = Math.round((width + browserWidthGap * ratio) / ratio)
		int actualHeight = Math.round((height + browserHeightGap * ratio) / ratio)
		WebUiBuiltInKeywords.setViewPortSize(actualWidth, actualHeight)
	}
}
