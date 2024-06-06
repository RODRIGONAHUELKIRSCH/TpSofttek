package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Especialidad extends PanacheEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idespecialidad",unique=true,nullable=false)
	Long idespecialidad;
	
	@Column(name="Area_especialidad",nullable=false)
	String Area_especialidad;

	public Long getIdespecialidad() {
		return idespecialidad;
	}

	public void setIdespecialidad(Long idespecialidad) {
		this.idespecialidad = idespecialidad;
	}

	public String getArea_especialidad() {
		return Area_especialidad;
	}

	public void setArea_especialidad(String area_especialidad) {
		Area_especialidad = area_especialidad;
	}
	
}