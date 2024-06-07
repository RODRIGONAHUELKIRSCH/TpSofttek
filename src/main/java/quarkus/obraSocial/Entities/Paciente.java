package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Paciente extends PanacheEntity{


	@Column(name="Nombre",nullable=false)
	String Nombre;
	
	@Column(name="Apellido",nullable=false)
	String Apellido;
	
	@Column(name="Email",unique=true,nullable=false)
	String Email;
	
	@Column(name="Password",unique=true,nullable=false)
	String Password;

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