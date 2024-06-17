package quarkus.obraSocial.Dtos;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisponibilidadDTO {

	private Long id;

	private Long idMedico;
	

	private String ubicacion;
	
	
	private List<String> horariosConsulta=new ArrayList<String>();
	
	private MedicoDTO medicodto;
	
	private String espdto;
	
	private String areaEspecialidad;

	public DisponibilidadDTO() {
	}
	
	public DisponibilidadDTO( String ubicacion) {
		//this.id= id;
		this.ubicacion=ubicacion;

	}

//	public DisponibilidadDTO( String ubicacion,List<String> horarios) {
//		//this.id= id;
//		this.horariosConsulta=horarios;
//		this.ubicacion=ubicacion;
//
//	}

=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import java.time.LocalDate;
import java.time.LocalTime;

public class DisponibilidadDTO {

	private Long id;
	private Long idMedico;
	private String fecha;
	private String hora;
	private String ubicacion;

	public DisponibilidadDTO() {
	}

	public DisponibilidadDTO(Long id, Long idMedico, String fecha, String hora) {
		this.id = id;
		this.idMedico = idMedico;
		this.fecha = fecha;
		this.hora = hora;

	}

<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
<<<<<<< HEAD
<<<<<<< HEAD
	
	public String getUbicacion() {
		return ubicacion;
	}

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
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	}

	public Long getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Long idMedico) {
		this.idMedico = idMedico;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public String getEspdto() {
		return espdto;
	}

	public void setEspdto(String espdto) {
		this.espdto = espdto;
	}

	public String getAreaEspecialidad() {
		return areaEspecialidad;
	}

	public void setAreaEspecialidad(String areaEspecialidad) {
		this.areaEspecialidad = areaEspecialidad;
	}
	
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
}