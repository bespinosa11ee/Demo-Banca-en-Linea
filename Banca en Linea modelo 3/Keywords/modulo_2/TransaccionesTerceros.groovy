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
import org.openqa.selenium.Keys
import internal.GlobalVariable
import com.kms.katalon.core.testobject.ConditionType

public class TransaccionesTerceros {
	@Keyword
	def menuTransferencia() {

		TestObject menutransferencia = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton menu transferencias')

		if (WebUI.waitForElementClickable(menutransferencia, 10, FailureHandling.OPTIONAL)) {
			WebUI.click(menutransferencia)
			WebUI.comment("hizo clic en el menu transferencia correctamente")
			KeywordUtil.markPassed("hizo clic en el menu transferencia correctamente")
			WebUI.takeScreenshot("Screenshot/Transferencia/menuTransferencia_${timestamp()}.png")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/menuTransferencia_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en el menu transferencia")
		}
	}

	// transferencias a terceros
	@Keyword
	def transferenciaTerceros() {

		TestObject transferencia = findTestObject('Object Repository/Modulo 2/transacciones a terceros/seleccion a tercero')


		if (WebUI.waitForElementClickable(transferencia, 10, FailureHandling.OPTIONAL)) {
			WebUI.click(transferencia)

			WebUI.comment("hizo clic en transferencia a tercero correctamente")
			KeywordUtil.markPassed("hizo clic en transferencia a tercero correctamente")
			WebUI.takeScreenshot("Screenshot/Transferencia/Transferencia_a_Terceros_${timestamp()}.png")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/Transferencia_a_Terceros_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en transaccion a terceros")
		}
	}

	/*
	 * seleccionar la cuenta de debito 
	 */

