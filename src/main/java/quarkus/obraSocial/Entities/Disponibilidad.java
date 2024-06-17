package quarkus.obraSocial.Entities;

import java.util.ArrayList;
import java.util.List;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
import jakarta.persistence.Table;

@Entity
@Table(name = "Disponibilidad")
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class Disponibilidad extends PanacheEntity  {

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_medico",referencedColumnName="id")
	private Medico med;
	
	
	@Column(name="Horarios",nullable=false)
	private List<String> horarios_consulta=new ArrayList<String>();


	@Column(name = "ubicacion", nullable = false)
	private String ubicacion;

	// Getters y setters
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
public class Disponibilidad extends PanacheEntity {

	@Column(name = "medico_id", nullable = false)
	private Long medicoId;

	@Column(name = "fecha", nullable = false)
	private String fecha;

	@Column(name = "hora", nullable = false)
	private String hora;

	@Column(name = "ubicacion", nullable = false)
	private String ubicacion;

	// Getters y setters

	public Long getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(Long medicoId) {
		this.medicoId = medicoId;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
<<<<<<< HEAD
<<<<<<< HEAD
	}
<<<<<<< HEAD
	
	public List<String> getHorarios_consulta() {
		return horarios_consulta;
	}

	public void setHorarios_consulta(List<String> horarios_consulta) {
		this.horarios_consulta = horarios_consulta;
	}
	
	public Medico getMed() {
		return med;
	}

	public void setMed(Medico med) {
		this.med = med;
	}

=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	}
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	}
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
}