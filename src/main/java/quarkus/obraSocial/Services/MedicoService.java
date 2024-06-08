package quarkus.obraSocial.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Especialidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Mappers.MedicoMapper;
import quarkus.obraSocial.Repositories.EspecialidadRepository;
import quarkus.obraSocial.Repositories.MedicoRepository;

@ApplicationScoped
public class MedicoService {

    @Inject
    MedicoRepository medicoRepository;
    
    @Inject
    MedicoMapper medicoMapper;
    
    @Inject
    EspecialidadRepository especialidadRepository;

    @Transactional 
    public MedicoDTO crearMedico(MedicoDTO medicoDTO) {
    	  if (medicoDTO.getApellido() == null || medicoDTO.getApellido().isEmpty()) {
    	        throw new IllegalArgumentException("El apellido del médico es obligatorio.");
    	    }

        // Convertir MedicoDTO a Medico
    	Medico medico = medicoMapper.medicoConverter(medicoDTO);
    	
        // Buscar la especialidad por su id
    	
    	   Especialidad especialidad = especialidadRepository.findById(medicoDTO.getIdEspecialidad());
           if (especialidad == null) {
               throw new IllegalArgumentException("Especialidad no encontrada con el id: " + medicoDTO.getIdEspecialidad());
           }
           medico.setEspecialidad(especialidad);

        // Persistir el medico en la bd
        medicoRepository.persist(medico);

        // Convertir medico a MedicoDTO y return
        return medicoMapper.convertirDto(medico);
    }
}
