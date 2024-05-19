# Calculadora

Calculadora con las 4 operaciones básicas de dos operandos

## Pre-requisitos

- Java 17 ([Oracle](https://www.oracle.com/java/technologies/downloads/#java17) u [OpenJDK](https://openjdk.java.net/install/))
- [Maven](https://maven.apache.org/)

### 1. Clona el repositorio:
 ```bash
 git clone https://github.com/martinSaav/calculadora.git
 cd calculadora
 ```

### 2. Pruebas

Para compilar y correr las pruebas, ubicarse en el mismo directorio que el archivo `pom.xml` e ingresar:

```bash
$ mvn clean test
```

### 3. Empaquetado

```bash
$ mvn clean package
```


### 4. Ejecución de la aplicación

```shell script
$ java -jar target/calculadora-1.0-SNAPSHOT.jar
```

## Interfaz

Una vez iniciado el programa el usuario visualizara la siguiente interfaz de consola:<br/>
  a-Sumar<br/>
  b-Restar<br/>
  c-Multiplicar<br/>
  d-Dividir<br/>
  e-Salir<br/>
