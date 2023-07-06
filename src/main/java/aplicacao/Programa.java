package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
	
	public static void main(String[] args) {
		
		//Id null porque "@GeneratedValue(strategy=GenerationType.IDENTITY)" vai adicionar os valores automaticamente
		Pessoa p1 = new Pessoa(null, "Carlos", "Carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Luis", "Luis@gmail.com");
		Pessoa p3 = new Pessoa(null, "Lucas", "Lucas@gmail.com");
		
		//Criando conexão com o DB
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); //Iniciar uma transação no DB
		em.persist(p1); //Inserir
		em.persist(p2); //Inserir
		em.persist(p3); //Inserir
		em.getTransaction().commit(); //confirmar as alteraões no DB
		
		System.out.println("Dados inseridos");
		
	}

}
