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

// abrir Navegador 
WebUI.openBrowser('')

WebUI.navigateToUrl(link)

WebUI.maximizeWindow()

// igresar usuario 
TestObject username = findTestObject('Object Repository/Modulo 1/Login/ingresar usuario')

// verificar que exista elemento 
if (WebUI.verifyElementPresent(username, 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(username, user)

    println('ingreso el usuario correctamente')

} else {
    println('no ingreso el usuario')

    WebUI.takeScreenshot()
}

// ingresar contrasena
TestObject password = findTestObject('Object Repository/Modulo 1/Login/ingresar password')

// ingresar contrasena
if (WebUI.verifyElementPresent(password, 5)) {
    WebUI.setText(password, pass)

    println('ingreso contrasena')

    WebUI.takeScreenshot()
} else {
    println('no ingreso la contrasena')

    WebUI.takeScreenshot()
}

//Hacer clic en el boton Login
TestObject btnLogin = findTestObject('Object Repository/Modulo 1/Login/boton login')

if (WebUI.verifyElementPresent(password, 5)) {
    WebUI.click(btnLogin)

    println('hizo clic en el boton Login')

    WebUI.takeScreenshot()
} else {
    println('no hizo clic en el boton login')

    WebUI.takeScreenshot()
}

