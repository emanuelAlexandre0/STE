package teste;


import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.Colaborador;
import br.com.avansus.model.Endereco;
import br.com.avansus.model.Telefone;
import br.com.avansus.model.TipoColaborador;

public class teste_colaborador {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
	
		ArrayList<Endereco> enderecos = new ArrayList<>();
		ArrayList<Telefone> telefones = new ArrayList<>();
		ArrayList<TipoColaborador> tipos_colaboradores = new ArrayList<>(); 
		ArrayList<Colaborador> colaboradores = new ArrayList<Colaborador>();
		
		Endereco endereco = new Endereco();
		endereco.setId_envolvido(2);
		endereco.setTipo_envolvido(1);
		endereco.setEndereco("Rua das Flores, Centro, Lavras MG");
		endereco.setComplemento("Ap 203");
		endereco.setCep("37200-000");
		enderecos.add(endereco);
		
		Telefone telefone = new Telefone();
		telefone.setCod_pais(55);
		telefone.setCod_area(35);
		telefone.setNumero("998774903");
		telefone.setNome_contado("Flavio");
		telefones.add(telefone);
			
		Colaborador colaborador = new Colaborador();
		colaborador.setNome("Flavio Augusto");
		colaborador.setLogin("flavinho");
		colaborador.setSenha("123456");
		colaborador.setEmail_primario("flavinho@gmail.com");
		colaborador.setEmail_secundario("flavioaugusto@hotmail.com");
		colaborador.setEnderecos(enderecos);
		colaborador.setPassaporte("000012.ASD.223");
		colaborador.setTelefones(telefones);
		
		TipoColaborador tipo_colaborador = new TipoColaborador();
		tipo_colaborador.setColaborador(colaboradores);
		
		colaborador.setTipo_colaborador(tipos_colaboradores);
		colaboradores.add(colaborador);
		
		manager.persist(tipo_colaborador);
		manager.persist(colaborador);
		manager.persist(telefones);
		manager.persist(endereco);
		
		trx.commit();
	}
}
