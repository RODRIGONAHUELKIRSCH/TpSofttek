package quarkus.obraSocial.Mappers;

import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dtos.PacienteDTO;
import quarkus.obraSocial.Entities.Paciente;

@ApplicationScoped
public class PacienteMapper {

	public Paciente PacienteConverter(PacienteDTO dtopaciente) {
		
		Paciente paciente= new Paciente();
		paciente.setNombre(dtopaciente.getNombre());
		paciente.setApellido(dtopaciente.getApellido());
		paciente.setEmail(dtopaciente.getEmail());
		paciente.setPassword(dtopaciente.getPassword());
		return paciente;
	}
	
	public PacienteDTO DtoConverter(Paciente paciente) {
		PacienteDTO dtopaciente=new PacienteDTO();
		dtopaciente.setNombre(paciente.getNombre());
		dtopaciente.setApellido(paciente.getApellido());
<<<<<<< HEAD
<<<<<<< HEAD
=======
		dtopaciente.setEmail(paciente.getEmail());
		dtopaciente.setPassword(paciente.getPassword());
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
		dtopaciente.setEmail(paciente.getEmail());
		dtopaciente.setPassword(paciente.getPassword());
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
		return dtopaciente;
	}
	
	
}