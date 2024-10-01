# author: Christian Bonilla
# language: es

@checkoutComplete
Característica: Orden completada

  Yo como TAE(Test automation engineer)
  Quiero agregar varios productos
  Para  despues visualizarlos en la pagina de carrito de compras


  Antecedentes:
    Dado "userprueba" abre el sitio web
    Cuando ingresa las credenciales

  @OrdenCompleteSuccessFul
  Esquema del escenario: Validar que la compra se haya completado
    Cuando se autentica de forma exitosa y realiza todo el proceso hasta completar el formulario de datos de la compra "<nameJson>"
    Entonces visualizara un mensaje de la compra completada "Thank you for your order!"

    Ejemplos:
      | nameJson                     |
      | dataInformationPersonal.json |