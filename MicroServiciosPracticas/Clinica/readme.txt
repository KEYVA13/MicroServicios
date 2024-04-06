Microservicio de Gestión de Pacientes y Turnos
Este proyecto consiste en un sistema de gestión de pacientes y turnos implementado como microservicios. Hay dos microservicios separados, uno para la gestión de pacientes y otro para la gestión de turnos.

Servicio de Pacientes
Endpoints Disponibles
Crear un Nuevo Paciente

Método: POST

URL: /pacientes/crear
{
    "dni" : "12345678",
    "nombre" : "kevin",
    "apellido" : "gonzalez",
    "fechaNac" : "2000-12-24",
    "telefono" : "2494306177"
}
Descripción: Crea un nuevo registro de paciente en la base de datos.
Obtener Todos los Pacientes
Método: GET
URL: /pacientes/traer
Descripción: Obtiene una lista de todos los pacientes registrados en la base de datos.
Eliminar un Paciente

Método: DELETE
URL: /pacientes/borrar/{id}
Descripción: Elimina el registro de un paciente específico de la base de datos según su ID.
Editar un Paciente

Método: PUT
URL: /pacientes/editar/{id_original}
Descripción: Edita los detalles de un paciente existente en la base de datos.
Obtener un Paciente en Particular

Método: GET
URL: /pacientes/traer/{id}
Descripción: Obtiene los detalles de un paciente específico según su ID.
Obtener un Paciente por DNI

Método: GET
URL: /pacientes/traerdni/{dni}
Descripción: Obtiene los detalles de un paciente específico según su número de documento.
Servicio de Turnos
Endpoints Disponibles
Crear un Nuevo Turno

Método: POST
URL: /turnos/crear
{
    "fecha" : "2003-03-13",
    "tratamiento" : "Entrenar mucho",
    "dni" : "12345678"
}
Descripción: Crea un nuevo turno asignado a un paciente en particular.
Obtener Todos los Turnos

Método: GET
URL: /turnos/traer
Descripción: Obtiene una lista de todos los turnos registrados en la base de datos.
Eliminar un Turno

Método: DELETE
URL: /turnos/borrar/{id}
Descripción: Elimina un turno específico de la base de datos según su ID.
Editar un Turno

Método: PUT
URL: /turnos/editar/{id_original}
Descripción: Edita los detalles de un turno existente en la base de datos.
Obtener un Turno en Particular

Método: GET
URL: /turnos/traer/{id}
Descripción: Obtiene los detalles de un turno específico según su ID.