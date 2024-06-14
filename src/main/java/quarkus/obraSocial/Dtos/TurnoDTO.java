package quarkus.obraSocial.Dtos;

import quarkus.obraSocial.Enums.EstadoTurno;

public class TurnoDTO {
    
    private Long id;
    
    private Long disponibilidadId;
    
    private EstadoTurno estado;
    
    private String motivo;
    
    private String paciente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDisponibilidadId() {
		return disponibilidadId;
	}

	public void setDisponibilidadId(Long disponibilidadId) {
		this.disponibilidadId = disponibilidadId;
	}

	public EstadoTurno getEstado() {
		return estado;
	}

	public void setEstado(EstadoTurno estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

    
}