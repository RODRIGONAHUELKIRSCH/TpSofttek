package quarkus.obraSocial.Services;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import quarkus.obraSocial.Dtos.EspecialidadDTO;
import quarkus.obraSocial.Entities.Especialidad;
import quarkus.obraSocial.Mappers.EspecialidadMapper;
import quarkus.obraSocial.Repositories.EspecialidadRepository;

@ApplicationScoped
public class EspecialidadService {

    @Inject
    EspecialidadRepository especialidadRepository;

    public List<EspecialidadDTO> listarTodas() {
        return especialidadRepository.listAll().stream()
                .map(EspecialidadMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public EspecialidadDTO crearEspecialidad(EspecialidadDTO especialidadDTO) {
        if (especialidadDTO.getAreaEspecialidad() == null || especialidadDTO.getAreaEspecialidad().isEmpty()) {
            throw new IllegalArgumentException("El área de especialidad no puede estar vacía.");
        }
        Especialidad especialidad = EspecialidadMapper.toEspecialidad(especialidadDTO);
        especialidadRepository.persist(especialidad);
        return EspecialidadMapper.toDTO(especialidad);
    }

    public EspecialidadDTO encontrarPorId(Long id) {
        Especialidad especialidad = especialidadRepository.findById(id);
        if (especialidad == null) {
            return null;
        }
        return EspecialidadMapper.toDTO(especialidad);
    }

    @Transactional
    public EspecialidadDTO actualizarEspecialidad(Long id, EspecialidadDTO especialidadDTO) {
        Especialidad especialidad = especialidadRepository.findById(id);
        if (especialidad == null) {
            return null;
        }
        especialidad.setArea_especialidad(especialidadDTO.getAreaEspecialidad());
        return EspecialidadMapper.toDTO(especialidad);
    }

    @Transactional
    public boolean eliminarEspecialidad(Long id) {
        return especialidadRepository.deleteById(id);
    }
}