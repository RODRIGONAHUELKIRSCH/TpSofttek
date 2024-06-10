package quarkus.obraSocial.Entities;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Disponibilidad")
public class Disponibilidad extends PanacheEntity{

	 @Column(name = "medico_id", nullable = false)
	    private Long medicoId;

	    @Column(name = "fecha", nullable = false)
	    private String fecha;

	    @Column(name = "hora_inicio", nullable = false)
	    private String horaInicio;

	    @Column(name = "hora_fin", nullable = false)
	    private String horaFin;
	    
	    @Column(name="ubicacion",nullable=false)
	    private String ubicacion;

	    // Getters y setters

		public Long getMedicoId() {
	        return medicoId;
	    }

	    public void setMedicoId(Long medicoId) {
	        this.medicoId = medicoId;
	    }

	    public String getFecha() {
	        return fecha;
	    }

	    public void setFecha(String fecha) {
	        this.fecha = fecha;
	    }

	    public String getHoraInicio() {
	        return horaInicio;
	    }

	    public void setHoraInicio(String horaInicio) {
	        this.horaInicio = horaInicio;
	    }

	    public String getHoraFin() {
	        return horaFin;
	    }

	    public void setHoraFin(String horaFin) {
	        this.horaFin = horaFin;
	    }
	    public String getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(String ubicacion) {
			this.ubicacion = ubicacion;
		}
	}