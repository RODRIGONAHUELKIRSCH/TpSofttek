package quarkus.obraSocial.Dtos;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
public class EspecialidadDTO {

    private Long idEspecialidad;
    private String area_especialidad;

    public EspecialidadDTO() {}

<<<<<<< HEAD
    public EspecialidadDTO( String areaEspecialidad) {
        
=======
    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
        this.area_especialidad = areaEspecialidad;
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long id) {
        this.idEspecialidad = id;
    }

    public String getAreaEspecialidad() {
        return area_especialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.area_especialidad = areaEspecialidad;
    }
}