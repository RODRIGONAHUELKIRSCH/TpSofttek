package quarkus.obraSocial.Dtos;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
=======
import quarkus.obraSocial.Enums.EstadoTurno;

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
import quarkus.obraSocial.Enums.EstadoTurno;

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
import quarkus.obraSocial.Enums.EstadoTurno;

>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
import quarkus.obraSocial.Enums.EstadoTurno;

>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
public class TurnoDTO {
    
    private Long id;
    
    private Long disponibilidadId;
    
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    private String estado;
    
    private String motivo;
    
    private PacienteDTO pacientedto;
    
    private DisponibilidadDTO dispdto;
    
    private Long pacienteid;
    
    private String fecha_hora;
    
    private Long idmedico;
    public TurnoDTO() {}
    
    public TurnoDTO(String estado,String motivo,String fecha_hora) {
    	
    	this.estado=estado;
    	this.motivo=motivo;
    	this.fecha_hora=fecha_hora;
    }
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
    private EstadoTurno estado;
    
    private String motivo;
    
    private String paciente;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f

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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	public EstadoTurno getEstado() {
		return estado;
	}

	public void setEstado(EstadoTurno estado) {
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
		this.estado = estado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public PacienteDTO getPacientedto() {
		return pacientedto;
	}

	public void setPacientedto(PacienteDTO pacientedto) {
		this.pacientedto = pacientedto;
	}

	public DisponibilidadDTO getDispdto() {
		return dispdto;
	}

	public void setDispdto(DisponibilidadDTO dispdto) {
		this.dispdto = dispdto;
	}

	public Long getPacienteid() {
		return pacienteid;
	}

	public void setPacienteid(Long pacienteid) {
		this.pacienteid = pacienteid;
	}

	public String getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public Long getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(Long idmedico) {
		this.idmedico = idmedico;
	}
		
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

    
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
}