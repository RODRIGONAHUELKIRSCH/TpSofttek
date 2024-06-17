package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Entities.Especialidad;

@ApplicationScoped
public class EspecialidadMapper {

    public EspecialidadDTO toDTO(Especialidad especialidad) {
        if (especialidad == null) {
            return null;
        }
        return new EspecialidadDTO(
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
                
=======
                especialidad.id,
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
                especialidad.id,
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
                especialidad.id,
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
                especialidad.getArea_especialidad()
        );
    }

    public Especialidad toEspecialidad(EspecialidadDTO especialidadDTO) {
        if (especialidadDTO == null) {
            return null;
        }
        Especialidad especialidad = new Especialidad();
        especialidad.id = especialidadDTO.getIdEspecialidad();
        especialidad.setArea_especialidad(especialidadDTO.getAreaEspecialidad());
        return especialidad;
    }
}