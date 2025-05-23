
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    private static String URL = "jdbc:mysql://localhost:3306/hospital_uc12";
    private static String USUARIO = "root";
    private static String SENHA = "lucas@tds2023";

    /*
    Ao chamar este método  getConexao()  em outra classe, como por exemplo em um DAO, é 
    retornado um objeto do tipo Connection que será utilizado para realizar as operações
    de consulta, inserção, atualização ou exclusão de dados no banco de dados.
     */
    public Connection getConexao() throws SQLException {

        Connection c = null;
        try {
            // Estabelecendo uma conexão com o banco de dados através da URL, usuário e senha
            c = DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (SQLException se) {

            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }//fecha catch

        return c;
    }//fecha metodo
}
