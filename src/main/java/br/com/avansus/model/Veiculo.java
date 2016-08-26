package br.com.avansus.model;

import java.io.Serializable;
import java.util.Date;

public class Veiculo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private TipoVeiculo tipoVeiculo;
	private String placa;
	private String fabricante;
	private String modelo;
	private CategoriaVeiculo categoriaVeiculo;
	private Date ano_fabricacao;
	
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
	
	public Date getAno_fabricacao() {
		return ano_fabricacao;
	}
	
	public void setAno_fabricacao(Date ano_fabricacao) {
		this.ano_fabricacao = ano_fabricacao;
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
		Veiculo other = (Veiculo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
