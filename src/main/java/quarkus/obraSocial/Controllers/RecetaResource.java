package quarkus.obraSocial.Controllers;

import java.util.List;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.RecetaDTO;
import quarkus.obraSocial.Services.RecetaService;

@Path("/recetas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecetaResource {

	@Inject
    RecetaService recetaService;

    @POST
    public Response agregarTurno(RecetaDTO recetadto) {
        RecetaDTO creada = recetaService.agregarReceta(recetadto);
        return Response.status(Response.Status.CREATED).entity(creada).build();
    }
    
    @GET
    public List<RecetaDTO> listarReceta(){
    	return recetaService.listarRecetas();
    }
	
}