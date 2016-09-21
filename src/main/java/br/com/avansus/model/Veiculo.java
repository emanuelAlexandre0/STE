package br.com.avansus.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String observacao;
	
	@ManyToOne
	private TipoVeiculo tipoVeiculo;
	
	@Column(nullable = false, unique = true)
	private String placa;
	
	@Column(nullable = false)
	private String fabricante;
	
	@Column(nullable = false)
	private String modelo;
	
	@ManyToOne
	private CategoriaVeiculo categoriaVeiculo;
	
	@OneToMany
	private List<Viagem> viagens;
	
	@Column(nullable = false)
	private int ano_fabricacao;
	
	public Veiculo() {
	
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	public Integer getId() {
	
		return id;
	}
	
	public TipoVeiculo getTipoVeiculo() {
		
		return tipoVeiculo;
	}
	
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public String getPlaca() {
		
		return placa;
	}
	
	public void setPlaca(String placa) {
		
		this.placa = placa;
	}
	
	public String getFabricante() {
		
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		
		return modelo;
	}
	
	public void setModelo(String modelo) {
		
		this.modelo = modelo;
	}
	
	public CategoriaVeiculo getCategoriaVeiculo() {
		
		return categoriaVeiculo;
	}
	
	public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
		
		this.categoriaVeiculo = categoriaVeiculo;
	}
	
	public Integer getAno_fabricacao() {
		
		return ano_fabricacao;
	}
	
	public void setAno_fabricacao(int ano_fabricacao) {
	
		this.ano_fabricacao = ano_fabricacao;
	}

	public String getObservacao() {
	
		return observacao;
	}

	public void setObservacao(String observacao) {
		
		this.observacao = observacao;
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagem> viagens) {
		this.viagens = viagens;
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
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
