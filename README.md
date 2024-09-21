# TP5 API REST - Trabajo practico de Api Rest

Este proyecto es una API REST desarrollada con Spring Boot para gestionar entidades como Persona, Domicilio, Localidad, Libro y Autor. El proyecto utiliza Hibernate Envers para auditoría de las entidades y está configurado con una base de datos MySQL o H2.

## Tabla de Contenidos

- [Requisitos](#requisitos)
- [Configuración del Proyecto](#configuración-del-proyecto)
- [Estructura del Proyecto](#estructura-del-proyecto)
- [Endpoints](#endpoints)
- [Dependencias](#dependencias)
- [Comandos Útiles](#comandos-útiles)

## Requisitos

- Java 17
- Maven 3.x
- MySQL o H2 (Base de datos)

## Configuración del Proyecto

### Clonar el repositorio:

```bash
git clone https://github.com/usuario/persona-api.git

```
##Configurar la base de datos:

El proyecto está configurado para usar MySQL o H2. Si prefieres MySQL, actualiza las propiedades de la base de datos en application.properties:

    spring.datasource.url=jdbc:mysql://localhost:3306/persona_db
    spring.datasource.username=root
    spring.datasource.password=tu_contraseña

Para usar H2, simplemente configura el scope de H2 en runtime en el archivo pom.xml y ejecuta el proyecto directamente.

## Compilar el proyecto:

    mvn clean install

## Ejecutar la aplicación:

    mvn spring-boot:run

## Estructura del Proyecto

    Entities: Contiene las entidades de la aplicación, incluyendo Persona, Domicilio, Localidad, Libro, y Autor, cada una de ellas auditada con Hibernate Envers.
    Controllers: Controladores REST que exponen los endpoints de las entidades.
    Services: Implementaciones de la lógica de negocio.
    Repositories: Repositorios que extienden JpaRepository para realizar las operaciones CRUD.

## Endpoints
Persona

    GET /api/v1/personas - Obtener todas las personas
    GET /api/v1/personas/{id} - Obtener una persona por ID
    POST /api/v1/personas - Crear una nueva persona
    PUT /api/v1/personas/{id} - Actualizar una persona por ID
    DELETE /api/v1/personas/{id} - Eliminar una persona por ID

Domicilio

    GET /api/v1/domicilios - Obtener todos los domicilios
    GET /api/v1/domicilios/{id} - Obtener un domicilio por ID
    POST /api/v1/domicilios - Crear un nuevo domicilio
    PUT /api/v1/domicilios/{id} - Actualizar un domicilio por ID
    DELETE /api/v1/domicilios/{id} - Eliminar un domicilio por ID

Localidad

    GET /api/v1/localidades - Obtener todas las localidades
    GET /api/v1/localidades/{id} - Obtener una localidad por ID
    POST /api/v1/localidades - Crear una nueva localidad
    PUT /api/v1/localidades/{id} - Actualizar una localidad por ID
    DELETE /api/v1/localidades/{id} - Eliminar una localidad por ID

Libro

    GET /api/v1/libros - Obtener todos los libros
    GET /api/v1/libros/{id} - Obtener un libro por ID
    POST /api/v1/libros - Crear un nuevo libro
    PUT /api/v1/libros/{id} - Actualizar un libro por ID
    DELETE /api/v1/libros/{id} - Eliminar un libro por ID

Autor

    GET /api/v1/autores - Obtener todos los autores
    GET /api/v1/autores/{id} - Obtener un autor por ID
    POST /api/v1/autores - Crear un nuevo autor
    PUT /api/v1/autores/{id} - Actualizar un autor por ID
    DELETE /api/v1/autores/{id} - Eliminar un autor por ID

## Dependencias

Las principales dependencias utilizadas en el proyecto son:

    Spring Boot Starter Data JPA: Para la integración con Hibernate y JPA.
    Hibernate Envers: Para auditoría de las entidades.
    Spring Boot Starter Web: Para exponer servicios REST.
    H2 Database: Base de datos en memoria para pruebas.
    MySQL Connector: Para conexión a la base de datos MySQL.
    Lombok: Para reducir el código boilerplate.













