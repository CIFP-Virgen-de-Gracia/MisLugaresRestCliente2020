# MisLugaresClientRest
2DAM 2019-2020. 

Este ejemplo esta basado en Mis Lugares, una App que resume mucho de lo visto en el primer trimestre:
https://github.com/joseluisgs/MisLugares2019

Para comprender cómo romper con las limitaciones de un móvil realizamos la persistencia de la información
usando una API REST diseñada para tal motivo en Spring Boot:
https://github.com/joseluisgs/MisLugaresRestService2019

El consumo de la API RESRT se realizará usando la librería RetroFIT: 
https://square.github.io/retrofit/


Se ha creado un nuevo repositorio para que el alumnado no se confudiese con las ramas y así trabajara como dos apps 
independientes, pero manteniendo el histórico de ambas

Se ha eliminado el filtro, porque equivaldría a realizar una llamada a cada API por filtro usando 
el métodpde ordención de Spring Boot. Se puede implementar alternativas

App con un poco de todo
Ficheros, Recycler View, Bases de Datos, Cámara, GPS y Control por Voz

Es importante que gereneréis bien la clave de la API de Google Maps

Mis Lugares:
06/12/2019: Interfaz gráfica 
10/12/2019: Mapas y GPS 
12/12/2019: Inicio de la base de datos y CRUD
15/12/2019: Control por voz para seleccionar
17/12/2019: Liberación del código e inicio de pruebas y comentarios
20/12/2019: JavaDoc

Mis Lugares Client Rest
29/12/2019: Inicio del consumo de la API REST
29/12/2019: Listado usando API REST
