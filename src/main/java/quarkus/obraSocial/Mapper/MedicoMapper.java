package quarkus.obraSocial.Mapper;

import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dto.EspecialidadDTO;
import quarkus.obraSocial.Dto.MedicoDTO;
import quarkus.obraSocial.Entities.Medico;

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
    	
        MedicoDTO medicoDTO = new MedicoDTO();
        medicoDTO.setNombre(medico.getNombre());
        medicoDTO.setApellido(medico.getApellido());
        medicoDTO.setFoto(medico.getFoto());
        medicoDTO.setEspecialidadDto(new EspecialidadDTO(medico.getEspecialidad().id, medico.getEspecialidad().getArea_especialidad()));
        
        return medicoDTO;
    }
	
}