package quarkus.obraSocial.Entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Medico extends PanacheEntity {

	
	//LE AGREGUE EL ENCAPSULAMIENTO PRIVATE Q NO TENIA
	
	@Column(name="Nombre",nullable=false)
	private String Nombre;

	@Column(name="Apellido",nullable=false)
	private String Apellido;
	
	@Column(name="Email",unique=true,nullable=false)
	private String Email;
	
	@Column(name="Password",unique=true,nullable=false)
	private String Password;
	
	@Column(name="foto",unique=true,nullable=false)
	private String foto;
	
    @Column(name="idEspecialidad", nullable=false)
    private Long idEspecialidad; 
	

	public String getNombre() {
		return this.Nombre;
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
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
    public String getFoto() {
        return foto;
    }

    public Long getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(Long idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
}