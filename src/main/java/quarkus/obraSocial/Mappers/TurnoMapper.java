package quarkus.obraSocial.Mappers;


import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.PacienteDTO;
import quarkus.obraSocial.Dtos.TurnoDTO;
import quarkus.obraSocial.Entities.Turno;

@ApplicationScoped
public class TurnoMapper {

	public Turno turnoConverter(TurnoDTO turnoDTO) {
		//Convertimos el dto a la entidad

		Turno turno=new Turno();
		turno.setDisponibilidad(turnoDTO.getDisponibilidadId());
		turno.setEstado(turnoDTO.getEstado());
		turno.setMotivo(turnoDTO.getMotivo());
		turno.setIdpaciente(turnoDTO.getIdpaciente());

		return turno;
	}
	
    public TurnoDTO convertirDto(Turno turno) {
    	
    	TurnoDTO turnoDTO=new TurnoDTO();
    	turnoDTO.setDisponibilidadId(turno.getDisponibilidad());
    	turnoDTO.setEstado(turno.getEstado());
    	turnoDTO.setMotivo(turno.getMotivo());
    	turnoDTO.setIdpaciente(turno.getIdpaciente());
    	turnoDTO.setDispDTO(new DisponibilidadDTO(  turno.getDisp().id,turno.getDisp().getMedicoId(),turno.getDisp().getFecha(), turno.getDisp().getHoraInicio(),turno.getDisp().getHoraFin(),turno.getDisp().getUbicacion()));
    	turnoDTO.setPacienteDTO(new PacienteDTO(turno.getPaciente().getNombre(),turno.getPaciente().getApellido(),turno.getPaciente().getEmail(),turno.getPaciente().getPassword()));
    	return turnoDTO;

    }
    
}