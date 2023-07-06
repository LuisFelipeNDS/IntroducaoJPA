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
		
		Pessoa p = em.find(Pessoa.class, 2); //Busca no DB
		
		em.getTransaction().begin();
		em.remove(p);	// Para remover sempre tem que buscar o objeto
		//e dpois removelo assim o objeto fica monitorado e não destacado
		em.getTransaction().commit();
		
		System.out.println("Feito");
		
		em.clear();
		emf.close();
	}

}
