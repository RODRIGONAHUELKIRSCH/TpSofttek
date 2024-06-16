package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Turno")
public class Turno extends PanacheEntity {
    
    @ManyToOne(targetEntity=Disponibilidad.class,fetch=FetchType.LAZY)
    private Disponibilidad disponibilidad;
    
    @Column(name="estado_turno")
    private String estado;

    @Column(name = "motivo")
    private String motivo;

    @OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_paciente",referencedColumnName="id")
    private Paciente paciente;

    @Column(name="fecha_hora")
    private String fecha_hora;

    public Disponibilidad getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(Disponibilidad disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	
}