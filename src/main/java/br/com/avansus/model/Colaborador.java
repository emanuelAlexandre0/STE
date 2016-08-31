package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

public class Colaborador implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	private String email_primario;
	private String email_secundario;
	private String passaporte;
	private List<TipoColaborador> tipos_colaborador;
	private List<Telefone> telefones;
	private List<Endereco> enderecos;
	
	
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getEmail_primario() {
		return email_primario;
	}
	
	public void setEmail_primario(String email_primario) {
		this.email_primario = email_primario;
	}
	
	public String getEmail_secundario() {
		return email_secundario;
	}
	
	public void setEmail_secundario(String email_secundario) {
		this.email_secundario = email_secundario;
	}
	
	public String getPassaporte() {
		return passaporte;
	}
	
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
		
	public List<TipoColaborador> getTipo_colaborador() {
		return tipos_colaborador;
	}

	public void setTipo_colaborador(List<TipoColaborador> tipos_colaborador) {
		this.tipos_colaborador = tipos_colaborador;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
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
		Colaborador other = (Colaborador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
