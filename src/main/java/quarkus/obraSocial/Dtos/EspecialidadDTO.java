package quarkus.obraSocial.Dtos;

public class EspecialidadDTO {

    private Long idEspecialidad;
    private String areaEspecialidad;

    public EspecialidadDTO() {}

    public EspecialidadDTO(Long id, String areaEspecialidad) {
        this.idEspecialidad = id;
        this.areaEspecialidad = areaEspecialidad;
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long id) {
        this.idEspecialidad = id;
    }

    public String getAreaEspecialidad() {
        return areaEspecialidad;
    }

    public void setAreaEspecialidad(String areaEspecialidad) {
        this.areaEspecialidad = areaEspecialidad;
    }
}