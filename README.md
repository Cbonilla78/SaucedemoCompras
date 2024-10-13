# Autor: Christhian Bonilla
##### ------------------------------------------------------------------------------------------------------
# Realizar una pruebas funcional automatizadas (Prueba E2E) de un flujo de compra
##### ------------------------------------------------------------------------------------------------------

#### Pagina automatizada: https://www.saucedemo.com/
#### Funciones automatizadas: • Autenticarse con el usuario: standard_user y password: secret_sauce • Agregar dos productos al carrito • Visualizar el carrito • Completar el formulario de compra • Finalizar la compra hasta la confirmación: “THANK YOU FOR YOUR ORDER”
#### Patron de diseño: Screenplay
#### Framework: gherkin, cucumber, Junit, SerenityBDD, selenium
#### Framework adicionales: librerias lombok, Faker, SonarLink, cucumber for java, json
#### Lenguaje programacion: Java
#### version gradle: gradle-8.0.2
#### OPEN_JDK Version 17.0.12
#### Driver: Edge version  129.0.2792.52 
#### ID: Intellij IDEA community Edition 2023.1.7
##### ------------------------------------------------------------------------------------------------------
# PASOS PARA LA EJECUCIÓN
## Comando para ejecutar por consola:
#### ./gradlew clean test
##### ------------------------------------------------------------------------------------------------------
### Comando para limpiar la carpeta Target (Reportes)
#### ./gradlew clearReports

### Comando para generar reporte despues que haya terminado un test (Por consola arrojara la ruta .html )
#### ./gradlew reports

### Ruta donde se encuentra el reporte:
#### file:///C:/path proyecto../Compras_saucedemo/SaucedemoCompras/target/site/serenity/serenity-summary.html

