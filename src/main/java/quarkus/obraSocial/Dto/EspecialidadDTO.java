package quarkus.obraSocial.Dto;

public class EspecialidadDTO {

    private Long idEspecialidad;
    private String area_especialidad;

    public EspecialidadDTO() {}

    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
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