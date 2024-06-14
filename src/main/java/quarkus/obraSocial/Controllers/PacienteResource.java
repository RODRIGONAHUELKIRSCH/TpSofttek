package quarkus.obraSocial.Controllers;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.PacienteDTO;
import quarkus.obraSocial.Services.PacienteService;

@Path("/paciente")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PacienteResource {

	@Inject
	PacienteService pservice;
	
	@POST
	public Response crearPaciente(PacienteDTO dtopaciente) {
		
		PacienteDTO createPaciente=pservice.crearPaciente(dtopaciente);
		return Response.ok(createPaciente).build();
	}
}