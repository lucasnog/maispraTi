# Inserindo dados através do JAVA com JDBC
Esta aula será dividida em 2 partes. Primeira parte vamos focar na criação do banco de dados e na tabela. Enquanto na segunda focaremos na inserção do dado com JAVA.

## PARTE 1 - Criando o banco de dados
1. Criando o banco de dados  **'escola'.**
```sql
CREATE DATABASE escola
```
2. Criando a tabela **'aluno'**.
```sql
CREATE TABLE aluno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    idade INT
);

```

## PARTE 2 - Inserindo dados com JDBC.
1. Sempre que vamos trabalhar com banco de dados, precisamos criar a classe de conexão (contéudo da aula anterior). Na **URL**, altere para apontar para o banco de dados que criamos acima.

2. ### Arquitetura de projeto
	Como nossos projetos ficarão maiores, precisamos melhorar a organização.
	Dentro do pacote **src**, crie mais 2 pacotes: **model** e **repository**.
	* model: onde ficarão nossas entidades que representam a tabela do banco de dados
	* repository: onde ficarão nossas classes que vão fazer a manipulação com o banco de dados.

3. Criando a classe Aluno, dentro do pacote model
	```java
	public class Aluno{
		private int id;
		private String nome;
		private int idade;
	}
	```
4. Criando interface Crud, dentro do pacote repository 
	```java
	public interface Crud<T>{
		public void create(T t);
	}
	```
5. Criando nossa classe AlunoRepository.
	```java
	public class AlunoRepository implements Crud<Aluno>{

		private Connection conn;

		public void create(Aluno aluno){

		}
	}
	```

## Inserindo o aluno com JAVA
```java
	public void create(Aluno aluno){
		String sql = "INSERT INTO aluno (nome, idade) VALUES (?, ?)";
		this.conn = Conexao.getConexao();

		 try (
			PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
			pstmt.setString(1, aluno.getNome());
			pstmt.setInt(2, aluno.getIdade());

			int resultado = pstmt.executeUpdate();
			if (resultado > 0) {
				System.out.println("Inserção bem-sucedida!");
			} else {
				System.out.println("Erro ao inserir.");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
   		}

		this.conn.close();
	}
```

### Na classe principal
```java
	public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();
        
        // Exemplo de criação de um objeto Aluno
        Aluno novoAluno = new Aluno();
        novoAluno.setNome("João da Silva");
        novoAluno.setIdade(20);

        alunoRepo.create(novoAluno);
    }
```


# Exercicio
1. No banco de dados criado no exercício anterior, crie uma tabela **curso**, com as colunas: id, professor e materia
2. Replique o que foi visto nessa aula, mas utilizando a tabela **curso**.