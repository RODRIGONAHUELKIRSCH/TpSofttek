package quarkus.obraSocial.Controllers;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.GET;
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
	@Operation(summary="Crear un paciente",description="Logica de creado de un paciente")
	@APIResponses(value={
		@APIResponse(responseCode="200",description="Paciente creado"),
		@APIResponse(responseCode="404",description="Not Found")
})
	public Response crearPaciente(PacienteDTO dtopaciente) {
		
		PacienteDTO createPaciente=pservice.crearPaciente(dtopaciente);
		return Response.ok(createPaciente).build();
	}
	
	@GET
    public List<PacienteDTO> listarPacientes(){
    	return pservice.listarPaciente();
    }
}