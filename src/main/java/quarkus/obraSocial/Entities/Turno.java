package quarkus.obraSocial.Entities;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import quarkus.obraSocial.Enums.EstadoTurno;


@Entity
@Table(name = "Turno")
public class Turno extends PanacheEntity {
    
    @ManyToOne(targetEntity=Disponibilidad.class,fetch=FetchType.LAZY)
    private Disponibilidad disponibilidad;
    
    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "estado", nullable = false)
    private EstadoTurno estado;

    @Column(name = "motivo")
    private String motivo;

    @Column(name = "paciente")
    private String paciente;

    
}