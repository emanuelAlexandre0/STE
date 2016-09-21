package br.com.avansus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_endereco;
	
	@ManyToOne
	private Entidade envolvido;
	
	private String tipo_envolvido;//E-empresa C-cliente O-colaborador
	
	@NotNull
	private String endereco;
	
	private String complemento;
	
	private String cep;
	
<<<<<<< HEAD
	public Endereco() {
		
		super();
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	public Integer getId_envolvido() {
		
		return id_envolvido;
	}
	
	public void setId_envolvido(Integer id_envolvido) {
		
		this.id_envolvido = id_envolvido;
	}
	
	public Integer getTipo_envolvido() {
		
		return tipo_envolvido;
	}
	
	public void setTipo_envolvido(Integer tipo_envolvido) {
		
		this.tipo_envolvido = tipo_envolvido;
	}
	
=======

	public void setTipo_envolvido(String tipo_envolvido) {
		this.tipo_envolvido = tipo_envolvido;
	}
	
	public String getTipo_envolvido() {
		return tipo_envolvido;
	}

>>>>>>> d70bdd78263e6dce73efe4335ef9c0fd6e467b18
	public String getEndereco() {
		
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		
		this.endereco = endereco;
	}
	
	public String getComplemento() {
		
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		
		this.complemento = complemento;
	}
	
	public String getCep() {
		
		return cep;
	}
	
	public void setCep(String cep) {
		
		this.cep = cep;
	}
	
<<<<<<< HEAD
	//===========================================================================
	//=== Hash Code and Equals ==================================================
	//===========================================================================
	
=======
	public Entidade getEnvolvido() {
		return envolvido;
	}

	public void setEnvolvido(Entidade envolvido) {
		this.envolvido = envolvido;
	}
	
	public Integer getId_endereco() {
		return id_endereco;
	}

>>>>>>> d70bdd78263e6dce73efe4335ef9c0fd6e467b18
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_endereco == null) ? 0 : id_endereco.hashCode());
		result = prime * result + ((tipo_envolvido == null) ? 0 : tipo_envolvido.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Endereco other = (Endereco) obj;
		if (id_endereco == null) {
			if (other.id_endereco != null)
				return false;
		} else if (!id_endereco.equals(other.id_endereco))
			return false;
		
		if (tipo_envolvido == null) {
		
			if (other.tipo_envolvido != null)
			
				return false;
		} else if (!tipo_envolvido.equals(other.tipo_envolvido))
			
			return false;
		
		return true;
	}
		
}
