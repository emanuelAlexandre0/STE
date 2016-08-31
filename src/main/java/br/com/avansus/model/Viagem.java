package br.com.avansus.model;

import java.io.Serializable;

public class Viagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Cliente cliente;
	private String titulo;
	private String descricao;
	private Itinerario itinerario;
	private Contrato contrato;
	private Veiculo veiculo;
	private Colaborador motorista;
	private String tipo;
	
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
