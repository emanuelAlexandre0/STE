package br.com.avansus.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Column(nullable = false)
	private String razao_social;
	
	@Column(nullable = false)
	private String cnpj;
	
	public Empresa() {
		
	}

	public String getRazao_social() {
	
		return razao_social;
	}
	
	public void setRazao_social(String razao_social) {
	
		this.razao_social = razao_social;
	}
	
	public String getCnpj() {
	
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
	
		this.cnpj = cnpj;
	}

	
	
}
