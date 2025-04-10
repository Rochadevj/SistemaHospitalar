/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import modelo.Paciente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PacienteDAOIT {
    
    public PacienteDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test   
    public void pacienteNaoEhNulo() throws Exception{
        System.out.println("Testar se paciente é nulo");
        Paciente pac = new Paciente();
        SimpleDateFormat data = new SimpleDateFormat("dd/mm/yyyy");
        Paciente pac1 = new Paciente(1, "Ana", "Rua dos testes", data.parse("11/02/2025"), "(99)99999-9999", "999.999.999-99", "12345678", "teste@teste.com", 1);
        assertNotNull(pac);
        assertNotNull(pac1);
    }
}
