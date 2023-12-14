# Atualizando e removendo dados através do JAVA com JDBC
Vamos continuar com a estrutura da aula passada para prosseguimento do conteúdo.

## PARTE 1 - Atualizando dados dados com JDBC.
1. Dentro interface Crud, criaremos o método update
	```java
	public interface Crud<T>{
		public void create(T t);
		public void update(T t);
	}
	```
2. Implemente o método na nossa classe AlunoRepository.
	```java
	public class AlunoRepository implements Crud<Aluno>{

		private Connection conn;

		public void create(Aluno aluno){
			// conteúdo
		}

		public void update(Aluno aluno) {
		}
	}
	```

### Atualizando o aluno com JAVA
```java
	public void update(Aluno aluno){
		String sql = "UPDATE aluno SET nome = ?, idade = ? WHERE id = ?";
		this.conn = Conexao.getConexao();

		 try (
			PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
			pstmt.setString(1, aluno.getNome());
			pstmt.setInt(2, aluno.getIdade());
			pstmt.setInt(3, aluno.getId());

			int resultado = pstmt.executeUpdate();
			if (resultado > 0) {
				System.out.println("Atualização bem-sucedida!");
			} else {
				System.out.println("Erro ao atualizar.");
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
        Aluno alunoAtualizado = new Aluno();

		alunoAtualizado.setId(1);
        alunoAtualizado.setNome("José Silva");
        alunoAtualizado.setIdade(39);

        alunoRepo.update(alunoAtualizado);
    }
```

## PARTE 2 - Deletando dados dados com JDBC.
1. Dentro interface Crud, criaremos o método delete
	```java
	public interface Crud<T>{
		public void create(T t);
		public void update(T t);
		public void delete (int id);
	}
	```
2. Implemente o método na nossa classe AlunoRepository.
	```java
	public class AlunoRepository implements Crud<Aluno>{

		private Connection conn;

		public void create(Aluno aluno){
			// conteúdo
		}

		public void update(Aluno aluno) {
			// conteúdo
		}

		public void delete(int id){

		}
	}
	```

### Deletando o aluno com JAVA
```java
	public void delete(int id){
		String sql = "DELETE FROM aluno WHERE id = " + id;
		this.conn = Conexao.getConexao();

		 try (
			PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

			int resultado = pstmt.executeUpdate();
			if (resultado > 0) {
				System.out.println("Remoção bem-sucedida!");
			} else {
				System.out.println("Erro ao atualizar.");
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

        alunoRepo.delete(1);
    }
```

# Exercicio
1. Replique o que foi visto nessa aula, mas utilizando a tabela **curso**.