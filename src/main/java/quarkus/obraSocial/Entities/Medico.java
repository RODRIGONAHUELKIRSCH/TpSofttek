package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
=======
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.ForeignKey;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

@Entity
@Table(name = "Medico")
public class Medico extends PanacheEntity {


<<<<<<< HEAD
    @ManyToOne(targetEntity=Especialidad.class,fetch=FetchType.LAZY)
    private Especialidad especialidad;
    
=======
	
    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private Especialidad especialidad;
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

	@Column(name="nombre",nullable=false)
	private String nombre;

<<<<<<< HEAD
	@Column(name="apellido",unique=true,nullable=false)
=======
	@Column(name="apellido",nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
	private String apellido;
	
	@Column(name="email",unique=true,nullable=false)
	private String email;
	
<<<<<<< HEAD
	@Column(name="password",nullable=false)
=======
	@Column(name="password",unique=true,nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
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