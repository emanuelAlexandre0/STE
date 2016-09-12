package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String razao_social;
	
	private String nome_fantasia;
	
	@Column(nullable = false)
	private String cnpj;
	
	@Column(nullable = false)
	private String email_principal;
	
	private String email_secundario;
	
	private List <Endereco> enderecos;
	
	public Empresa() {
		
	}

	public String getRazao_social() {
	
		return razao_social;
	}
	
	public void setRazao_social(String razao_social) {
	
		this.razao_social = razao_social;
	}
	
	public String getNome_fantasia() {
	
		return nome_fantasia;
	}
	
	public void setNome_fantasia(String nome_fantasia) {
	
		this.nome_fantasia = nome_fantasia;
	}
	
	public String getCnpj() {
	
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
	
		this.cnpj = cnpj;
	}
	
	public String getEmail_principal() {
	
		return email_principal;
	}
	
	public void setEmail_principal(String email_principal) {
	
		this.email_principal = email_principal;
	}
	
	public String getEmail_secundario() {
	
		return email_secundario;
	}
	
	public void setEmail_secundario(String email_secundario) {
	
		this.email_secundario = email_secundario;
	}
	
	public Integer getId() {
	
		return id;
	}
		
	public List<Endereco> getEndereco() {
		return enderecos;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.enderecos = endereco;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
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
		
		Empresa other = (Empresa) obj;
		
		if (id == null) {
		
			if (other.id != null)
			
				return false;
		
		} else if (!id.equals(other.id))
		
			return false;
		
		return true;
	}

}
