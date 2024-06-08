package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Especialidad")
public class Especialidad extends PanacheEntity{


	
	@Column(name="area_especialidad",nullable=false)
	private String area_especialidad;

	public String getArea_especialidad() {
		return area_especialidad;
	}

	public void setArea_especialidad(String area_especialidad) {
		this.area_especialidad = area_especialidad;
	}

	
}