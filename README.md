1. Las dimensiones de la matriz son definidas por el usuario (m: filas, n: columnas) y se debe considerar que estos datos ingresados sean válidos.
  El usuario debe ingresar dos valores: cantidad de filas (filas) y cantidad de columnas (cols).
  Se debe invocar un método que valide que ambos valores sean mayores a cero.
  Si las dimensiones no son válidas, se muestra un mensaje de error y se retorna al menú.
  Este método solo valida dimensiones, no crea la matriz ni realiza operaciones adicionales.
  El método validarDimensiones() debe ser static, tener un nombre claro y retornar true o false.
  
2. Una vez estén capturadas y validadas las dimensiones de la matriz, se crea la matriz, por lo que recibe como parámetros las dimensiones y devuelve una matriz de enteros.
  Este método debe ser llamado solo si las dimensiones son válidas.
  Crea una nueva matriz de tipo int con las dimensiones indicadas.
  El método retorna la matriz creada, sin llenarla ni validarla nuevamente.
  Su única responsabilidad es la creación de la estructura de la matriz.
  El método debe tener un nombre descriptivo, ser static y contener máximo 15-20 líneas.

3. Llenar la matriz con datos de tipo entero, de forma aleatoria, entre 0 y 9.
  Recorre toda la matriz e inserta números aleatorios entre 0 y 9 en cada celda.
  Solo debe realizar el llenado; no valida ni imprime valores.
  Usa una función nativa como Math.random() o Random.nextInt() para generar los valores.
  El método debe ser static, claro en su propósito, y cumplir la métrica de longitud.

4. Muestre por pantalla toda la fila que desee el usuario.
  El usuario ingresa el número de fila que desea ver.
  El método verifica que el número de fila esté dentro del rango válido.
  Si es válido, se imprimen en pantalla todos los elementos de esa fila.
  Si no es válido, se informa al usuario que la fila no existe.
  Este método solo se encarga de mostrar una fila, no imprime toda la matriz ni gestiona errores del sistema.
  Cumple el principio de una sola responsabilidad y debe ser static.

5. Verificar si la matriz es de TIPO CERO.
  El método recorre toda la matriz contando cuántos ceros contiene.
  Calcula el porcentaje de ceros con respecto al total de elementos.
  Devuelve true si más del 50% de los elementos son ceros, false en caso contrario.
  No imprime nada en pantalla, simplemente realiza el cálculo y retorna el resultado.
  Método único en responsabilidad, estático y eficiente.

6. Considerar un menú.
El menú debe estar dentro de un bucle que se ejecuta hasta que el usuario elija la opción "Salir".
En cada iteración se muestra una lista de opciones al usuario:
Crear matriz
Llenar matriz
Mostrar fila
Verificar si es tipo cero
Salir

Según la opción elegida, se llaman los métodos correspondientes.
Debe verificarse que la matriz esté creada antes de intentar usarla.
La entrada del usuario puede ser gestionada con un método adicional como leerOpcion().
El método menu() no debe superar las 20 líneas, por lo que se recomienda delegar tareas auxiliares (como leer valores, validar opciones, etc.) en otros métodos más pequeños.









  
