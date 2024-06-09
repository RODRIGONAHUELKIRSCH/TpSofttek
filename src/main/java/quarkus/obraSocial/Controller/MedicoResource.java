package quarkus.obraSocial.Controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dto.MedicoDTO;
import quarkus.obraSocial.Services.MedicoService;

//ESTA SERIA LA CAPA QUE DIRECCIONA LAS PETICIONES A EL SERVICIO

@Path("/medicos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MedicoResource {

    @Inject
    MedicoService medicoService;

    @POST
    public Response crearMedico(MedicoDTO medicoDTO) {
    	
        MedicoDTO creado = medicoService.crearMedico(medicoDTO);
        return Response.ok(creado).build();
    }
}