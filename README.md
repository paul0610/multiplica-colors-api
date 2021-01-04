# COLOR API

Contiene endpoints que permite tener acceso a los colores estandarizados que se van a utilizar para todos los productos; para páginas web, nuevos diseños, flyers y hasta para redes sociales.

## Comenzando 🚀

_Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas._

Mira **Despliegue** para conocer como desplegar el proyecto.


### Pre-requisitos 📋

Para ejecutarlo en un ambiente local se necesita

```
MySQL 5.1+
JDK 8
El IDE de su preferencia, se recomienda Spring Tool Suite
Apache Tomcat
```

### Instalación 🔧

Ejecutar el script 

```
bd_multiplica.sql
```

Clonar el proyecto del siguiente repositorio

```
https://github.com/paul0610/multiplica-colors-api
```

### pruebas end-to-end 🔩

Para Obtener Todos los colores

```
http://<ip-server>:9696/colors/getAllColorsAvaible?page=1&size=4
```

## Despliegue 📦

Configurar la conección a la base de datos en el archivo dentro del proyecto
```
application.properties
```
Compilar y generar el archivo ColorsApi.war

Desplegar el .war en un servidor Apache Tomcat


## Construido con 🛠️

*  Spring Tool Suite 
* [Maven](https://maven.apache.org/)
* MySQL Workbench

## Autores ✒️

* **Paul Rojas* - *Reto Inicial*

---