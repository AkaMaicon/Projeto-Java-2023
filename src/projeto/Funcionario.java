/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa implements IPessoa {
    private int CPF, salario;
    private String setor;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getCPF() {
        return CPF;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public void exibir() {
        System.out.println("Nome:" + Nome + "Idade:" + Idade + "CPF:" + CPF + "setor:" + setor + "salario:" + salario );
    }
    
}
