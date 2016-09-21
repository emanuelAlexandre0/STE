package br.com.avansus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
	
	private String endereco;
	
	private String complemento;
	
	private String cep;
	

	public void setTipo_envolvido(String tipo_envolvido) {
		this.tipo_envolvido = tipo_envolvido;
	}
	
	public String getTipo_envolvido() {
		return tipo_envolvido;
	}

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
	
	public Entidade getEnvolvido() {
		return envolvido;
	}

	public void setEnvolvido(Entidade envolvido) {
		this.envolvido = envolvido;
	}
	
	public Integer getId_endereco() {
		return id_endereco;
	}

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
