package quarkus.obraSocial.Dtos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import quarkus.obraSocial.Entities.Medico;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisponibilidadDTO {

	private Long id;

	private Long idMedico;
	

	private String ubicacion;
	
	
	private List<String> horariosConsulta=new ArrayList<String>();
	
	private MedicoDTO medicodto;

	public DisponibilidadDTO() {
	}

	public DisponibilidadDTO(Long id, String ubicacion,List<String> horarios) {
		this.id= id;
		this.horariosConsulta=horarios;
		this.ubicacion=ubicacion;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public Long getIdMedico() {
//		return idMedico;
//	}
//
//	public void setIdMedico(Long idMedico) {
//		this.idMedico = idMedico;
//	}
	
	
	public String getUbicacion() {
		return ubicacion;
	}

//	public Medico getIdMedico() {
//		return idMedico;
//	}
//
//	public void setIdMedico(Medico idMedico) {
//		this.idMedico = idMedico;
//	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public List<String> getHorariosConsulta() {
		return horariosConsulta;
	}

	public void setHorariosConsulta(List<String> horariosConsulta) {
		this.horariosConsulta = horariosConsulta;
	}

	public MedicoDTO getMedicodto() {
		return medicodto;
	}

	public void setMedicodto(MedicoDTO medicodto) {
		this.medicodto = medicodto;
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}



}