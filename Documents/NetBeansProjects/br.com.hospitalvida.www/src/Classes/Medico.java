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
public class Medico {
    public int idMedico;
    private String nomemed;
    private String crm;
    private String especialidade;
    
    public void Medico(int idMedico,String nomemed, String crm, String especialidade){
        this.idMedico = idMedico;
        this.nomemed = nomemed;
        this.crm = crm;
        this.especialidade = especialidade;
        
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }
    
    public String getNomemed(){
        return nomemed;
    }
    void setNomemed(String nomemed){
        this.nomemed = nomemed;
    }
    public String getCrm(){
        return crm;
    }
    void setCrm(String crm){
        this.crm = crm;
    }
    public String getEspecialidade(){
        return especialidade;
        }
    void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
}

