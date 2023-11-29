import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/meuBancoDeDados?createDatabaseIfNotExist=true"; //URL de conexão
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

    public  static  void fechaConexao(Connection conexao){

        try {
            conexao.close();
            conexao = null;

        }catch (SQLException e){
            System.out.println((e.getMessage()));
        }

    }
}