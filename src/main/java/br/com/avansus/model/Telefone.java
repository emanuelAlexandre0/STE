package br.com.avansus.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id_envolvido;
	
	private Integer tipo_envolvido;
	
	private Integer cod_pais;
	
	private Integer cod_area;
	
	private String numero;
	
	private String nome_contado;
	
	public Telefone() {
		
	}
	public Integer getId_envolvido() {
		return id_envolvido;
	}
	
	public Integer getTipo_envolvido() {
		return tipo_envolvido;
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
		return nome_contado;
	}
	
	public void setNome_contado(String nome_contado) {
		this.nome_contado = nome_contado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_envolvido == null) ? 0 : id_envolvido.hashCode());
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
		if (id_envolvido == null) {
			if (other.id_envolvido != null)
				return false;
		} else if (!id_envolvido.equals(other.id_envolvido))
			return false;
		if (tipo_envolvido == null) {
			if (other.tipo_envolvido != null)
				return false;
		} else if (!tipo_envolvido.equals(other.tipo_envolvido))
			return false;
		return true;
	}
} 
