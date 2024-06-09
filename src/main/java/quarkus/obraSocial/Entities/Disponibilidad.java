package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Disponibilidad")
public class Disponibilidad extends PanacheEntity {

	Long iddisponibilidad;

	@Column(name="idmedico",nullable=false)
	Long idmedico;

	@Column(name="Fecha",nullable=false)
	String Fecha;

	@Column(name="Ubicacion",nullable=false)
	String Ubicacion;


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