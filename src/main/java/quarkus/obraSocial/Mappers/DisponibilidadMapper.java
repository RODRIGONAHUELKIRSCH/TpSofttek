package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Disponibilidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Services.MedicoService;

@ApplicationScoped
public class DisponibilidadMapper {



	public DisponibilidadDTO disponibilidadADto(Disponibilidad disponibilidad) {
		DisponibilidadDTO dto = new DisponibilidadDTO();
		dto.setIdMedico(disponibilidad.getMed().id);
		dto.setMedicodto(new MedicoDTO(disponibilidad.getMed().getNombre(),disponibilidad.getMed().getApellido(),disponibilidad.getMed().getFoto()));;
		//dto.setMeddto(disponibilidad.getMed());
		dto.setUbicacion(disponibilidad.getUbicacion());
		dto.setHorariosConsulta(disponibilidad.getHorarios_consulta());
		return dto;
	}

	public Disponibilidad dtoADisponibilidad(DisponibilidadDTO dto) {
		Disponibilidad disponibilidad = new Disponibilidad();

		disponibilidad.setUbicacion(dto.getUbicacion());
		disponibilidad.setHorarios_consulta(dto.getHorariosConsulta());
		return disponibilidad;
	}


}
