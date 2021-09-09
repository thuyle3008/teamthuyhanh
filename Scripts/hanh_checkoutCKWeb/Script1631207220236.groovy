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
import com.sun.org.apache.bcel.internal.classfile.LocalVariable as LocalVariable
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Cart  Genetica/a_My cart'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Cart  Genetica/a_Child Development'))

WebUI.click(findTestObject('next.Genetica/Page_Child Development  Genetica/AnCombo'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_An Combo  Genetica/a_Add to cart'))

//WebUI.click(findTestObject('next.Genetica/Page_Summary  Genetica/Hide_Quiz'))
WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Cart  Genetica/button_Check out'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/input__fullName'), 'Hạnh')

WebUI.setText(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/input__phoneNumber'), '0928223470')

//CustomKeywords.'NewKeyword.updateEmail'()
Date today = new Date()

String current = today.format('dd/MM/yyyyHH-mm-ss')

WebUI.setText(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/input__email'), ('hanh.nguyen+' + current) + 
    '@genefriendway.com')

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/div_ProvinceCity'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/span_Tnh An Giang'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/div_District'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/div_Huyn An Ph'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/div_Ward'))

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/div_Th Trn An Ph'))

WebUI.setText(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/input__address'), 'a')

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/button_Continue'))

WebUI.scrollToElement(findTestObject('next.Genetica/Page_Summary  Genetica/btn_EditDeliveryInfo'), 0)

//WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/checkbox_BankSCB'))
String BankSCB = 'document.querySelector("label[for=optionBankSCBPayment]").click();'

WebUI.executeJavaScript(BankSCB, null)

String IAgree = 'document.querySelector("label[for=policy]").click();'

WebUI.executeJavaScript(IAgree, null)

WebUI.click(findTestObject('Object Repository/next.Genetica/Page_Summary  Genetica/button_Purchase'))

WebUI.verifyElementText(findTestObject('next.Genetica/Page_ConfirmOrder/txt_ConfirmMsg'), 'Receipt created!')

String text = WebUI.getText(findTestObject('next.Genetica/Page_ConfirmOrder/txt_OrderID'))

String newText = text.substring(18)

CustomKeywords.'NewKeyword.updateGlobalPermanently'('OrderID', newText)

println(GlobalVariable.OrderID)

String msg = WebUI.getText(findTestObject('next.Genetica/Page_ConfirmOrder/txt_MsgCK'))

println(msg)

GlobalVariable.MessageCK = msg

//CustomKeywords.'NewKeyword.updateGlobalPermanently'('MessageCK', msg)
println(GlobalVariable.MessageCK)

WebUI.closeBrowser()

