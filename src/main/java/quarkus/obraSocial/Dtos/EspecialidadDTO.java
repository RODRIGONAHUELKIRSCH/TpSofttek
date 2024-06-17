package quarkus.obraSocial.Dtos;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
public class EspecialidadDTO {

    private Long idEspecialidad;
    private String area_especialidad;

    public EspecialidadDTO() {}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public EspecialidadDTO( String areaEspecialidad) {
        
=======
    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
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