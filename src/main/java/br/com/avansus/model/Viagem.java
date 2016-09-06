package br.com.avansus.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Viagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@OneToMany
	private Cliente cliente;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String descricao;
	
	@OneToMany
	private Itinerario itinerario;
	
	@OneToMany
	private Contrato contrato;
	
	@OneToMany
	private Veiculo veiculo;
	
	@OneToMany
	private Colaborador motorista;
	
	@Column(nullable = false)
	private String tipo;
	
	public Viagem() {
		
		super();
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================

	public Cliente getCliente() {
	
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
	
		this.cliente = cliente;
	}
	
	public String getTitulo() {
	
		return titulo;
	}
	
	public void setTitulo(String titulo) {
	
		this.titulo = titulo;
	}
	
	public String getDescricao() {
	
		return descricao;
	}
	
	public void setDescricao(String descricao) {
	
		this.descricao = descricao;
	}

	public Itinerario getItinerario() {
	
		return itinerario;
	}
	
	public void setItinerario(Itinerario itinerario) {
	
		this.itinerario = itinerario;
	}
	
	public Contrato getContrato() {
		
		return contrato;
	}
	
	public void setContrato(Contrato contrato) {
	
		this.contrato = contrato;
	}
	
	public Veiculo getVeiculo() {
	
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Colaborador getMotorista() {
	
		return motorista;
	}
	
	public void setMotorista(Colaborador motorista) {
	
		this.motorista = motorista;
	}
	
	public String getTipo() {
	
		return tipo;
	}
	
	public void setTipo(String tipo) {
	
		this.tipo = tipo;
	}
	
	public Integer getId() {
	
		return id;
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
		Viagem other = (Viagem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		
		return true;
	}
	
	
}
