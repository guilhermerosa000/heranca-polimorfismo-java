/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aluno
 */
public class Programador extends Funcionario {

    private String linguagem;

    public Programador(String linguagem, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.1;
    }

    @Override
    public String getCargo() {
        return "Programador";
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + "\nLinguagem: " + linguagem;
    }
    
    
    
}
