package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
public class Especialidad extends PanacheEntity{


	Long idespecialidad;
	
	@Column(name="Area_especialidad",nullable=false)
	String Area_especialidad;

	public String getArea_especialidad() {
		return Area_especialidad;
	}

	public void setArea_especialidad(String area_especialidad) {
		Area_especialidad = area_especialidad;
	}
	
}