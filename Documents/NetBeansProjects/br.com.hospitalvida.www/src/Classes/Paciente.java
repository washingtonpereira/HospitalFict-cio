/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Washington
 */
public class Paciente {
   public int idPaciente;
    private String nome;
    private String rg;
    private int idade;
    private String endereco;
    private String telefone;
    
    public void Paciente(int idPaciente,String nome, String rg, int idade, String endereco, String telefone){
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}     


