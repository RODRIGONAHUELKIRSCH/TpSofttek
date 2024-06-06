package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turno extends PanacheEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idTurno",unique=true,nullable=false)
	Long idTurno;
	
	@Column(name="idpaciente",nullable=false)
	Long idpaciente;
	
	@Column(name="idmedico",nullable=false)
	Long idmedico;
	
	@Column(name="horarios",nullable=false)
	String horarios;
	
	@Column(name="motivo",nullable=false)
	String motivo;
	
	
	public enum estado{
		Disponible,Reservado
	}


	public Long getIdTurno() {
		return idTurno;
	}


	public void setIdTurno(Long idTurno) {
		this.idTurno = idTurno;
	}


	public Long getIdpaciente() {
		return idpaciente;
	}


	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}


	public Long getIdmedico() {
		return idmedico;
	}


	public void setIdmedico(Long idmedico) {
		this.idmedico = idmedico;
	}


	public String getHorarios() {
		return horarios;
	}


	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}