# IntroducaoJPA

EntityManager = conexão e acesso a dados

EntityManagerFactory = cria o EntityManager

----------------------------------------------------------------------------------------
				Instanciação

EntityManagerFactory "nomeVariavel" = Persistence.createEntityManagerFactory("unitName")

Em JPA se não for somente leitura no Banco de Dados, é necessário iniciar uma transação.


Para iniciar uma transação no DB:
"Variavel do tipo EntityManager" .getTransaction().begin();

Para finalizar uma transação no DB:
"Variavel do tipo EntityManager" .getTransaction().commit();

----------------------------------------------------------------------------------------
				Busca por Id no DB

Pessoa pReturn = em.find(Pessoa.class, 2);

Tipo nomeDaVariavel = nomeDaVariavelEntityManager .Find(nome do tipo +.class , Id desejado)





