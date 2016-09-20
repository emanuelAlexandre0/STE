package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.CategoriaVeiculo;
import br.com.avansus.model.TipoVeiculo;
import br.com.avansus.model.Veiculo;

public class teste_veiculo {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		Veiculo veiculo = new Veiculo();
		CategoriaVeiculo categoriaVeiculo = new CategoriaVeiculo();
		TipoVeiculo tipoVeiculo = new TipoVeiculo();
		
		categoriaVeiculo.setNome("Cargo");
		categoriaVeiculo.setDescricao("Comporta cargas de até 5 ton.");
		
		tipoVeiculo.setDescricao("Caminhão");
		
		veiculo.setModelo("F-4000");
		veiculo.setAno_fabricacao(1995);
		veiculo.setCategoriaVeiculo(categoriaVeiculo);
		veiculo.setFabricante("Ford");
		veiculo.setObservacao("Veiculo de carga com carroceria.");
		veiculo.setPlaca("XSA-1293");
		veiculo.setTipoVeiculo(tipoVeiculo);
		
		manager.persist(tipoVeiculo);
		manager.persist(categoriaVeiculo);
		manager.persist(veiculo);
		
		trx.commit();
	}
}
