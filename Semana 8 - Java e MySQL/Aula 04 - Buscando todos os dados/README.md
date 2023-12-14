# Buscando dados através do JAVA com JDBC
Vamos continuar com a estrutura da aula passada para prosseguimento do conteúdo.

## PARTE 1 - buscando todos os dados dados com JDBC.
1. Dentro interface Crud, criaremos o método readAll.
	```java
	public interface Crud<T>{
		public void create(T t);
		public void update(T t);
		public void delete (int id);
		public List<T> readAll();
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
			// conteúdo
		}

		public List<Aluno> readAll(){

		}
	}
	```

### Buscando alunos com JAVA
```java
	public List<Aluno> readAll(){
		List<Aluno> alunos = new ArrayList<>();
		String sql = "SELECT * FROM aluno";
		this.conn = Conexao.getConexao();

		 try (
			PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setIdade(rs.getInt("idade"));

				alunos.add(aluno);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
   		}

        Conexao.fecharConexao(this.conn);

		return alunos;
	}
```

### Na classe principal
```java
	public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();
		List<Aluno> todosAlunos = alunoRepo.readAll();
		todosAlunos.foreach(System.out::println);
    }
```

## PARTE 2 - Buscando dado específico com JDBC.
1. Dentro interface Crud, criaremos o método readByid
	```java
	public interface Crud<T>{
		public void create(T t);
		public void update(T t);
		public void delete (int id);
		public List<T> readAll();
		public T readById(int id);
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
			// conteúdo
		}

		public List<Aluno> readAll(){
			// conteuúdo
		}

		public Aluno readById(int id){

		}
	}
	```

### Buscando aluno específico com JAVA
```java
	public Aluno readById(int id){
		String sql = "SELECT * FROM aluno WHERE id = " + id;
		this.conn = Conexao.getConexao();

		 try (
			PreparedStatement pstmt = this.conn.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setIdade(rs.getInt("idade"));
				return aluno;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
   		} finally {
           Conexao.fecharConexao(this.conn);
       	}
		
		return null;
	}
```

### Na classe principal
```java
	public static void main(String[] args) {
        AlunoRepository alunoRepo = new AlunoRepository();

       	Aluno alunoEncontrado = alunoRepo.readById(2);

		System.out.println(alunoEncontrado);
    }
```

# Exercicio
1. Replique o que foi visto nessa aula, mas utilizando a tabela **curso**.