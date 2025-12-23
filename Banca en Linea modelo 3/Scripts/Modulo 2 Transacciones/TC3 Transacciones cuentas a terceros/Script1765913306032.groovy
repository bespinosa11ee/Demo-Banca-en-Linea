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

CustomKeywords.'modulo_1.Navegador.navigate'(link)

CustomKeywords.'modulo_1.Login.ingresar_usuario'(user)

CustomKeywords.'modulo_1.Login.ingresar_Contrasena'(pass)

CustomKeywords.'modulo_1.Login.boton_Login'()

CustomKeywords.'modulo_2.TransaccionesTerceros.menuTransferencia'()

CustomKeywords.'modulo_2.TransaccionesTerceros.transferenciaTerceros'()

CustomKeywords.'modulo_2.TransaccionesTerceros.SeleccionCuentaDebito'()

CustomKeywords.'modulo_2.TransaccionesTerceros.ingresarMontoTranferir'(monto)

CustomKeywords.'modulo_2.TransaccionesTerceros.SeleccionProductoDestino'()

CustomKeywords.'modulo_2.TransaccionesTerceros.ingresaCuentaDestino'(cuenta)

CustomKeywords.'modulo_2.TransaccionesTerceros.ingresaConcepto'(concepto)

CustomKeywords.'modulo_2.TransaccionesTerceros.ingresaCorreo'(correo)

CustomKeywords.'modulo_2.TransaccionesTerceros.botonesContinuar'()

CustomKeywords.'modulo_1.Login.Logout'()

