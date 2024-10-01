@addProducts
Característica: Elegir productos

  Yo como TAE(Test automation engineer)
  Quiero agregar varios productos
  Para  visualizarlos en mi carrito de compras


  Antecedentes:
    Dado "userprueba" abre el sitio web
    Cuando ingresa las credenciales

  @addTwoProductsToCard
  Escenario: Agregar productos al carro de compras
    Cuando se autentica de forma exitosa y agrega dos productos
    Entonces visualizara que se agregaron al carrito de compras 2 productos
