## Datos importantes

- **Rama principal es `develop`**: Tuvimos muchos errores a la hora de hacer merge con Eclipse y por esto, y dado que teníamos tiempo limitado, decidimos dejarlo todo en `develop`.
- **Endpoints listados**: Los endpoints listados son los que están en el `README`.

-**Consideraciones al realizar los endpoint si elimina un turno se elimina el paciente asociado a ese turno ademas si quiere eliminar un turno y este tiene una receta asociada a el se debera eliminar la receta primero

## Endpoints

Crear paciente
{
    "nombre": "Jhon",
    "apellido": "Doe",
    "email": "jdoe@gmail.com",
    "password": "superdificilpassword"
}

Crear especialidad 

{
    "areaEspecialidad":"Cardiologia"
}

Crear medico

{ "idEspecialidad": 1, "nombre": "Javier", "apellido": "Milei", "foto": "mifotojmilei.png",
"email": "jmilei@gmail.com", "password": "capitandelalocura" }

Crear disponibilidad

{"idMedico":1,"horariosConsulta":["8:00","9:00","10:00"],"ubicacion":"tuubicacion"}

Crear turno

{"disponibilidadId":1,"estado":"Disponible","motivo":"gripe","pacienteid": 51,"fecha_hora":"lafechahoradelturno","idmedico":1}

Listar Especialistas
metodo get http://localhost:8080/disponibilidades/especialistas este es el segundo endpoint donde trae todos los especialistas


Actualizar turno

{
    "motivo":"fiebre","fecha_hora":"nuevafechahoradelturno","idmedico":1
}

Borrar turno http://localhost:8080/turnos/1

Crear receta

{
    "idturno":1,
    "fecha_hora":"lahorayfecha"
}
    
Borrar receta http://localhost:8080/recetas/1
