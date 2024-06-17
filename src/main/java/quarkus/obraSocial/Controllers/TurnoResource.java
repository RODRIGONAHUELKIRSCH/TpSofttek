package quarkus.obraSocial.Controllers;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Dtos.TurnoDTO;
import quarkus.obraSocial.Services.DisponibilidadService;
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import quarkus.obraSocial.Dtos.TurnoDTO;
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
import quarkus.obraSocial.Services.TurnoService;

@Path("/turnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TurnoResource {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	@Inject
    TurnoService turnoService;

    @POST
    public Response agregarTurno(TurnoDTO turnodto) {
        TurnoDTO creada = turnoService.agregarTurno(turnodto);
        return Response.status(Response.Status.CREATED).entity(creada).build();
    }
    
    @GET
    public List<TurnoDTO> listarTurno(){
    	return turnoService.listarTurnos();
    }
    
    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateTurno(@PathParam("id") Long id, TurnoDTO turnoDTO) {
        TurnoDTO updated = turnoService.updateturno(id, turnoDTO);
        return Response.ok(updated).build();
    }
    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteTurno(@PathParam("id") Long id) {
        turnoService.deleteturno(id);
        return Response.noContent().build();
    }
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f

}