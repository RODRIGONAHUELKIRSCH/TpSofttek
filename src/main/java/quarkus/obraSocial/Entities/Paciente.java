package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Paciente extends PanacheEntity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idespecialista",unique=true,nullable=false)
	Long idpaciente;
	
	@Column(name="Nombre",nullable=false)
	String Nombre;
	
	@Column(name="Apellido",nullable=false)
	String Apellido;
	
	@Column(name="Email",unique=true,nullable=false)
	String Email;
	
	@Column(name="Password",unique=true,nullable=false)
	String Password;

	public Long getIdpaciente() {
		return idpaciente;
	}

	public void setIdpaciente(Long idpaciente) {
		this.idpaciente = idpaciente;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}