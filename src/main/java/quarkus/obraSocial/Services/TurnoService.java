package quarkus.obraSocial.Services;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;
import java.util.stream.Collectors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import quarkus.obraSocial.Dtos.TurnoDTO;
import quarkus.obraSocial.Entities.Disponibilidad;
import quarkus.obraSocial.Entities.Paciente;
import quarkus.obraSocial.Entities.Turno;
import quarkus.obraSocial.Mappers.TurnoMapper;
import quarkus.obraSocial.Repositories.DisponibilidadRepository;
import quarkus.obraSocial.Repositories.PacienteRepository;
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dtos.TurnoDTO;
import quarkus.obraSocial.Entities.Turno;
import quarkus.obraSocial.Mappers.TurnoMapper;
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import quarkus.obraSocial.Repositories.TurnoRepository;

@ApplicationScoped
public class TurnoService {

<<<<<<< HEAD
<<<<<<< HEAD
    @Inject
    TurnoRepository TurnoRepository;

    @Inject
   DisponibilidadRepository disponibilidadRepository;

    @Inject
   PacienteRepository pacienteRepository;
    
    @Inject
    TurnoMapper TurnoMapper;

    @Transactional
    public TurnoDTO agregarTurno(TurnoDTO turnodto) {
        Turno turno = TurnoMapper.dtoaturno(turnodto);
  	  Disponibilidad disp = disponibilidadRepository.findById(turnodto.getDisponibilidadId());
  	  Paciente paciente= pacienteRepository.findById(turnodto.getPacienteid());
       if (disp == null) {
           throw new IllegalArgumentException("Especialidad no encontrada con el id: " + turno.getDisponibilidad().id);
       }
       turno.setDisponibilidad(disp);;
       turno.setPaciente(paciente);
        TurnoRepository.persist(turno);
        return TurnoMapper.turnoDTO(turno);
    }
    @Transactional
    public List<TurnoDTO> listarTurnos() {
        List<Turno> turnos = TurnoRepository.listAll();
        return turnos.stream().map(TurnoMapper::turnoDTO).collect(Collectors.toList());
    }
    
    @Transactional
    public TurnoDTO updateturno(Long id, TurnoDTO turnodto) {
        Turno turno = TurnoRepository.findById(id);
        if (turno == null) {
            throw new WebApplicationException("Turno not found", 404);
        }
        turno.setMotivo(turnodto.getMotivo());
        turno.setFecha_hora(turnodto.getFecha_hora());
        turno.setIdmedico(turnodto.getIdmedico());
        return TurnoMapper.turnoDTO(turno);
    }
    @Transactional
    public void deleteturno(Long id) {
        Turno turno = TurnoRepository.findById(id);
        TurnoRepository.delete(turno);
    }
	
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
}