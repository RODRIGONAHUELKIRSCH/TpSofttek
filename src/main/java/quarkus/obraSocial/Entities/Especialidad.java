package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.Table;
=======
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f

@Entity
@Table(name = "Especialidad")
public class Especialidad extends PanacheEntity{

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======

>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	
	@Column(name="area_especialidad",nullable=false)
	private String area_especialidad;

	public String getArea_especialidad() {
		return area_especialidad;
	}

	public void setArea_especialidad(String area_especialidad) {
		this.area_especialidad = area_especialidad;
	}

	
}