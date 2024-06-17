package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
<<<<<<< HEAD
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Disponibilidad;
=======
import jakarta.inject.Inject;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Disponibilidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Services.MedicoService;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

@ApplicationScoped
public class DisponibilidadMapper {

<<<<<<< HEAD


	public DisponibilidadDTO disponibilidadADto(Disponibilidad disponibilidad) {
		DisponibilidadDTO dto = new DisponibilidadDTO();
		dto.setMedicodto(new MedicoDTO(disponibilidad.getMed().getNombre(),disponibilidad.getMed().getApellido(),disponibilidad.getMed().getFoto()));;
		//dto.setMeddto(disponibilidad.getMed());
		//dto.setEspdto(disponibilidad.getMed().getEspecialidad().getArea_especialidad());
		dto.setUbicacion(disponibilidad.getUbicacion());
		dto.setHorariosConsulta(disponibilidad.getHorarios_consulta());
=======
	@Inject
	MedicoMapper medicoMapper;

	@Inject
	MedicoService medicoService;

	public DisponibilidadDTO disponibilidadADto(Disponibilidad disponibilidad) {
		DisponibilidadDTO dto = new DisponibilidadDTO();
		dto.setId(disponibilidad.id);
		dto.setIdMedico(disponibilidad.getMedicoId());
		dto.setFecha(disponibilidad.getFecha());
		dto.setHora(disponibilidad.getHora());
		dto.setUbicacion(disponibilidad.getUbicacion());

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
		return dto;
	}

	public Disponibilidad dtoADisponibilidad(DisponibilidadDTO dto) {
		Disponibilidad disponibilidad = new Disponibilidad();
<<<<<<< HEAD

		disponibilidad.setUbicacion(dto.getUbicacion());
		disponibilidad.setHorarios_consulta(dto.getHorariosConsulta());
		return disponibilidad;
	}

	public DisponibilidadDTO listardispEspecialista(Disponibilidad disp) {
		DisponibilidadDTO dto = new DisponibilidadDTO();
		dto.setMedicodto(new MedicoDTO(disp.getMed().getNombre(),disp.getMed().getApellido(),disp.getMed().getFoto()));;
		//dto.setMeddto(disponibilidad.getMed());
		dto.setAreaEspecialidad(disp.getMed().getEspecialidad().getArea_especialidad());
		dto.setUbicacion(disp.getUbicacion());
		dto.setHorariosConsulta(disp.getHorarios_consulta());
		return dto;
=======
		MedicoDTO medicoDTO = obtenerMedicoDTO(dto.getIdMedico()); // Obtener el MedicoDTO del ID proporcionado
		disponibilidad.setMedicoId(dto.getIdMedico()); // Convertir MedicoDTO a Medico
		disponibilidad.setFecha(dto.getFecha());
		disponibilidad.setHora(dto.getHora());
		disponibilidad.setUbicacion(dto.getUbicacion());
		return disponibilidad;
	}

	private MedicoDTO obtenerMedicoDTO(Long medicoId) {
		// Lógica para obtener el MedicoDTO a partir del ID
		return medicoService.obtenerMedicoDTOPorId(medicoId);
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	}
}
