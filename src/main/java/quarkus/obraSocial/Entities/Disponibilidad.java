package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Disponibilidad extends PanacheEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iddisponibilidad",unique=true,nullable=false)
	Long iddisponibilidad;
	
	@Column(name="idmedico",nullable=false)
	Long idmedico;
	
	@Column(name="Fecha",nullable=false)
	String Fecha;
	
	@Column(name="Ubicacion",nullable=false)
	String Ubicacion;

	public Long getIddisponibilidad() {
		return iddisponibilidad;
	}

	public void setIddisponibilidad(Long iddisponibilidad) {
		this.iddisponibilidad = iddisponibilidad;
	}

	public Long getIdmedico() {
		return idmedico;
	}

	public void setIdmedico(Long idmedico) {
		this.idmedico = idmedico;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}
	
}