	@Keyword
	def SeleccionCuentaDebito(String numeroCuentaDebito) {

		// lista de cuentas debitos
		TestObject listaCuentas = findTestObject('Object Repository/Modulo 2/transacciones a terceros/lista cuenta debito')

		if (WebUI.waitForElementClickable(listaCuentas, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(listaCuentas)
			WebUI.takeScreenshot("Screenshot/Transferencia/Lista_cuentas_debito_${timestamp()}.png")
			WebUI.comment("hizo clic en la lista de cuentas debito correctamente")
			KeywordUtil.markPassed("hizo clic en la lista de cuentas debito correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/lista_cuentas_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en la lista de cuentas debito")
		}

		// selecciona cuentas debitos
		// Construir XPath dinámico
		String xpathDinamico = "//td[contains(.,'" + numeroCuentaDebito + "')]"

		TestObject CuentasDebito = new TestObject("CuentasDebito")
		CuentasDebito.addProperty("xpath", ConditionType.EQUALS, xpathDinamico)

		if (WebUI.waitForElementClickable(CuentasDebito, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(CuentasDebito)
			WebUI.takeScreenshot("Screenshot/Transferencia/Selecciono_cuenta_${timestamp()}.png")
			WebUI.comment("hizo clic en la cuenta debito correctamente")
			KeywordUtil.markPassed("hizo clic en la cuenta debito correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_selecciono_cuenta_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo hizo clic en la cuenta debito")
		}
	}

	/*
	 * ingresar monto
	 */
	@Keyword
	def ingresarMontoTranferir(String monto) {

		TestObject ingresaMonto = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar monto a pagar')


		if (WebUI.waitForElementClickable(ingresaMonto, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(ingresaMonto, monto)
			WebUI.sendKeys(ingresaMonto, Keys.chord(Keys.TAB))
			WebUI.comment("ingreso el monto correctamente")
			KeywordUtil.markPassed("ingreso el monto correctamente")

			WebUI.takeScreenshot("Screenshot/Transferencia/monto_${timestamp()}.png")
		} else {
			KeywordUtil.markWarning("no selecciono la cuenta destino")
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_ingreso_monto_${timestamp()}.png")
		}
	}

	/*
	 * seleccionar cuenta Destino en esta session se hara clic en la lista de productos y se seleccionara un producto
	 * tipo cuenta ahorro cuenta corriente o prestamo , tarjeta de credito
	 * 
	 */
	@Keyword
	def SeleccionProductoDestino(String tipoProducto) {

		// lista de productos destino
		TestObject listaProductos = findTestObject('Object Repository/Modulo 2/transacciones a terceros/lista Producto Destino')


		if (WebUI.waitForElementClickable(listaProductos, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(listaProductos)
			WebUI.takeScreenshot("Screenshot/Transferencia/Lista_Producto_${timestamp()}.png")
			WebUI.comment("hizo clic en la lista de productos correctamente")
			KeywordUtil.markPassed("hizo clic en la lista de productos correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/lista_productos_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en la lista de productos")
		}

		// selecciona producto cuenta ahorro corriente o prestamo

		// Construir XPath dinámico
		String xpathDinamico = "//td[contains(.,'"+ tipoProducto +"')]"

		TestObject productoDestino = new TestObject("productoDestino")
		productoDestino.addProperty("xpath", ConditionType.EQUALS, xpathDinamico)

		if (WebUI.waitForElementClickable(productoDestino, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(productoDestino)
			WebUI.takeScreenshot("Screenshot/Transferencia/producto_Destino_${timestamp()}.png")
			WebUI.comment("selecciono la cuenta debito correctamente")
			KeywordUtil.markPassed("selecciono la cuenta debito correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_selecciono_producto_Destino_${timestamp()}.png")
			KeywordUtil.markWarning("no seleccione la cuenta debito")
		}
	}



	/*
	 * ingresar cuenta destino 
	 */

	@Keyword
	def ingresaCuentaDestino(cuenta) {

		TestObject cuentaDestino = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar Cuenta Destino')


		if (WebUI.waitForElementClickable(cuentaDestino, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(cuentaDestino, cuenta)

			WebUI.comment("ingreso la cuenta destino correctamente")
			KeywordUtil.markPassed("selecciono la cuenta destino correctamente")
			WebUI.sendKeys(cuentaDestino, Keys.chord(Keys.TAB))
			WebUI.takeScreenshot("Screenshot/Transferencia/cuentas_destino_${timestamp()}.png")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/no_Selecciono_cuenta_${timestamp()}.png")
			KeywordUtil.markWarning("no selecciono la cuenta destino")
		}
	}

	// ingresar concepto

	@Keyword
	def ingresaConcepto(concepto) {

		TestObject ingresarconcepto = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar Concepto')


		if (WebUI.waitForElementClickable(ingresarconcepto, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(ingresarconcepto, concepto)

			WebUI.comment("ingresar el concepto correctamente")
			KeywordUtil.markPassed("ingreso el concepto correctamente")
			WebUI.sendKeys(ingresarconcepto, Keys.chord(Keys.TAB))
			WebUI.takeScreenshot("Screenshot/Transferencia/concepto_${timestamp()}.png")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/concepto_${timestamp()}.png")
			KeywordUtil.markWarning("no ingreso concepto")
		}
	}

	// ingresar correo

	@Keyword
	def ingresaCorreo(correo) {

		TestObject ingresarcorreo = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar CORREO')


		if (WebUI.waitForElementClickable(ingresarcorreo, 10, FailureHandling.OPTIONAL)) {

			WebUI.setText(ingresarcorreo, correo)

			WebUI.comment("ingresar el correo correctamente")
			KeywordUtil.markPassed("ingreso el correo correctamente")
			WebUI.sendKeys(ingresarcorreo, Keys.chord(Keys.TAB))
			WebUI.takeScreenshot("Screenshot/Transferencia/correo_${timestamp()}.png")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/correo_${timestamp()}.png")
			KeywordUtil.markWarning("no ingreso concepto")
		}
	}

	// hacer clic en el boton continuar
	@Keyword
	def botonesContinuar() {


		// boton continuar
		TestObject botonContinuar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/buton continuar')

		if (WebUI.waitForElementClickable(botonContinuar, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(botonContinuar)
			WebUI.takeScreenshot("Screenshot/Transferencia/botonContinuar_${timestamp()}.png")
			WebUI.comment("hizo clic en el boton continuar correctamente")
			KeywordUtil.markPassed("hizo clic en el boton continuar correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/boton_continuar_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en el boton continuar productos")
		}

		// boton aceptar
		TestObject botonAceptar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/buton Aceptar')


		if (WebUI.waitForElementClickable(botonAceptar, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(botonAceptar)
			WebUI.takeScreenshot("Screenshot/Transferencia/boton_Aceptar_${timestamp()}.png")
			WebUI.comment("hizo clic en el boton aceptar correctamente")
			KeywordUtil.markPassed("hizo clic en el aceptar correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/boton_aceptar_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en el boton aceptar")
		}
		// boton cerrar

		TestObject botonCerrar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton cerrar')


		if (WebUI.waitForElementClickable(botonCerrar, 10, FailureHandling.OPTIONAL)) {

			WebUI.click(botonCerrar)
			WebUI.takeScreenshot("Screenshot/Transferencia/boton_cerrar_${timestamp()}.png")
			WebUI.comment("hizo clic en el boton cerrar correctamente")
			KeywordUtil.markPassed("hizo clic en el cerrar correctamente")
		} else {
			WebUI.takeScreenshot("Screenshot/Transferencia_Error/boton_cerrar_${timestamp()}.png")
			KeywordUtil.markWarning("no hizo clic en el boton cerrar")
		}
	}

	private String timestamp() {
		return new Date().format('yyyyMMdd_HHmmss')
	}
}
