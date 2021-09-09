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

WebUI.navigateToUrl('https://nightly.odoo.genetica.asia/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Singinodoo1/Page_Genetica ERP System/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Singinodoo1/Page_Login  Genetica  ERP System/input_Email_login'), 'thuy.le@genefriendway.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Singinodoo1/Page_Login  Genetica  ERP System/input_Password_password'), 
    'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Singinodoo1/Page_Login  Genetica  ERP System/button_Log in'))

WebUI.click(findTestObject('Object Repository/Singinodoo1/Page_Discuss - Odoo/a_Connection restored. You are back online_full'))

WebUI.click(findTestObject('Object Repository/Singinodoo1/Page_Discuss - Odoo/a_CRM'))

WebUI.click(findTestObject('Object Repository/Singinodoo1/Page_Pipeline - Odoo/span_Leads'))

WebUI.closeBrowser()

