import java.sql.Connection;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Connection conexao = Conexao.getConexao();

        if(Objects.nonNull(conexao)){
            System.out.println("Obteve a conexão com sucesso.");
        }else{
            System.out.println("Erro ao obter conexão.");
        }

    }
}