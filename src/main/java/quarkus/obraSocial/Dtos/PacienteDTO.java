package quarkus.obraSocial.Dtos;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de
public class PacienteDTO {


	String Nombre;
	
	String Apellido;
	
	String Email;
	
	String Password;
<<<<<<< HEAD
	
	public PacienteDTO() {}
	
	public PacienteDTO(String nombre, String apellido) {
		this.Nombre=nombre;
		this.Apellido=apellido;
	}
=======
>>>>>>> fb8fa20e4618bb71a99a9b5146b0213b509df2de

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