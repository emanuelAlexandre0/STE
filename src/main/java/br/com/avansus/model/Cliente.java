package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String tipo;
	private String razao;

	@Column(nullable = false)
	private String cpfcnpj;
	
	private String status;	

	public Cliente() {
		
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
	
	public String getStatus() {
		
		return status;
	}
	
	public void setStatus(String status) {
	
		this.status = status;
	}

	public Integer getId() {
		return id;
	}
	
}
