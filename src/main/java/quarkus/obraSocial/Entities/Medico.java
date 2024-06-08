package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;

@Entity
@Table(name = "Medico")
public class Medico extends PanacheEntity {


	
    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false, foreignKey = @ForeignKey(name = "FK_medico_especialidad"))
    private Especialidad especialidad;

	@Column(name="nombre",nullable=false)
	private String nombre;

	@Column(name="apellido",nullable=false)
	private String apellido;
	
	@Column(name="email",unique=true,nullable=false)
	private String email;
	
	@Column(name="password",unique=true,nullable=false)
	private String password;
	
	@Column(name="foto",unique=true,nullable=false)
	private String foto;
	

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
    public String getFoto() {
        return foto;
    }
    
	
	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}


}