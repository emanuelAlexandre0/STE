package br.com.avansus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_telefone;
	
	@ManyToOne
	private Entidade envolvido;
	
	private String tipo_envolvido;//E-empresa C-cliente O-colaborador
	
	private Integer cod_pais;
	
	private Integer cod_area;
	
	private String numero;
	
	private String nome_contato;
	
	public Telefone() {
		
	}
	
	public Integer getCod_pais() {
		return cod_pais;
	}
	
	public void setCod_pais(Integer cod_pais) {
		this.cod_pais = cod_pais;
	}
	
	public Integer getCod_area() {
		return cod_area;
	}
	
	public void setCod_area(Integer cod_area) {
		this.cod_area = cod_area;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNome_contado() {
		return nome_contato;
	}
	
	public void setNome_contado(String nome_contado) {
		this.nome_contato = nome_contado;
	}
	
	public Entidade getEnvolvido() {
		return envolvido;
	}

	public void setEnvolvido(Entidade envolvido) {
		this.envolvido = envolvido;
	}

	public String getTipo_envolvido() {
		return tipo_envolvido;
	}

	public void setTipo_envolvido(String tipo_envolvido) {
		this.tipo_envolvido = tipo_envolvido;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public Integer getId_telefone() {
		return id_telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_telefone == null) ? 0 : id_telefone.hashCode());
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
		Telefone other = (Telefone) obj;
		if (id_telefone == null) {
			if (other.id_telefone != null)
				return false;
		} else if (!id_telefone.equals(other.id_telefone))
			return false;
		if (tipo_envolvido == null) {
			if (other.tipo_envolvido != null)
				return false;
		} else if (!tipo_envolvido.equals(other.tipo_envolvido))
			return false;
		return true;
	}
} 
