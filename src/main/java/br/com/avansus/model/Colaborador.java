package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "colaborador")
public class Colaborador extends Entidade implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String login;
	
	private String senha;
	
	private String passaporte;
	
	//@OneToMany(mappedBy = "colaborador", cascade = CascadeType.ALL, orphanRemoval = true)
	@ManyToMany
	@JoinTable(name="colaborador_tipo_colaborador", 
	joinColumns=@JoinColumn(name="id_colaborador"),
	inverseJoinColumns=@JoinColumn(name="id_tipocolaborador"))
	private List<TipoColaborador> tipos_colaborador;
	
	@OneToMany
	@JoinTable(name="colaborador_viagem", 
	joinColumns=@JoinColumn(name="id_colaborador"),
	inverseJoinColumns=@JoinColumn(name="id_viagem"))
	private List<Viagem> viagens;
	
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

	public List<TipoColaborador> getTipos_colaborador() {
		return tipos_colaborador;
	}

	public void setTipos_colaborador(List<TipoColaborador> tipos_colaborador) {
		this.tipos_colaborador = tipos_colaborador;
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagem> viagens) {
		this.viagens = viagens;
	}

	public Integer getId() {
		return id;
	}
	
}
