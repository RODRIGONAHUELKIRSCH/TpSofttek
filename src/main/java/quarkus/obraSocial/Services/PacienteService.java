package quarkus.obraSocial.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dto.DtoPaciente;
import quarkus.obraSocial.Entities.Paciente;
import quarkus.obraSocial.Mapper.PacienteMapper;
import quarkus.obraSocial.Repository.PacienteRepository;

@ApplicationScoped
public class PacienteService {

	@Inject
	PacienteRepository pacienterepository;
	
	@Inject
	PacienteMapper pacienteMapper;

	@Transactional
	public DtoPaciente crearPaciente(DtoPaciente dtopaciente) {

			Paciente paciente=pacienteMapper.PacienteConverter(dtopaciente);	
			pacienterepository.persist(paciente);
			return pacienteMapper.DtoConverter(paciente);
			
		
	}
	
}