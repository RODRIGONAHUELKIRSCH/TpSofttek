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
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f

@Entity
@Table(name = "Medico")
public class Medico extends PanacheEntity {


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @ManyToOne(targetEntity=Especialidad.class,fetch=FetchType.LAZY)
    private Especialidad especialidad;
    
=======
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	
    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private Especialidad especialidad;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f

	@Column(name="nombre",nullable=false)
	private String nombre;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	@Column(name="apellido",unique=true,nullable=false)
=======
	@Column(name="apellido",nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	@Column(name="apellido",nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	@Column(name="apellido",nullable=false)
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
	@Column(name="apellido",nullable=false)
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
	private String apellido;
	
	@Column(name="email",unique=true,nullable=false)
	private String email;
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	@Column(name="password",nullable=false)
=======
	@Column(name="password",unique=true,nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	@Column(name="password",unique=true,nullable=false)
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
=======
	@Column(name="password",unique=true,nullable=false)
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
=======
	@Column(name="password",unique=true,nullable=false)
>>>>>>> 63df494002b2c44068077cd3659424af1e7a708f
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