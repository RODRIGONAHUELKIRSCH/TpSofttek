package quarkus.obraSocial.Dtos;

import quarkus.obraSocial.Entities.Paciente;


public class TurnoDTO {
    
    private Long id;
    
    private Long disponibilidadId;
    
    private String estado;
    
    private String motivo;
    
    private Long idpaciente;
    
    private DisponibilidadDTO dispDTO;
    
    private PacienteDTO pacienteDTO;

	public DisponibilidadDTO getDispDTO() {
		return dispDTO;
	}

	public void setDispDto(DisponibilidadDTO dispDTO) {
		this.dispDTO = dispDTO;
	}

	public Long getId() {
		return id;
	}

	public PacienteDTO getPacienteDTO() {
		return pacienteDTO;
	}

	public void setPacienteDTO(PacienteDTO pacienteDTO) {
		this.pacienteDTO = pacienteDTO;
	}

	public void setDispDTO(DisponibilidadDTO dispDTO) {
		this.dispDTO = dispDTO;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}

}