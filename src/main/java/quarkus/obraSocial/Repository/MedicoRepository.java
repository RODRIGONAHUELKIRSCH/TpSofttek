package quarkus.obraSocial.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import quarkus.obraSocial.Entities.Medico;

@ApplicationScoped
public class MedicoRepository implements PanacheRepository<Medico> {

}