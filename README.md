# LlanquihueTourApp

Autor: CAROLINA ANZA BELMAR

## Descripcion

Aplicacion de consola en Java para gestionar tours de Llanquihue Tour.
Lee datos desde un archivo externo, los almacena en un ArrayList,
muestra todos los tours, filtra por tipo y permite buscar por nombre.

## Paquetes y clases

- model: Tour, Destino y Operador.
- data: GestorDatos, encargado de leer y validar el archivo.
- service: CatalogoTours, componente reutilizable para agregar,
  listar, buscar y filtrar tours, evitando nombres duplicados.
- ui: Main, punto de entrada de la aplicacion.

## Relaciones y validaciones

Tour contiene un Destino y un Operador.
Las clases del modelo tienen atributos privados, constructores,
getters, setters y toString().

Se validan textos obligatorios, precios positivos, telefonos
y objetos asociados. Los registros incorrectos se informan
por linea y se omiten mediante try-catch.

## Estructura

```text
src/
  model/
    Tour.java
    Destino.java
    Operador.java
  data/
    GestorDatos.java
  service/
    CatalogoTours.java
  ui/
    Main.java
resources/
  tours.txt
LlanquihueTourApp.jar
LlanquihueTourLib.jar
README.md
```

## Archivo de datos

Cada linea de tours.txt contiene siete campos separados por
punto y coma:

nombre;tipo;precio;destino;comuna;operador;telefono

Los registros incluidos son ficticios.

## Requisitos

JDK 23 para compilar y ejecutar.
IntelliJ IDEA para trabajar con el proyecto.

## Ejecutar desde IntelliJ IDEA

1. Abrir la carpeta LlanquihueTourApp.
2. Seleccionar JDK 23.
3. Abrir src/ui/Main.java.
4. Ejecutar el metodo main.
5. Escribir el nombre de un tour y presionar Enter.

El directorio de trabajo debe ser la carpeta principal del proyecto.

## Compilar

Desde la carpeta principal:

```text
javac -encoding UTF-8 -d build src/model/*.java src/service/*.java src/data/*.java src/ui/*.java
```

## Crear y ejecutar la distribucion

```text
jar --create --file LlanquihueTourApp.jar --main-class ui.Main -C build .
java -jar LlanquihueTourApp.jar resources/tours.txt
```

Distribuir LlanquihueTourApp.jar junto con la carpeta resources.

## Libreria personalizada

LlanquihueTourLib.jar contiene las clases del modelo y CatalogoTours
para reutilizarlas en otras aplicaciones.
No es un ejecutable independiente.

Para generarla despues de compilar:

```text
jar --create --file LlanquihueTourLib.jar -C build model -C build service
```

## Prueba de funcionamiento

Se comprobo la ejecucion del archivo JAR:
carga cinco tours, muestra dos gastronomicos y encuentra
SaboresDelLago al buscar por nombre.