package Teste;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.Empresa;
import br.com.avansus.model.Endereco;

public class teste_empresa {
		
		public static void main(String[] args){
			
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		ArrayList<Endereco> enderecos = new ArrayList<>();
		
		Endereco endereco = new Endereco();
		endereco.setTipo_envolvido("E");
		endereco.setEndereco("Rua dos Ypês, Eldorado, Lavras MG");
		endereco.setComplemento("Casa");
		endereco.setCep("37200-000");
		
		enderecos.add(endereco);
		
		Empresa empresa = new Empresa();
		empresa.setRazao_social("Emanuel Alexandre");
		empresa.setNome("Padaria do Emanuel");
		empresa.setEnderecos(enderecos);
		empresa.setEmail_secundario("emanuel.souzale@gmail.com");
		empresa.setEmail_principal("emanuel.alexandre0@gmail.com");
		empresa.setCnpj("09.122.0001/10");
		
		manager.persist(endereco);
		manager.persist(empresa);
		
		trx.commit();
		manager.close();
	}
}
