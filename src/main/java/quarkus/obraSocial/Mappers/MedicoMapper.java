package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
<<<<<<< HEAD
<<<<<<< HEAD
import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Medico;
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import jakarta.inject.Inject;
import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Especialidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Repositories.EspecialidadRepository;
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

@ApplicationScoped
public class MedicoMapper {
	
	
	public Medico medicoConverter(MedicoDTO medicoDTO) {
		
		
		
		//Convertimos el dto a la entidad
	    Medico medico = new Medico();
	    medico.setNombre(medicoDTO.getNombre());
	    medico.setApellido(medicoDTO.getApellido());
	    medico.setEmail(medicoDTO.getEmail());
	    medico.setPassword(medicoDTO.getPassword());
	    medico.setFoto(medicoDTO.getFoto());
	    

	    return medico;
	}
	
    public MedicoDTO convertirDto(Medico medico) {
    	
<<<<<<< HEAD
<<<<<<< HEAD
        MedicoDTO medicoDTO = new MedicoDTO(); 
        medicoDTO.setNombre(medico.getNombre());
        medicoDTO.setApellido(medico.getApellido());
        medicoDTO.setFoto(medico.getFoto());
        medicoDTO.setEspecialidadDto(new EspecialidadDTO(medico.getEspecialidad().getArea_especialidad()));
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setIdMedico(medico.id);
        medicoDTO.setNombre(medico.getNombre());
        medicoDTO.setApellido(medico.getApellido());
        medicoDTO.setFoto(medico.getFoto());
        medicoDTO.setEspecialidadDto(new EspecialidadDTO(medico.getEspecialidad().id, medico.getEspecialidad().getArea_especialidad()));
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
        
        return medicoDTO;
    }
	
}
