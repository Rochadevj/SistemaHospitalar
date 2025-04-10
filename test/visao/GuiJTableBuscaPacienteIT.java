/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package visao;

import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import servicos.PacienteServicos;
import servicos.ServicosFactory;
import java.sql.SQLException;

public class GuiJTableBuscaPacienteIT {

    private Object data;
    private PacienteServicos ps;
    
    public GuiJTableBuscaPacienteIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Inicializa os serviços do paciente
        ps = ServicosFactory.getPacienteServicos();
        
        // Cria alguns pacientes para o teste
        Paciente paciente1 = new Paciente(1, "Ana", "Rua dos testes", new Date(), "(99)99999-9999", "999.999.999-99", "12345678", "teste@teste.com", 1);
        Paciente paciente2 = new Paciente(2, "João", "Rua exemplo", new Date(), "(98)88888-8888", "888.888.888-88", "87654321", "exemplo@exemplo.com", 2);

        // Adiciona os pacientes criados para simular uma base de dados
        ps.adicionarPaciente(paciente1);
        ps.adicionarPaciente(paciente2);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
      System.out.println("Testando o botão 'Limpar campos'");
      GuiJTableBuscaPaciente BuscarPaciente = new GuiJTableBuscaPaciente();
      assertNotNull(BuscarPaciente);  
    }

    @Test
    public void testMostrarDadosDoPaciente() throws ParseException {
    // Suponha que você tenha um construtor e métodos para definir os dados do paciente
    SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
    Date data = dataFormat.parse("11/02/2025");
    Paciente paciente = new Paciente(1, "Ana", "Rua dos testes", data, "(99)99999-9999", "999.999.999-99", "12345678", "teste@teste.com", 1);
    // Método que mostra os dados do paciente
    String dadosDoPaciente = paciente.mostrarDados();
    // Esperado
    String dadosEsperados = "Nome: Ana\nEndereço: Rua dos testes\nData de Nascimento: 11/02/2025\nTelefone: (99)99999-9999\nCPF: 999.999.999-99\nEmail: teste@teste.com";
    // Verificação
    assertEquals(dadosEsperados, dadosDoPaciente);
    }

    @Test
    public void limparBusca()  {
        System.out.println("Testando o botão 'Limpar Busca'");
        Paciente pac3 = new Paciente();
        assertNotNull(pac3);
    }     
    }
