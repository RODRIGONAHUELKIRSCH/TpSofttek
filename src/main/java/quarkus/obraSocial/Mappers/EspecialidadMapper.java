package quarkus.obraSocial.Mappers;

import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Entities.Especialidad;

public class EspecialidadMapper {

    public static EspecialidadDTO toDTO(Especialidad especialidad) {
        if (especialidad == null) {
            return null;
        }
        return new EspecialidadDTO(
                especialidad.id,
                especialidad.getArea_especialidad()
        );
    }

    public static Especialidad toEspecialidad(EspecialidadDTO especialidadDTO) {
        if (especialidadDTO == null) {
            return null;
        }
        Especialidad especialidad = new Especialidad();
        especialidad.id = especialidadDTO.getIdEspecialidad();
        especialidad.setArea_especialidad(especialidadDTO.getAreaEspecialidad());
        return especialidad;
    }
}