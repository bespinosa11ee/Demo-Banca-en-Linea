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

/*
 * Login 
 */
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

    WebUI.takeAreaScreenshot(username)
} else {
    println('no ingreso el usuario')

    WebUI.takeScreenshot()
}

// ingresar contrasena
TestObject password = findTestObject('Object Repository/Modulo 1/Login/ingresar password')

// ingresar contrasena
if (WebUI.verifyElementPresent(password, 5)) {
    WebUI.setText(password, pass)

    // Simula la tecla TAB para mover el foco al siguiente campo
    WebUI.sendKeys(passwordField, Keys.chord(Keys.TAB))

    printl('ingreso contrasena')

    WebUI.takeAreaScreenshot(password)

    WebUI.takeScreenshot()
} else {
    printl('no ingreso la contrasena')

    WebUI.takeScreenshot()
}

//Hacer clic en el boton Login
TestObject btnLogin = findTestObject('Object Repository/Modulo 1/Login/boton login')

if (WebUI.verifyElementPresent(password, 5)) {
    WebUI.click(btnLogin, 5)

    printl('hizo clic en el boton Login')

    WebUI.takeAreaScreenshot(btnLogin)

    WebUI.takeScreenshot()
} else {
    printl('no hizo clic en el boton login')

    WebUI.takeScreenshot()
}

/*
 * transacciones 
 */
// ir al menu de transferencia y hacer clic-------------------------------------------------------------------------------------
TestObject menuTransferencia = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton menu transferencias')

// Hacer clic 
if (WebUI.verifyElementPresent(menuTransferencia, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(menuTransferencia, 5)

    WebUI.takeAreaScreenshot(menuTransferencia)

    WebUI.takeScreenshot()

    println('hizo clic en el boton menu transferencia')
} else {
    println('no hizo clic en el boton menu transferencia ')

    WebUI.takeScreenshot()
}

// Selecionar transacciones a terceros --------------------------------------------------------------------------------------------
TestObject transferenciaTercero = findTestObject('Object Repository/Modulo 2/transacciones a terceros/seleccion a tercero')

// verificar que exista elemento
if (WebUI.verifyElementPresent(transferenciaTercero, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(TransferenciaTercero, 5)

    println('hizo clic en transferencia a tercero')

    WebUI.takeAreaScreenshot(null)

    WebUI.takeAreaScreenshot()
} else {
    println('no ingreso el usuario')

    WebUI.takeScreenshot()
}

/*
 * se accede a datos de la transferencia 
 */
// Lista de cuenta 
TestObject listaCuenta = findTestObject('Object Repository/Modulo 2/transacciones a terceros/lista cuenta debito')

if (WebUI.verifyElementPresent(listaCuenta, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(listaCuenta, 5)

    println('hizo clic en la lista de cuenta')

    WebUI.takeAreaScreenshot(listaCuenta)

    WebUI.takeScreenshot()
} else {
    println('no hizo clic en la lista de cuenta')

    WebUI.takeScreenshot()
}

// Selecciona la cuenta 
TestObject seleccionaCuenta = findTestObject('Object Repository/Modulo 2/transacciones a terceros/cuenta debito')

if (WebUI.verifyElementPresent(seleccionaCuenta, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(seleccionaCuenta, 5)

    println('hizo clic en la cuenta')

    WebUI.takeAreaScreenshot(seleccionaCuenta)

    WebUI.takeScreenshot()
} else {
    println('no hizo clic en la cuenta')

    WebUI.takeScreenshot()
}

// ingresa el monto a pagar 
TestObject montoPagar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar monto a pagar')

if (WebUI.verifyElementPresent(montoPagar, 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(montoPagar, monto)

    // Simula la tecla TAB para mover el foco al siguiente campo
    WebUI.sendKeys(montoPagar, Keys.chord(Keys.TAB))

    println('ingreso monto a pagar')

    WebUI.takeAreaScreenshot(montoPagar)

    WebUI.takeScreenshot()
} else {
    println('no ingreso el monto')

    WebUI.takeScreenshot()
}

// lista de destino de producto 
TestObject listaDestino = findTestObject('Object Repository/Modulo 2/transacciones a terceros/lista Producto Destino')

if (WebUI.verifyElementPresent(listaDestino, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(listaDestino, 5)

    println('hizo clic en la lista destino')

    WebUI.takeAreaScreenshot(listaDestino)
} else {
    println('no hizo clic en la lista de producto')

    WebUI.takeScreenshot()
}

// selecciona el destino del producto 
TestObject seleccionProducto = findTestObject('Object Repository/Modulo 2/transacciones a terceros/producto destino')

if (WebUI.verifyElementPresent(seleccionProducto, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(seleccionProducto, 5)

    println('hace clic en el producto destino')
} else {
    println('no hizo clic en el producto destino')

    WebUI.takeScreenshot()
}

// ingresar la cuenta destino 
TestObject cuentaDestino = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar Cuenta Destino')

if (WebUI.verifyElementPresent(cuentaDestino, 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(cuentaDestino, cuenta)

    // Simula la tecla TAB para mover el foco al siguiente campo
    WebUI.sendKeys(cuentaDestino, Keys.chord(Keys.TAB))

    println('ingreso la cuenta destino')

    WebUI.takeScreenshot()
} else {
    println('no ingreso el monto')

    WebUI.takeScreenshot()
}

// ingresar el concepto 
TestObject ingresaConcepto = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar Concepto')

if (WebUI.verifyElementPresent(ingresaConcepto, 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(ingresaConcepto, concepto)

    // Simula la tecla TAB para mover el foco al siguiente campo
    WebUI.sendKeys(ingresaConcepto, Keys.chord(Keys.TAB))

    println('ingresar concepto')

    WebUI.takeScreenshot()
}

// ingresar el correo electronico 
TestObject ingresaCorreo = findTestObject('Object Repository/Modulo 2/transacciones a terceros/ingresar CORREO')

if (WebUI.verifyElementPresent(ingresaCorreo, 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(ingresaCorreo, correo)

    // Simula la tecla TAB para mover el foco al siguiente campo
    WebUI.sendKeys(ingresaCorreo, Keys.chord(Keys.TAB))

    println('ingresa el correo electronico')

    WebUI.takeScreenshot()
} else {
    println('no ingreso el correo')

    WebUI.takeScreenshot()
}

// hacer clic en el boton continuar 
TestObject btnContinuar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/buton continuar')

if (WebUI.verifyElementPresent(btnContinuar, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(btnContinuar, 5)

    println('hizo clic en el boton continuar')
} else {
    println('no hizo clic en el boton continuar')

    WebUI.takeScreenshot()
}

//  hacer clic en el boton aceptar 
TestObject btnAceptar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/buton Aceptar')

if (WebUI.verifyElementPresent(btnAceptar, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(btnAceptar, 5)

    println('hizo clic en el boton aceptar')

    WebUI.takeScreenshot()
} else {
    println('no hizo clic en el boton aceptar')

    WebUI.takeScreenshot()
}

// hacer clic en el boton cerrar 
TestObject btnCerrar = findTestObject('Object Repository/Modulo 2/transacciones a terceros/boton cerrar')

if (WebUI.verifyElementPresent(btnCerrar, 5, FailureHandling.OPTIONAL)) {
    WebUI.click(btnCerrar, 5)

    println('hizo clic en el boton cerrar')

    WebUI.takeScreenshot()
} else {
    println('no hizo clic en el boton cerrar')

    WebUI.takeScreenshot()
}

