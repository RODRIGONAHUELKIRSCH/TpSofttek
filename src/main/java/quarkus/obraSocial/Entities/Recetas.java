package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Recetas extends PanacheEntity{


	
	@Column(name="idturno",nullable=false)
	Long idturno;
	
	@Column(name="fecha_hora",nullable=false)
	String fecha_hora;

	public Long getIdturno() {
		return idturno;
	}

	public void setIdturno(Long idturno) {
		this.idturno = idturno;
	}

	public String getFecha_hora() {
		return fecha_hora;
	}

	public void setFecha_hora(String fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	
	
}