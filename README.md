Simulacion_check_in_Aerolinea
API de Airline
Esta es una API de ejemplo para gestionar vuelos y pasajeros de una aerolínea. Proporciona endpoints para crear, obtener, actualizar y eliminar vuelos, así como para obtener los pasajeros de un vuelo específico.

Ejecutar la API
Clona el repositorio en tu máquina local

Importa el proyecto en tu IDE preferido.

Configura la base de datos:

Asegúrate de tener un servidor MySQL en ejecución.
Crea una base de datos llamada 'airline'.
Configura los datos de conexión a la base de datos en el archivo src/main/resources/application.properties.
Ejecuta la aplicación:
Ejecuta la clase Main como una aplicación Java.
La API estará disponible en http://localhost:8080.
Endpoints
GET /flights: Obtiene todos los vuelos.
GET /flights/{id}: Obtiene un vuelo específico por su ID.
POST /flights: Crea un nuevo vuelo.
PUT /flights/{id}: Actualiza un vuelo existente por su ID.
DELETE /flights/{id}: Elimina un vuelo existente por su ID.
GET /flights/{id}/passengers: Obtiene los pasajeros de un vuelo específico por su ID.
Documentación adicional
Documentación de la API: Proporciona información detallada sobre los endpoints, los parámetros y las respuestas de la API.

Guía de contribución: Proporciona información sobre cómo contribuir al proyecto.

Información adicional sobre la implementación: Proporciona detalles técnicos sobre la implementación de la API.

Contacto
Si tienes alguna pregunta o consulta sobre este proyecto, puedes contactarme a través de javlucky83@gmail.com
