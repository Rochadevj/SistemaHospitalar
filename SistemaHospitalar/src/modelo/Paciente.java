
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente {

    private int idPaciente;
    private String nome;
    private String endereco;
    private Date dataNascimento;
    private String telefone;
    private String cpf;
    private String rg;
    private String email;
    private int convenio;

    public Paciente() {
    }

    public Paciente(int idPaciente, String nome, String endereco, Date dataNascimento, String telefone, String cpf, String rg, String email, int convenio) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.convenio = convenio;
    }

    public String mostrarDados() {
        // Retorne os dados formatados do paciente
        return "Nome: " + this.nome + "\n" +
               "Endereço: " + this.endereco + "\n" +
               "Data de Nascimento: " + new SimpleDateFormat("dd/MM/yyyy").format(this.dataNascimento) + "\n" +
               "Telefone: " + this.telefone + "\n" +
               "CPF: " + this.cpf + "\n" +
               "Email: " + this.email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdConvenio() {
        return convenio;
    }

    public void setIdConvenio(int convenio) {
        this.convenio = convenio;
    }
}
        