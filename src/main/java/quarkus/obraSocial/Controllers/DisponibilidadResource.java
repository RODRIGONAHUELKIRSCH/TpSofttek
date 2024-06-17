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
<<<<<<< HEAD
import quarkus.obraSocial.Dtos.MedicoDTO;
import quarkus.obraSocial.Services.DisponibilidadService;

import java.io.Serializable;
=======
import quarkus.obraSocial.Services.DisponibilidadService;

>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
import java.util.List;

@Path("/disponibilidades")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DisponibilidadResource {

    @Inject
    DisponibilidadService disponibilidadService;

    @POST
    public Response agregarDisponibilidad(DisponibilidadDTO disponibilidadDTO) {
        DisponibilidadDTO creada = disponibilidadService.agregarDisponibilidad(disponibilidadDTO);
        return Response.status(Response.Status.CREATED).entity(creada).build();
    }
<<<<<<< HEAD
    
    @GET
    public List<DisponibilidadDTO> listarDisponibilidad(){
    	return disponibilidadService.listarDisponibilidades();
    }
    
    
    @GET
    @Path("/especialistas")
    public List<DisponibilidadDTO> listarEspecialistas(){
    	return disponibilidadService.listarEspecialista();
    }
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
}