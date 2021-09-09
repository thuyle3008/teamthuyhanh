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

WebUI.navigateToUrl('https://nightly.portal.genetica.asia/admin/login/?next=/admin/')

WebUI.setText(findTestObject('Object Repository/nightly.Portal/Page_Log in  Genetica/input_Username_username'), 'hanh')

WebUI.setEncryptedText(findTestObject('Object Repository/nightly.Portal/Page_Log in  Genetica/input_Password_password'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('nightly.Portal/Page_Log in  Genetica/btn_Login'))

WebUI.click(findTestObject('Object Repository/nightly.Portal/Page_Site administration  Genetica/strong_Payment requests'))

WebUI.setText(findTestObject('nightly.Portal/Page_Select payment request to change  Genetica/input_SearchFilters'), GlobalVariable.OrderID)

WebUI.click(findTestObject('nightly.Portal/Page_Select payment request to change  Genetica/btn_SearchPR'))

WebUI.click(findTestObject('nightly.Portal/Page_Select payment request to change  Genetica/ChoosenPRID'))

//WebUI.click(findTestObject('Object Repository/nightly.Portal/Page_Select payment request to change  Genetica/a_21090911d4094c84'))
//WebUI.verifyElementPresent(findTestObject('nightly.Portal/Page_Change payment request  Genetica/PaymentType'), 0)
WebUI.verifyElementAttributeValue(findTestObject('nightly.Portal/Page_Change payment request  Genetica/PaymentType'), 'value', 
    'BANK_SCB', 0)

WebUI.verifyElementPresent(findTestObject('nightly.Portal/Page_Change payment request  Genetica/statusPR'), 0)

WebUI.closeBrowser()

