package br.com.avansus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.print.attribute.standard.DateTimeAtCreation;

@Entity
@Table(name = "contrato")
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	private Cliente cliente;
	
	@Column(nullable = false, unique = true)
	private String codigo;
	
	@Temporal(TemporalType.DATE)
	private Date data_assinatura;
	
	@Temporal(TemporalType.DATE)
	private Date data_validade;
	
	private String status;
	
	private Integer tempo_min_solicitacao;
	
	private String dados_adicionais;
	
	@OneToMany
	private List<ServicoContratado> servicoContratados;
	
	@OneToMany
	private List<Viagem> viagens;
	
	@OneToMany
	private List<CategoriaVeiculo> categoriaVeiculos;
	
	public Contrato () {
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Date getData_assinatura() {
		return data_assinatura;
	}
	
	public void setData_assinatura(Date data_assinatura) {
		this.data_assinatura = data_assinatura;
	}
	
	public Date getData_validade() {
		return data_validade;
	}
	
	public void setData_validade(Date data_validade) {
		this.data_validade = data_validade;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getTempo_min_solicitacao() {
		return tempo_min_solicitacao;
	}
	
	public void setTempo_min_solicitacao(Integer tempo_min_solicitacao) {
		this.tempo_min_solicitacao = tempo_min_solicitacao;
	}
	
	public String getDados_adicionais() {
		return dados_adicionais;
	}
	
	public void setDados_adicionais(String dados_adicionais) {
		this.dados_adicionais = dados_adicionais;
	}
	
	public List<ServicoContratado> getServicoContratados() {
		return servicoContratados;
	}

	public void setServicoContratados(List<ServicoContratado> servicoContratado) {
		this.servicoContratados = servicoContratado;
	}

	public List<Viagem> getViagens() {
		return viagens;
	}

	public void setViagens(List<Viagem> viagem) {
		this.viagens = viagens;
	}
		
	public List<CategoriaVeiculo> getCategoriaVeiculos() {
		return categoriaVeiculos;
	}

	public void setCategoriaVeiculos(List<CategoriaVeiculo> categoriaVeiculos) {
		this.categoriaVeiculos = categoriaVeiculos;
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
		Contrato other = (Contrato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
