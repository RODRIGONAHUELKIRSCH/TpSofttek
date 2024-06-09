package quarkus.obraSocial.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Entities.Especialidad;

@ApplicationScoped
public class EspecialidadRepository implements PanacheRepository<Especialidad> {
   
}