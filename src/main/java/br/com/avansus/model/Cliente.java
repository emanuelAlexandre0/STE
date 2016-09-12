package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String email_secundario;
	private String tipo;
	private String razao;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String cpfcnpj;
	
	@Column(nullable = false)
	private String email_principal;

	private String status;
	
	@OneToMany	
	private List <Endereco> enderecos;
	
	@OneToMany
	private List <Telefone> telefones;
	
	@OneToMany
	private List <Viagem> viagens;
	
	@OneToMany
	private List <Contrato> contratos;

	
	public Cliente() {
		
	}
	
	public String getNome() {
	
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	}
	
	public String getCpfcnpj() {
		
		return cpfcnpj;
	}
	
	public void setCpfcnpj(String cpfcnpj) {
	
		this.cpfcnpj = cpfcnpj;
	}
	
	public String getRazao() {
	
		return razao;
	}
	
	public void setRazao(String razao) {
	
		this.razao = razao;
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
	
	public String getStatus() {
		
		return status;
	}
	
	public void setStatus(String status) {
	
		this.status = status;
	}
	
	public Integer getId() {
	
		return id;
	}
	
	public List<Endereco> getEnderecos() {
	
		return enderecos;
	}
	
	public void setEnderecos(List<Endereco> enderecos) {
	
		this.enderecos = enderecos;
	}
	
	public List<Telefone> getTelefones() {
	
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones) {
	
		this.telefones = telefones;
	}
	
	public List<Viagem> getViagens() {
	
		return viagens;
	}
	
	public void setViagens(List<Viagem> viagens) {
	
		this.viagens = viagens;
	}
	
	public List<Contrato> getContratos() {
	
		return contratos;
	}
	
	public void setContratos(List<Contrato> contratos) {
	
		this.contratos = contratos;
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
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
