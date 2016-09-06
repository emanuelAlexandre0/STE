package br.com.avansus.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String observacao;
	
	@OneToMany
	private TipoVeiculo tipoVeiculo;
	
	@Column(nullable = false, unique = true)
	private String placa;
	
	@Column(nullable = false)
	private String fabricante;
	
	@Column(nullable = false)
	private String modelo;
	
	@OneToMany
	private CategoriaVeiculo categoriaVeiculo;
	
	@Column(nullable = false)
	private int ano_fabricacao;
	
	public Veiculo() {
	
		super();
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
	
	public void setAno_fabricacao(Integer ano_fabricacao) {
		
		this.ano_fabricacao = ano_fabricacao;
	}

	public String getObservacao() {
	
		return observacao;
	}

	public void setObservacao(String observacao) {
		
		this.observacao = observacao;
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
