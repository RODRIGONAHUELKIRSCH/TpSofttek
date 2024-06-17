package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
=======
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
=======
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import quarkus.obraSocial.Enums.EstadoTurno;
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

@Entity
@Table(name = "Turno")
public class Turno extends PanacheEntity {
    
<<<<<<< HEAD
<<<<<<< HEAD
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
    
    @Column(name="idmedico")
    private Long idmedico;

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

	public Long getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(Long idmedico) {
		this.idmedico = idmedico;
	}
	
=======
    @ManyToOne
    @JoinColumn(name = "disponibilidad_id", nullable = false)
    private Disponibilidad disponibilidad;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTurno estado;

    @Column(name = "motivo")
    private String motivo;

=======
    @ManyToOne
    @JoinColumn(name = "disponibilidad_id", nullable = false)
    private Disponibilidad disponibilidad;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTurno estado;

    @Column(name = "motivo")
    private String motivo;

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
    @Column(name = "paciente")
    private String paciente;

    
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
}