package quarkus.obraSocial.Repositories;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Entities.Disponibilidad;

@ApplicationScoped
public class DisponibilidadRepository implements PanacheRepository<Disponibilidad> {

}