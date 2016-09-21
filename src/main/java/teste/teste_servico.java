package teste;

import java.math.BigDecimal;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.CategoriaVeiculo;
import br.com.avansus.model.Servico;

public class teste_servico {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Servico servico = new Servico();
		CategoriaVeiculo categoriaVeiculo = new CategoriaVeiculo();
		
		categoriaVeiculo.setNome("Cargo");
		categoriaVeiculo.setDescricao("Comporta cargas de até 5 ton.");
		
		servico.setCategoriaVeiculo(categoriaVeiculo);
		servico.setDiaria(24);
		servico.setFranquia_km(new BigDecimal(250));
		servico.setHora_extra("N");
		servico.setKm_livre("S");
		servico.setPreco_diaria(new BigDecimal(550));
		servico.setPreco_hora_extra(new BigDecimal(45));
		servico.setPreco_km_extra(new BigDecimal(7.50));
		servico.setPreco_km_rodado(new BigDecimal(2.55));
		
		trx.commit();
		manager.close();
	}
}
