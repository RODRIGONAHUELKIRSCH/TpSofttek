package quarkus.obraSocial.Mapper;

import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dto.DtoPaciente;
import quarkus.obraSocial.Entities.Paciente;

@ApplicationScoped
public class PacienteMapper {

	public Paciente PacienteConverter(DtoPaciente dtopaciente) {
		
		Paciente paciente= new Paciente();
		paciente.setNombre(dtopaciente.getNombre());
		paciente.setApellido(dtopaciente.getApellido());
		paciente.setEmail(dtopaciente.getEmail());
		paciente.setPassword(dtopaciente.getPassword());
		return paciente;
	}
	
	public DtoPaciente DtoConverter(Paciente paciente) {
		DtoPaciente dtopaciente=new DtoPaciente();
		dtopaciente.setNombre(paciente.getNombre());
		dtopaciente.setApellido(paciente.getApellido());
		dtopaciente.setEmail(paciente.getEmail());
		dtopaciente.setPassword(paciente.getPassword());
		return dtopaciente;
	}
	
	
}