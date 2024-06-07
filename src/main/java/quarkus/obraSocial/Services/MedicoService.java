package quarkus.obraSocial.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
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
    EspecialidadRepository especialidadRepository;

    @Inject
    MedicoMapper medicoMapper;

    @Transactional
    public MedicoDTO crearMedico(MedicoDTO medicoDTO) {
    	 Medico medico = medicoMapper.medicoConverter(medicoDTO);
    	 
    	Especialidad especialidad = especialidadRepository.findById(medicoDTO.getIdEspecialidad());
        if (especialidad == null) {
           
            throw new RuntimeException("La especialidad con ID " + medicoDTO.getIdEspecialidad() + " no existe.");
        }
    	
        // Convertir MedicoDTO a Medico
       

        // Persistir el medico en la base de datos
        medicoRepository.persist(medico);

        // Convertir medico a MedicoDTO y retornar
        return medicoMapper.dtoConverter(medico);
    }
}
