package modulo_2

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class TransaccionesTerceros {
	@Keyword
	def menuTransferencia() {

		TestObject menu_Transferencia = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton menu transferencias')

		if (WebUI.waitForElementClickable(menu_Transferencia, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(menu_Transferencia)
			WebUI.takeScreenshot("Screenshot/Transferencia/menuTransferencia_${timestamp()}.png")
			WebUI.comment("hizo clic en el menu transferencia correctamente")
			KeywordUtil.markPassed("hizo clic en el menu transferencia correctamente")
		} else {
			KeywordUtil.markWarning("no hizo clic en el menu transferencia")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/menuTransferencia_${timestamp()}.png")
		}
	}

	@Keyword
	def transferenciaTerceros() {

		TestObject transferencia = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton menu transferencias')

		if (WebUI.waitForElementClickable(transferencia, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(transferencia)
			WebUI.takeScreenshot("Screenshot/Transferencia/Transferencia_a_Terceros_${timestamp()}.png")
			WebUI.comment("hizo clic en transferencia a tercero correctamente")
			KeywordUtil.markPassed("hizo clic en transferencia a tercero correctamente")
		} else {
			KeywordUtil.markWarning("no hizo clic en transaccion a terceros")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/Transferencia_a_Terceros_${timestamp()}.png")
		}
	}
	
	@Keyword
	def SeleccionCuentaDebito() {
		
		// lista de cuentas debitos
		TestObject listaCuentas = findTestObject('Object Repository/Modulo 2/transacciones a terceros/lista cuenta debito')
		
		if (WebUI.waitForElementClickable(listaCuentas, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(listaCuentas)
			WebUI.takeScreenshot("Screenshot/Transferencia/Lista_cuentas_debito_${timestamp()}.png")
			WebUI.comment("hizo clic en la lista de cuentas debito correctamente")
			KeywordUtil.markPassed("hizo clic en la lista de cuentas debito correctamente")
		} else {
			KeywordUtil.markWarning("no hizo clic en la lista de cuentas debito")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/lista_cuentas_${timestamp()}.png")
		}
		
		// selecciona cuentas debitos
		
		TestObject CuentasDebito = findTestObject('Object Repository/Modulo 2/transacciones a terceros/cuenta debito')
		
		if (WebUI.waitForElementClickable(CuentasDebito, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(CuentasDebito)
			WebUI.takeScreenshot("Screenshot/Transferencia/Selecciono_cuenta_${timestamp()}.png")
			WebUI.comment("hizo clic en la cuenta debito correctamente")
			KeywordUtil.markPassed("hizo clic en la cuenta debito correctamente")
		} else {
			KeywordUtil.markWarning("no hizo hizo clic en la cuenta debito")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_selecciono_cuenta_${timestamp()}.png")
		}
		
	}
	
	@Keyword
	def ingresarCuentaDestino(cuenta) {
		
		// lista de cuentas debitos
		TestObject cuentaDestino = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar Cuenta Destino')
		
		
		if (WebUI.waitForElementClickable(cuentaDestino, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(cuentaDestino, cuenta)
			
			WebUI.comment("ingreso la cuenta destino correctamente")
			KeywordUtil.markPassed("selecciono la cuenta destino correctamente")
			WebUI.sendKeys(cuentadestino, Keys.chord(Keys.TAB))
			WebUI.takeScreenshot("Screenshot/Transferencia/cuentas_destino_${timestamp()}.png")
		} else {
			KeywordUtil.markWarning("no selecciono la cuenta destino")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_Selecciono_cuenta_${timestamp()}.png")
		}
	
}
