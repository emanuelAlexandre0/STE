package br.com.avansus.model;

import java.io.Serializable;

public class Endereco implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id_envolvido;
	private Integer tipo_envolvido;
	private String endereco;
	private String complemento;
	private String cep;
	private Cliente cliente;
	
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
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
		Endereco other = (Endereco) obj;
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
