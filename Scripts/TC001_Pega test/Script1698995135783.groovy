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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://my.pega.com/')

WebUI.verifyElementText(findTestObject('Object Repository/OR Pega/Page_Pega - Sign In/h2_Sign In'), 'Sign In')

WebUI.setText(findTestObject('Object Repository/OR Pega/Page_Pega - Sign In/input_Company Email_identifier'), 'mohit.kumar@katalon.com')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega - Sign In/input_Keep me signed in_button button-primary'))

WebUI.setEncryptedText(findTestObject('Object Repository/OR Pega/Page_Pega - Sign In/input_Password_credentials.passcode'), 
    'PLGTm/4mhzCEtyJzMSSXHg==')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega - Sign In/input_Keep me signed in_button button-primary'))

WebUI.mouseOver(findTestObject('Object Repository/OR Pega/Page_My Pega/a_Software'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_My Pega/a_My Trials'))

not_run: CustomKeywords.'webKeywords.ApplicationFunction.waitToLoadElement'(findTestObject('Object Repository/OR Pega/Page_My Trials/div_loader'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Pega/Page_My Trials/div_My Trials'), 10)

WebUI.click(findTestObject('Object Repository/OR Pega/Page_My Trials/i_Ready_TrialDetails_D_GetMyTrials.pxResult_b693e1'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_My Trials/span_Continue to Trial'))

WebUI.switchToWindowTitle('Pega App Studio')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Skip for now'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/a_Case Types'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Add Case Type'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/label_Create Case Type'), 'Create Case Type')

WebUI.setText(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/input_Create Case Type_PNewCaseTypeStagesppyLabel'), 
    'Katalon Case')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/i_Use AI to suggest a life cycle and data m_245ba6'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Next'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/a_FORM STEP'))

WebUI.setText(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/input_Required_PCaseTypeStagesppyStagesl1pp_c38d07'), 
    'Information 123')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/a_STAGE'))

WebUI.setText(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/input_Required_PCaseTypeStagesppyStagesl2pp_895c2f'), 
    'Stage 123')

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Save'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Preview'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Exit preview'))

WebUI.click(findTestObject('OR Pega/Page_Pega App Studio/button_case_type'))

WebUI.click(findTestObject('OR Pega/Page_Pega App Studio/i_gridlayouttable_row'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/span_Delete Case Type'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_OK'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/a_Data'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Add data object'))

WebUI.setText(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/input_Data Object name_PpyWorkPageppyDataTy_ee8150'), 
    'Data Object 123')

WebUI.click(findTestObject('OR Pega/Page_Pega App Studio/i_Use AI to suggest a life cycle and data m_245ba6'))

WebUI.click(findTestObject('OR Pega/Page_Pega App Studio/button_Next2'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Submit'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Save_1'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Preview'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_Exit preview'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/a_Data'))

WebUI.click(findTestObject('OR Pega/Page_Pega App Studio/i_rolekey-row'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/span_Delete'))

WebUI.click(findTestObject('Object Repository/OR Pega/Page_Pega App Studio/button_OK_1'))

WebUI.closeBrowser()

