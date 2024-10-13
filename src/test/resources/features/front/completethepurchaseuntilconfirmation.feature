# author: Christian Bonilla
# language: es
@checkoutComplete
Característica: Orden completada

  Quiero agregar dos productos
  Para  despues visualizarlos en la pagina de carrito de compra y realizar la compra

  Antecedentes:
    Dado "userprueba" abre el sitio web
    Cuando ingresa las credenciales

  @OrdenCompleteSuccessFul
  Esquema del escenario: Validar que la compra se haya completado
    Cuando se autentica de forma exitosa y agrega dos productos
    Entonces visualizara que se agregaron al carrito de compras 2 productos
    Cuando completar el formulario de datos de la compra "<nameJson>"
    Entonces visualizara un mensaje de la compra completada "Thank you for your order!"


    Ejemplos:
      | nameJson                     |
      | dataInformationPersonal.json |