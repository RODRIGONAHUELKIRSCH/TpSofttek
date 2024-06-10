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

    @Inject
    MedicoMapper medicoMapper;
    
    @Inject
    MedicoService medicoService;
    
    public DisponibilidadDTO disponibilidadADto(Disponibilidad disponibilidad) {
        DisponibilidadDTO dto = new DisponibilidadDTO();
        dto.setId(disponibilidad.id);
        dto.setIdMedico(disponibilidad.getMedicoId());
        dto.setFecha(disponibilidad.getFecha());
        dto.setHoraInicio(disponibilidad.getHoraInicio());
        dto.setHoraFin(disponibilidad.getHoraFin());
        dto.setUbicacion(disponibilidad.getUbicacion());
       
        return dto;
    }

    public Disponibilidad dtoADisponibilidad(DisponibilidadDTO dto) {
        Disponibilidad disponibilidad = new Disponibilidad();
        MedicoDTO medicoDTO = obtenerMedicoDTO(dto.getIdMedico()); // Obtener el MedicoDTO del ID proporcionado
        disponibilidad.setMedicoId(dto.getIdMedico());  // Convertir MedicoDTO a Medico
        disponibilidad.setFecha(dto.getFecha());
        disponibilidad.setHoraInicio(dto.getHoraInicio());
        disponibilidad.setHoraFin(dto.getHoraFin());
        disponibilidad.setUbicacion(dto.getUbicacion());
        return disponibilidad;
    }
    
    private MedicoDTO obtenerMedicoDTO(Long medicoId) {
        // Lógica para obtener el MedicoDTO a partir del ID
        // Esto puede implicar una llamada a la base de datos o a algún servicio
        // En este ejemplo, supondremos que ya tienes una forma de obtener el MedicoDTO
        // Solo como ejemplo, podrías tener un método en MedicoService que te permita obtener un MedicoDTO por su ID
        return medicoService.obtenerMedicoDTOPorId(medicoId);
    }
}