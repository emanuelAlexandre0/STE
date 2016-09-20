package teste;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.Cliente;
import br.com.avansus.model.Contrato;
import br.com.avansus.model.Endereco;
import br.com.avansus.model.Telefone;
import br.com.avansus.model.Viagem;

public class teste_contrato {
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
		endereco.setId_envolvido(1);
		endereco.setTipo_envolvido(1);
		endereco.setEndereco("Rua dos Guararipes, NS Fatima, Lavras MG");
		endereco.setComplemento("Comercial");
		endereco.setCep("37200-000");
		enderecos.add(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setCod_pais(55);
		telefone.setCod_area(35);
		telefone.setNumero("991231234");
		telefone.setNome_contado("Juliano");
		telefones.add(telefone);
		
		Cliente cliente = new Cliente();
		cliente.setNome("Juliano Alvarez");
		cliente.setTipo("F");
		cliente.setCpfcnpj("938.129.123-03");
		cliente.setRazao("Comercial Juliano");
		cliente.setEmail_principal("juliano@gmail.com");
		cliente.setEmail_secundario("comercial_juliano@gmail.com");
		cliente.setStatus("Ativo");
		cliente.setEnderecos(enderecos);
		cliente.setViagens(viagens);
		cliente.setContratos(contratos);
		
		Contrato contrato = new Contrato();
		contrato.setCliente(cliente);
		contrato.setCodigo("00001");
		contrato.setDados_adicionais("");
		contrato.setData_assinatura(new Date(2016,9,16));
		contrato.setData_validade(new Date(2016, 9, 15));
		contrato.setDados_adicionais("Contrato de teste");
		contrato.setStatus("A");
		contrato.setTempo_min_solicitacao(45);
		contrato.setServicoContratados(null);
		
		manager.persist(enderecos);
		manager.persist(viagens);
		manager.persist(telefones);
		manager.persist(contratos);
		manager.persist(cliente);
		manager.persist(contrato);
				
		
		trx.commit();
	}

}
