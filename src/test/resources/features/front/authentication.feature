
# se procede a crear la estructura, prosa y gramatica del gherkin en español, por buenas practicas.
# esto depende mucho de nuestro cliente

@authenticationLogin
Característica: Autenticación exitosa

  Yo como TAE(Test automation engineer)
  Quiero realizar una prueba de autenticación al sitio web
  Para comprobar la robustes y control de errores del aplicativo web, funcionen correctamente
# Se crea Gherkin declarativo - ya que esta orientado a obtener el resultado deseado y es mucho mas claro
  # y asi evitamos el gherkin imperactivo, donde no es buena practica tener detalles tecnico
  # (Esto depende de la estrategia  y de acuerdo al gobierno de calidad del cliente)
  # recodar que es una prosa donde, se da claridad para personas tecnicas(dev) y no tenicas(user)


  Antecedentes:
    Dado "userprueba" abre el sitio web

  @authenticationSuccess
  Escenario: Autenticación de usuario exitosa.
    Cuando ingresa las credenciales
    Entonces visualizara el home y espera una validacion

  @addTwoProductsToCard
  Escenario: Agregar productos al carro de compras
    Cuando se autentica de forma exitosa y agrega dos productos
    Entonces visualizara que se agregaron al carrito de compras 2 productos
