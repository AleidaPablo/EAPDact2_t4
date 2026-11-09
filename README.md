# Proyecto Spring Boot - Actividad 1 Tema 4

**Estudiante:** Evelin Aleida Pablo Delgado 
**Repositorio:** `EAPDact1_t4`  

---

## Descripción del Proyecto

Este proyecto es una aplicación web desarrollada con **Java 21** y **Spring Boot 4**, diseñada para demostrar la configuración del entorno de desarrollo local, el uso de controladores MVC y REST con múltiples endpoints, y su despliegue en un servidor virtual privado (VPS).

---

## Tecnologías y Herramientas

* **Lenguaje:** Java 21 (JDK 21.0.10)
* **Framework:** Spring Boot 4.1.2
* **Gestor de dependencias:** Maven
* **Motor de plantillas:** Thymeleaf (`spring-boot-starter-thymeleaf`)
* **Módulo web:** Spring Web (`spring-boot-starter-web`)
* **Servidor embebido:** Apache Tomcat (Puerto `8081`)
* **Infraestructura / VPS:** Ubuntu 24.04 LTS (DigitalOcean)
---

La aplicación cuenta con 3 endpoints probados exitosamente:

| Tipo | Endpoint | Controlador | Descripción | 
| :--- | :--- | :--- | :--- | 
| **GET** | `/detalles_info` | `@Controller` | Página HTML con el nombre del proyecto y estudiante |
| **GET** | `/api/detalles_info2` | `@RestController` | Objeto JSON con metadatos del servidor |
| **GET** | `/api/saludo` | `@RestController` | Objeto JSON con mensaje de saludo |
---
Enlaces del proyecto:
- Repositorio en GitHub: https://github.com/AleidaPablo/EAPDact1_t4

- Endpoint 1 (Vista HTML): http://178.128.155.105:8081/detalles_info
- Endpoint 2 (API JSON): http://178.128.155.105:8081/api/detalles_info2
- Endpoint 3 (API JSON): http://178.128.155.105:8081/api/saludo