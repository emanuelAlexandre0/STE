package teste;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.Cliente;
import br.com.avansus.model.Contrato;
import br.com.avansus.model.Endereco;
import br.com.avansus.model.Telefone;
import br.com.avansus.model.Viagem;

public class teste_cliente {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
		
		ArrayList<Endereco> enderecos = new ArrayList<>();
		ArrayList<Telefone> telefones = new ArrayList<>();
		ArrayList<Viagem> viagens = new ArrayList<>();
		ArrayList<Contrato> contratos = new ArrayList<>();
		
		Endereco endereco = new Endereco();
		endereco.setTipo_envolvido("C");
		endereco.setEndereco("Rua dos Ypês, Eldorado, Lavras MG");
		endereco.setComplemento("Casa");
		endereco.setCep("37200-000");
		enderecos.add(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setCod_pais(55);
		telefone.setCod_area(35);
		telefone.setNumero("998390936");
		telefone.setNome_contado("Emanuel");
		telefones.add(telefone);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Emanuel Alexandre");
		cliente.setTipo("F");
		cliente.setCpfcnpj("213.221.167-17");
		cliente.setRazao("Emanuel Alexandre");
		cliente.setEmail_principal("emanuel@gmail.com");
		cliente.setEmail_secundario("emanuel.alexandre@gmail.com");
		cliente.setStatus("Ativo");
		cliente.setEnderecos(enderecos);
		
		manager.persist(enderecos);
		manager.persist(viagens);
		manager.persist(telefones);
		manager.persist(contratos);
		manager.persist(cliente);
		
		trx.commit();
		manager.close();
	}
	
}
