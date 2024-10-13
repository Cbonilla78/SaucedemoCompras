# author: Christian Bonilla
# language: es


@authenticationLogin
Característica: Autenticación exitosa

  Quiero realizar una prueba de autenticación al sitio web
  Antecedentes:
    Dado "userprueba" abre el sitio web

  @authenticationSuccess
  Escenario: Autenticación de usuario exitosa.
    Cuando ingresa las credenciales
    Entonces visualizara el home y espera una validacion

  @authenticationFail
  Escenario: Autenticación de usuario fallida.
    Cuando ingresa las credenciales incorrectas
    Entonces visualizara un mensaje de error