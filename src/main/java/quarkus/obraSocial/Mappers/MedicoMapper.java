package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Entities.Especialidad;
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
	    medico.setIdEspecialidad(medicoDTO.getIdEspecialidad());
	    return medico;
	}
	
	//ACA HACEMOS LO MISMO Q EN EL MEDICOCONVERTER PERO AL REVES

	public MedicoDTO dtoConverter(Medico medico) {
		
	    MedicoDTO medicoDTO = new MedicoDTO();
	    medicoDTO.setNombre(medico.getNombre());
	    medicoDTO.setApellido(medico.getApellido());
	    medicoDTO.setEmail(medico.getEmail());
	    medicoDTO.setPassword(medico.getPassword());
	    medicoDTO.setFoto(medico.getFoto());
	    medicoDTO.setIdEspecialidad(medico.getIdEspecialidad());
	    return medicoDTO;
	}
}
