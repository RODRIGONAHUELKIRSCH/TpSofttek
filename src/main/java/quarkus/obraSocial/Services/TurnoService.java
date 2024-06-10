package quarkus.obraSocial.Services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dtos.TurnoDTO;
import quarkus.obraSocial.Entities.Especialidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Entities.Turno;
import quarkus.obraSocial.Mappers.MedicoMapper;
import quarkus.obraSocial.Mappers.TurnoMapper;
import quarkus.obraSocial.Repositories.EspecialidadRepository;
import quarkus.obraSocial.Repositories.MedicoRepository;
import quarkus.obraSocial.Repositories.TurnoRepository;

@ApplicationScoped
public class TurnoService {

    @Inject
    TurnoRepository turnoRepository;
    
    @Inject
    TurnoMapper turnoMapper;
    
    @Transactional
    public TurnoDTO agregarTurno(TurnoDTO turnoDTO) {

  // Convertir turnoDTO a turno
	Turno turno = turnoMapper.turnoConverter(turnoDTO);


  // Persistir el turno en la bd
	turnoRepository.persist(turno);

  // Convertir turno a turnoDTO y return
  return turnoMapper.convertirDto(turno);
    }
}