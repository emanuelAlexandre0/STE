package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TipoColaborador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false, unique = true)
	private String decricao;
	
	//@ManyToOne
	//private List<Colaborador> colaboradores;
		
	public TipoColaborador() {
	
		
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	public Integer getId() {
		
		return id;
	}
	
	public String getDecricao() {
		
		return decricao;
	}
	
	public void setDecricao(String decricao) {
	
		this.decricao = decricao;
	}
	
	/*public List<Colaborador> getColaborador() {
		
		return colaboradores;
	}

	public void setColaborador(List<Colaborador> colaborador) {
		
		this.colaboradores = colaborador;
	}*/
	
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
		TipoColaborador other = (TipoColaborador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
}
