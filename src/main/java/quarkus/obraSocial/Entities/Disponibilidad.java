package quarkus.obraSocial.Entities;

import java.util.ArrayList;
import java.util.List;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Disponibilidad")
public class Disponibilidad extends PanacheEntity  {

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_medico",referencedColumnName="id")
	private Medico med;
	
	
	@Column(name="Horarios",nullable=false)
	private List<String> horarios_consulta=new ArrayList<String>();


	@Column(name = "ubicacion", nullable = false)
	private String ubicacion;

	// Getters y setters

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
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

}