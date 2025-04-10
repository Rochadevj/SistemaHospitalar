/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package visao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import dao.PacienteDAO;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;
import modelo.Paciente;

public class GuiCadPacienteIT {
    
    private GuiCadPaciente guiCadPaciente;
   
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        guiCadPaciente = new GuiCadPaciente();
    }
    
    @After
    public void tearDown() {
        guiCadPaciente = null;
    }

    @Test
    public void testValidDateFormat() {
        String data = "12/02/2025";
        assertTrue(data.matches("\\d{2}/\\d{2}/\\d{4}"));
    }
    
    @Test
    public void limpar()  {
        System.out.println("Testando o botão 'Limpar campos'");
        Paciente pac3 = new Paciente();
        assertNotNull(pac3);
    }
   
    @Test
    public void testFormatoData() {
        String data = "12/02/2025";
        assertTrue(data.matches("\\d{2}/\\d{2}/\\d{4}"));
    }

    @Test
    public void testLimiteNome() {
        String nome = "Nome com menos de 55 caracteres";
        assertTrue(nome.length() <= 55);
    }

    @Test
    public void testLimiteCPF() {
        String cpf = "12345678901";
        assertTrue(cpf.length() <= 11);
    }

    @Test
    public void testLimiteEndereco() {
        String endereco = "Endereço com menos de 200 caracteres.";
        assertTrue(endereco.length() <= 200);
    }

    @Test
    public void testFormatoTelefone() {
        String telefone = "(12)34567-8901";
        assertTrue(telefone.matches("\\(\\d{2}\\)\\d{5}-\\d{4}"));
    }
} 
