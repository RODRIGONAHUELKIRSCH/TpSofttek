package quarkus.obraSocial.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dtos.PacienteDTO;
import quarkus.obraSocial.Entities.Paciente;
import quarkus.obraSocial.Mappers.PacienteMapper;
import quarkus.obraSocial.Repositories.PacienteRepository;

@ApplicationScoped
public class PacienteService {

	@Inject
	PacienteRepository pacienterepository;
	
	@Inject
	PacienteMapper pacienteMapper;

	@Transactional
	public PacienteDTO crearPaciente(PacienteDTO dtopaciente) {

			Paciente paciente=pacienteMapper.PacienteConverter(dtopaciente);	
			pacienterepository.persist(paciente);
			return pacienteMapper.DtoConverter(paciente);
			
	}
	@Transactional
    public List<PacienteDTO> listarPaciente() {
        List<Paciente> pacientes = pacienterepository.listAll();
        return pacientes.stream().map(pacienteMapper::DtoConverter).collect(Collectors.toList());
    }
	
}