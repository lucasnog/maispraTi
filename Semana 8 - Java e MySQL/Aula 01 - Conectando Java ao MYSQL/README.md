# JAVA com Banco de Dados MYSQL
Conectar seu aplicativo Java a um banco de dados MySQL é uma tarefa comum em muitos projetos de desenvolvimento de software. O JDBC (Java Database Connect) é uma API padrão em Java para interagir com bancos de dados relacionais. Nesta aula, vamos aprender a configurar o Java para se conectar a um banco de dados MySQL usando o JDBC.

## O que é JDBC?
JDBC é uma API que permite a execução de operações em bancos de dados relacionais de forma padronizada para qualquer banco de dados que forneça um driver JDBC compatível. Isso inclui consultas SQL, atualizações, inserções e exclusões de registros.

## Driver MySQL JDBC
O driver JDBC do MySQL é uma implementação concreta da interface JDBC fornecida pelo MySQL. Para que o Java se comunique com o MySQL, é necessário esse driver, também conhecido como MySQL Connector/J.

### Baixando o MySQL Connector/J 
[DOWNLOAD - CLIQUE AQUI](https://repo1.maven.org/maven2/mysql/mysql-connector-java/8.0.28/mysql-connector-java-8.0.28.jar)
Após download é preciso adicionar ele no seu projeto (aprenderemos isso na video aula).

## Conectando-se ao MySQL
Para estabelecer uma conexão com o banco de dados MySQL, você precisa obter uma conexão usando a URL do banco de dados, nome de usuário e senha.
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private static final String URL = "jdbc:mysql://localhost:3306/meuBancoDeDados"; //URL de conexão
	private static final String USUARIO = "root"; //Usuario do banco de dados
	private static final String SENHA = ""; // Senha do banco de dados
	
	
	public static Connection getConexao() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return connection;
	}
}
```

### Benefícios do uso de JDBC com MySQL
1. **Padronização:** Usar JDBC permite que você troque de banco de dados com mínimo esforço no código, pois a API é padronizada.
2. **Portabilidade:** O código pode ser executado em qualquer plataforma que suporte a JVM.
3. **Desempenho:** O driver JDBC do MySQL é otimizado para comunicação e desempenho.


# Exercicio
1. Crie um banco de dados chamada: **escola**
2. Crie uma classe no Java chamada Conexão e crie um método estático para obter conexão com essa base de dados criada.
3. Na sua classe principal, teste a conexão