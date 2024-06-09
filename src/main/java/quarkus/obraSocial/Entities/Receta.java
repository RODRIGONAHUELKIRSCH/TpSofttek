package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Receta")
public class Receta extends PanacheEntity{

	Long idReceta;

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