

@fillPurchaseForm
Característica: Formulario de compra

  Yo como TAE(Test automation engineer)
  Quiero agregar varios productos
  Para  despues visualizarlos en la pagina de carrito de compras


  Antecedentes:
    Dado "userprueba" abre el sitio web
    Cuando ingresa las credenciales

  @formFill
  Esquema del escenario: Llena la informacion del formulario de compra
    Cuando se autentica de forma exitosa, elige los productos de preferencia y llena el formulario con datos basicos "<nameJson>"
    Entonces visualizara la descripcion general "Checkout: Overview"

    Ejemplos:
      | nameJson                     |
      | dataInformationPersonal.json |