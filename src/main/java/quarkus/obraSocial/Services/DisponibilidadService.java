package quarkus.obraSocial.Services;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dtos.DisponibilidadDTO;
import quarkus.obraSocial.Entities.Disponibilidad;
import quarkus.obraSocial.Entities.Medico;
import quarkus.obraSocial.Mappers.DisponibilidadMapper;
import quarkus.obraSocial.Mappers.MedicoMapper;
import quarkus.obraSocial.Repositories.DisponibilidadRepository;
import quarkus.obraSocial.Repositories.MedicoRepository;

@ApplicationScoped
public class DisponibilidadService {

    @Inject
    DisponibilidadRepository disponibilidadRepository;

    @Inject
    MedicoRepository medicoRepository;

    @Inject
    DisponibilidadMapper disponibilidadMapper;

    @Transactional
    public DisponibilidadDTO agregarDisponibilidad(DisponibilidadDTO disponibilidadDTO) {
        Disponibilidad disponibilidad = disponibilidadMapper.dtoADisponibilidad(disponibilidadDTO);
        disponibilidadRepository.persist(disponibilidad);
        return disponibilidadMapper.disponibilidadADto(disponibilidad);
    }
}
