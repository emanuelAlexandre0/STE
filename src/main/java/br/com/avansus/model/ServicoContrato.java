package br.com.avansus.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="servico_contrato")
public class ServicoContrato implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_contrato")
	private Contrato contrato;
	
	@Column(nullable = false)
	private Integer diaria;
	
	private BigDecimal preco_diaria;
	
	private BigDecimal preco_hora_extra;
	
	private BigDecimal preco_km_extra;
	
	private BigDecimal preco_km_rodado;
	
	private BigDecimal franquia_km;
	
	private String hora_extra;
	
	private String km_livre;
	
	@ManyToOne
	@JoinColumn(name="id_categoria_veiculo")	
	private CategoriaVeiculo categoriaveiulo;
	
	public ServicoContrato() {
	
		
	}

	//===========================================================================
	//=== Get and Set ===========================================================
	//===========================================================================
	
	public Integer getId() {
		return id;
	}
	
	public Contrato getContrato() {
		return contrato;
	}
	
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}
		
	public Integer getDiaria() {
		return diaria;
	}
	
	public void setDiaria(Integer diaria) {
		this.diaria = diaria;
	}
	
	public BigDecimal getPreco_diaria() {
		return preco_diaria;
	}
	
	public void setPreco_diaria(BigDecimal preco_diaria) {
		this.preco_diaria = preco_diaria;
	}
	
	public BigDecimal getPreco_hora_extra() {
		return preco_hora_extra;
	}
	
	public void setPreco_hora_extra(BigDecimal preco_hora_extra) {
		this.preco_hora_extra = preco_hora_extra;
	}
	
	public BigDecimal getPreco_km_extra() {
		return preco_km_extra;
	}
	
	public void setPreco_km_extra(BigDecimal preco_km_extra) {
		this.preco_km_extra = preco_km_extra;
	}
	
	public BigDecimal getPreco_km_rodado() {
		return preco_km_rodado;
	}
	
	public void setPreco_km_rodado(BigDecimal preco_km_rodado) {
		this.preco_km_rodado = preco_km_rodado;
	}
	
	public BigDecimal getFranquia_km() {
		return franquia_km;
	}
	
	public void setFranquia_km(BigDecimal franquia_km) {
		this.franquia_km = franquia_km;
	}
	
	public String getHora_extra() {
		return hora_extra;
	}
	
	public void setHora_extra(String hora_extra) {
		this.hora_extra = hora_extra;
	}
	
	public String getKm_livre() {
		return km_livre;
	}
	
	public void setKm_livre(String km_livre) {
		this.km_livre = km_livre;
	}
	
	public CategoriaVeiculo getCategoriaveiulo() {
		return categoriaveiulo;
	}

	public void setCategoriaveiulo(CategoriaVeiculo categoriaveiulo) {
		this.categoriaveiulo = categoriaveiulo;
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
		ServicoContrato other = (ServicoContrato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
		
}
