package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "viagem")
public class Viagem implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	@Column(nullable = false)
	private String titulo;

	@Column(nullable = false)
	private String descricao;
	
	@OneToMany
	@JoinTable(name="viagem_itinerario", 
	joinColumns=@JoinColumn(name="id_viagem"),
	inverseJoinColumns=@JoinColumn(name="id_itinerario"))
	private List<Itinerario> itinerarios;
	
	@ManyToOne
	@JoinColumn(name="id_contrato")
	private Contrato contrato;
	
	@ManyToOne
	@JoinColumn(name="id_veiculo")
	private Veiculo veiculo;
	
	@ManyToOne
	@JoinColumn(name="id_motorista")
	private Colaborador colaborador;
	
	@Column(nullable = false)
	private String tipo;
	
	public Viagem() {

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

	public List<Itinerario> getItinerarios() {
	
		return itinerarios;
	}
	
	public void setItinerario(List <Itinerario> itinerarios) {
	
		this.itinerarios = itinerarios;
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
	
		return colaborador;
	}
	
	public void setMotorista(Colaborador motorista) {
	
		this.colaborador = motorista;
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
	
	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
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
