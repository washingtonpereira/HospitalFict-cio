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
public class Consulta {
    private String data;
    private int idPaciente;
    private int idMedico;
    
    public void Consulta(){
  }
    public String getData(){
        return data;
    }
    void setData(String data){
        this.data = data;
    }
    public int idPaciente(){
        return idPaciente;
    }
    void setIdpPaciente(int idPaciente){
        this.idPaciente = idPaciente;
    }
    public int getIdMedico(){
        return idMedico;
    }
    void setIdMedico(int idMedico){
        this.idMedico = idMedico;
    }
}

