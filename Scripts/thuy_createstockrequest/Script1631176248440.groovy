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

WebUI.navigateToUrl('https://nightly.odoo.genetica.asia/web/login#action=631&model=stock.request.order&view_type=list&cids=&menu_id=472')

WebUI.setText(findTestObject('Object Repository/Createstockrequest/Page_Login  Genetica  ERP System/input_Email_login'), 
    'thuy.le@genefriendway.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Createstockrequest/Page_Login  Genetica  ERP System/input_Password_password'), 
    'HeCM15nHKBI=')

WebUI.sendKeys(findTestObject('Object Repository/Createstockrequest/Page_Login  Genetica  ERP System/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_Odoo/button_Create'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/input_Partner_o_field_input_1623'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/a_L Vn Hin'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/input_Branch_o_field_input_1624'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/a_Mai Thy'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/a_Add a line'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/select_Xut km gi dch vXut l c tnh phXut l k_d68187'), 
    '"sold_with_service"', true)

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/input_Done_o_input ui-autocomplete-input'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/a_All  Adult Kit'))

WebUI.setText(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/input_Done_product_uom_qty'), '1')

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_New - Odoo/button_Save'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_SRO07167 - Odoo/span_Submit'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_SRO07167 - Odoo/span_Validate'))

WebUI.click(findTestObject('Object Repository/Createstockrequest/Page_SRO07167 - Odoo/span_Confirm'))

