package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import quarkus.obraSocial.Enums.EstadoTurno;

@Entity
@Table(name = "Turno")
public class Turno extends PanacheEntity {
    
	@PrimaryKeyJoinColumn
    private Long disponibilidad;
    
    @NotNull
   // @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "motivo")
    private String motivo;

    @PrimaryKeyJoinColumn
    private Long idpaciente;
    
    
    private Disponibilidad disp;
    
    private Paciente paciente;



	public Turno() {}
    
    public Turno(Long disponibilidad,String estado,String motivo,Long idpaciente) {
    	
    	this.disponibilidad=disponibilidad;
    	this.estado=estado;
    	this.motivo=motivo;
    	this.idpaciente=idpaciente;
    }

    

	public Long getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Long disponibilidad) {
		this.disponibilidad = disponibilidad;
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
    
    public Disponibilidad getDisp() {
		return disp;
	}

	public void setDisp(Disponibilidad disp) {
		this.disp = disp;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}