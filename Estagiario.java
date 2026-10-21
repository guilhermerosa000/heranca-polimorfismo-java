/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class Estagiario extends Funcionario {

    private String instituicaoDeEnsino;

    public Estagiario(String instituicaoDeEnsino, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.instituicaoDeEnsino = instituicaoDeEnsino;
    }

    @Override
    public double getBonificacao() {
        return 200.00;
    }

    @Override
    public String getCargo() {
        return "Estagiário";
    }
    
    @Override
    public String exibirDados() {
       return super.exibirDados() + "\nInstituição de Ensino: " + instituicaoDeEnsino;
    }

}
