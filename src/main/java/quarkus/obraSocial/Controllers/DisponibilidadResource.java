package quarkus.obraSocial.Controllers;


import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Services.DisponibilidadService;

import java.io.Serializable;
import java.util.List;

@Path("/disponibilidades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DisponibilidadResource implements Serializable{

    @Inject
    DisponibilidadService disponibilidadService;

    @POST
    public Response agregarDisponibilidad(DisponibilidadDTO disponibilidadDTO) {
        DisponibilidadDTO creada = disponibilidadService.agregarDisponibilidad(disponibilidadDTO);
        return Response.status(Response.Status.CREATED).entity(creada).build();
    }
    
    @GET
    public List<DisponibilidadDTO> listarDisponibilidad(){
    	return disponibilidadService.listarDisponibilidades();
    }
}