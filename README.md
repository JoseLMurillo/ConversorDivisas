# Conversor de Moneda
Este proyecto es un conversor de moneda que utiliza la API ExchangeRate para realizar conversiones entre varias divisas. El sistema permite al usuario ingresar un valor y convertirlo entre diferentes monedas. El menú ofrece varias opciones de conversión, incluyendo dólares, pesos argentinos, reales brasileños y pesos colombianos.

## Funcionalidades
### 1. **Menú interactivo**
   - El sistema presenta un menú donde el usuario puede seleccionar entre varias opciones de conversión de divisas.
   - Opciones disponibles:
     - Dólar (USD) a Peso Argentino (ARS)
     - Peso Argentino (ARS) a Dólar (USD)
     - Dólar (USD) a Real Brasileño (BRL)
     - Real Brasileño (BRL) a Dólar (USD)
     - Dólar (USD) a Peso Colombiano (COP)
     - Peso Colombiano (COP) a Dólar (USD)
     - Salir del sistema.

### 2. **Validación de Entrada**
   - Se solicita al usuario ingresar un valor positivo para realizar la conversión.
   - Si el valor ingresado es incorrecto o no es positivo, el sistema mostrará un mensaje de error solicitando una nueva entrada.

### 3. **Conversión de Moneda**
   - El sistema hace una solicitud a la API ExchangeRate para obtener el tipo de cambio entre las dos divisas seleccionadas.
   - El valor ingresado por el usuario se convierte utilizando el tipo de cambio actual.
   - El resultado de la conversión se muestra en formato decimal con dos dígitos después del punto.

### 4. **Manejo de Errores**
   - Si la API ExchangeRate devuelve un error o no es accesible, el sistema manejará adecuadamente los errores, mostrando mensajes claros para:
     - Problemas de conexión a la API.
     - Tiempo de espera agotado en la solicitud.
     - Otros errores inesperados.

## Estructura del Proyecto
El proyecto está modularizado en las siguientes clases:
1. **Main**  
   Esta clase contiene el método principal `main()` y es responsable de inicializar el menú del sistema.
   
2. **Menu**  
   Gestiona el menú interactivo con el usuario. Muestra las opciones de conversión, maneja la selección del usuario y realiza la validación de entrada para las monedas y valores.
   
3. **CurrencyConverter**  
   Contiene la lógica de conversión de moneda. Recibe los datos de la API, procesa la respuesta y muestra el resultado al usuario.

4. **ApiClient**  
   Maneja la comunicación con la API ExchangeRate. Hace solicitudes HTTP y gestiona las respuestas o posibles errores durante el proceso.

## Requisitos
- Java 8 o superior
- Conexión a Internet (para las solicitudes a la API ExchangeRate)

## Uso

1. Clona el repositorio en tu máquina local:
   ```bash
   git clone https://github.com/usuario/conversormoneda.git
   ```

2. Navega a la carpeta del proyecto:
   ```bash
   cd conversormoneda
   ```

3. Compila el proyecto:
   ```bash
   javac -cp .:path/al/gson.jar org/conversormoneda/Main.java
   ```

4. Ejecuta el programa:
   ```bash
   java -cp .:path/al/gson.jar org.conversormoneda.Main
   ```

## Dependencias
Este proyecto utiliza la siguiente biblioteca:

- **Gson**: Biblioteca para procesar JSON en Java, utilizada para deserializar la respuesta de la API ExchangeRate.

Puedes descargar Gson desde [aquí](https://github.com/google/gson) y añadirlo a tu proyecto.

## Configuración de la API

Este proyecto utiliza la API ExchangeRate. Para obtener una clave API válida, puedes registrarte en [ExchangeRate API](https://www.exchangerate-api.com/). Una vez obtengas la clave, actualiza el valor en la clase `ApiClient`:

```java
private static final String API_KEY = "tu_clave_api_aqui";
```

## Mejoras Futuras

- Añadir más monedas para la conversión.
- Implementar una interfaz gráfica (GUI) para mejorar la experiencia del usuario.
- Optimizar el manejo de errores para cubrir más casos de uso.

## Contribución

Si deseas contribuir, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama con tu nueva funcionalidad:
   ```bash
   git checkout -b mi-nueva-funcionalidad
   ```
3. Realiza los cambios necesarios y añade los commits:
   ```bash
   git commit -m "Añadir nueva funcionalidad"
   ```
4. Haz push a la rama creada:
   ```bash
   git push origin mi-nueva-funcionalidad
   ```
5. Crea un Pull Request en GitHub.
