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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('http://localhost:41237/')

WebUI.setText(findTestObject('Object Repository/Quan ly thiet bi/Page_Qun L Ti Sn DKC/input_Tn Ngi Dng_UserName'), 'BMT')
WebUI.setText(findTestObject('Object Repository/Quan ly thiet bi/Page_Qun L Ti Sn DKC/input_Mt Khu_Password'), '12345')
WebUI.click(findTestObject('Object Repository/Quan ly thiet bi/Page_Qun L Ti Sn DKC/button_ng Nhp'))
WebUI.click(findTestObject('Object Repository/Quan ly thiet bi/Page_Trang Ch/p_Qun L Loi Thit B'))
WebUI.click(findTestObject('Object Repository/Quan ly thiet bi/Page_DeviceType/button_Thm mi'))
WebUI.setText(findTestObject('Object Repository/Quan ly thiet bi/Page_DeviceType/input_Tn Loi_TypeName'), Tenloai)
WebUI.setText(findTestObject('Object Repository/Quan ly thiet bi/Page_DeviceType/input_K Hiu Loi_TypeSymbol'), Kyhieuloai)
WebUI.setText(findTestObject('Object Repository/Quan ly thiet bi/Page_DeviceType/textarea_Notes_Notes'), Notes)
WebUI.click(findTestObject('Object Repository/Quan ly thiet bi/Page_DeviceType/button_Thm'))
WebUI.closeBrowser()

