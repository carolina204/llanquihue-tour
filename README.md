# LlanquihueTourApp

## Descripcion

Programa Java para gestionar un catalogo de tours de Llanquihue Tour.
Lee cinco tours desde un archivo de texto, crea objetos Tour,
los almacena en un ArrayList y muestra todos los tours y un filtro
de los gastronomicos.

## Estructura

```text
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   └── Tour.java
│   ├── data/
│   │   └── GestorDatos.java
│   └── ui/
│       └── Main.java
└── resources/
    └── tours.txt
```

## Formato del archivo

Cada linea de resources/tours.txt contiene nombre, tipo y precio,
separados por punto y coma:

```text
SaboresDelLago;Gastronomico;35000
```

El precio debe ser un numero entero. No agregar encabezados
ni espacios entre los campos.

## Funcionamiento

- Tour representa el nombre, tipo y precio de un tour.
- GestorDatos lee el archivo y separa los campos con split(";").
- Cada registro se convierte en un objeto y se agrega al ArrayList.
- Main recorre la lista y muestra todos los tours.
- Luego filtra y muestra los de tipo Gastronomico.

## Requisitos

JDK 23 e IntelliJ IDEA.

## Ejecutar en IntelliJ IDEA

1. Abrir la carpeta LlanquihueTourApp como proyecto.
2. Seleccionar el JDK 23.
3. Abrir src/ui/Main.java.
4. Ejecutar el metodo main con el triangulo verde.

El directorio de trabajo debe ser la carpeta principal del proyecto,
para encontrar resources/tours.txt.

## Compilar y ejecutar desde una terminal

Desde la carpeta principal del proyecto:

```text
javac -encoding UTF-8 -d out src/model/Tour.java src/data/GestorDatos.java src/ui/Main.java
java -cp out ui.Main
```

## Resultado esperado

Se muestran cinco tours y luego dos gastronomicos:
SaboresDelLago y CocinaDelSur.