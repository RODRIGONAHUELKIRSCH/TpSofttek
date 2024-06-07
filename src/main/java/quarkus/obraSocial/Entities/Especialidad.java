package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Especialidad extends PanacheEntity{


	
	@Column(name="Area_especialidad",nullable=false)
	private String Area_especialidad;

	public String getArea_especialidad() {
		return Area_especialidad;
	}

	public void setArea_especialidad(String area_especialidad) {
		Area_especialidad = area_especialidad;
	}

	public String getNombre() {
		
		return Area_especialidad;
	}
	
}