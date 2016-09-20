package teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.avansus.model.Itinerario;

public class teste_itinerario {
	public static void main(String[] args){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("STEPU");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		trx.begin();
	
		Itinerario itinerario = new Itinerario();
		itinerario.setViagem(null);
		itinerario.setTipo("I");
		itinerario.setLocal_origem("Av Amazonas 554 Belo Horizante MG");
		itinerario.setLocal_destino("Av Das Nascentes 443 Nepomuceno MG");
		itinerario.setDescricao_origem("Proximo ao Cefet BH Campus II");
		itinerario.setDescricao_destino("Pizzaria Coliseu");
		itinerario.setData_hora_origem(new Date(2016, 9, 20));
		itinerario.setData_hora_destino(new Date(2016, 9, 20));
		
		
		trx.commit();
	}
}
