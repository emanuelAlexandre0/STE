package br.com.avansus.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "empresa")
public class Empresa extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@NotNull
	@Column(nullable = false)
	private String razao_social;
	
<<<<<<< HEAD
	private String nome_fantasia;
	
	@NotNull
	@Column(nullable = false)
	private String cnpj;
	
	@NotNull
	@Column(nullable = false)
	private String email_principal;
	
	private String email_secundario;
	
	private List <Endereco> enderecos;
	
=======
	@Column(nullable = false)
	private String cnpj;
	
>>>>>>> d70bdd78263e6dce73efe4335ef9c0fd6e467b18
	public Empresa() {
		
	}
	
	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================

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
<<<<<<< HEAD
	
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

	//===========================================================================
	//=== Hash Code and Equals ==================================================
	//===========================================================================
	
	@Override
	public int hashCode() {

		final int prime = 31;
		
		int result = 1;
		
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		
		return result;
	}
=======
>>>>>>> d70bdd78263e6dce73efe4335ef9c0fd6e467b18

	
	
}
