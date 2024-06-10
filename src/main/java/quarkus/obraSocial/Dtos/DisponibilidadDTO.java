package quarkus.obraSocial.Dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisponibilidadDTO {
	

    private Long id;
    private Long idMedico;
    private String fecha;
    private String horaInicio;
    private String horaFin;

    private String ubicacion;



	public DisponibilidadDTO() {
    }

    public DisponibilidadDTO(Long id, Long idMedico, String fecha, String horaInicio, String horaFin,String ubicacion) {
        this.id = id;
        this.idMedico = idMedico;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.ubicacion=ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}
	
    public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}    
