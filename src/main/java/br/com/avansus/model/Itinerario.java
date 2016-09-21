package br.com.avansus.model;

import java.io.Serializable;
import java.util.Date;
<<<<<<< HEAD
=======
import java.util.List;
>>>>>>> d70bdd78263e6dce73efe4335ef9c0fd6e467b18

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "itinerario")
public class Itinerario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	//@ManyToOne
	//private Viagem viagem;

	private String descricao_origem;
	
	private String descricao_destino;
	
	@Column(nullable = false)
	@NotNull
	private String tipo;

	@NotNull
	@Column(nullable = false)
	private String local_origem;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data_hora_origem;
	
	@NotNull
	@Column(nullable = false)
	private String local_destino;
	
	@NotNull
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data_hora_destino;
	
	@OneToMany
	@JoinTable(name="itinerario_parada", 
	joinColumns=@JoinColumn(name="id_itinerario"),
	inverseJoinColumns=@JoinColumn(name="id_parada"))
	private List<Parada> paradas;
	
	public Itinerario() {

	}
	
	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	public Integer getId() {
		
		return id;
	}
		
	/*public Viagem getViagem() {
		
		return viagem;
	}
	
	public void setViagem(Viagem viagem) {
		
		this.viagem = viagem;
	}*/
	
	public String getLocal_origem() {
		
		return local_origem;
	}
	
	public void setLocal_origem(String local_origem) {
		
		this.local_origem = local_origem;
	}
	
	public String getDescricao_origem() {
		
		return descricao_origem;
	}
	
	public void setDescricao_origem(String descricao_origem) {
		
		this.descricao_origem = descricao_origem;
	}
	
	public Date getData_hora_origem() {
		
		return data_hora_origem;
	}
	
	public void setData_hora_origem(Date data_hora_origem) {
		
		this.data_hora_origem = data_hora_origem;
	}
	
	public String getLocal_destino() {
		
		return local_destino;
	}
	
	public void setLocal_destino(String local_destino) {
		
		this.local_destino = local_destino;
	}
	
	public String getDescricao_destino() {
		
		return descricao_destino;
	}
	
	public void setDescricao_destino(String descricao_destino) {
		
		this.descricao_destino = descricao_destino;
	}
	
	public Date getData_hora_destino() {
		
		return data_hora_destino;
	}
	
	public void setData_hora_destino(Date data_hora_destino) {
		
		this.data_hora_destino = data_hora_destino;
	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
	}
	
	public List<Parada> getParadas() {
	
		return paradas;
	}
	
	public void setParadas(List<Parada> paradas) {
		
		this.paradas = paradas;
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
		Itinerario other = (Itinerario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
