package br.com.avansus.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "parada")
public class Parada implements Serializable{

	private static final long serialVersionUID = 1L;

	private Itinerario itinerario;
	private String descricao;
	
	@Id
	@GeneratedValue
	private Integer id;
		
	@Column(nullable = false)
	private String local;
	
	@Column(nullable = false)
	private Date data_hora; 

	public Parada() {
		
		super();
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_itinerario")
	public Itinerario getItinerario() {
		
		return itinerario;
	}

	public String getLocal() {
		
		return local;
	}

	public void setLocal(String local) {
		
		this.local = local;
	}

	public String getDescricao() {
		
		return descricao;
	}

	public void setDescricao(String descricao) {
		
		this.descricao = descricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_hora", nullable = true)
	public Date getData_hora() {
		
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		
		this.data_hora = data_hora;
	}

	public void setItinerario(Itinerario itinerario) {
		
		this.itinerario = itinerario;
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
		Parada other = (Parada) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
