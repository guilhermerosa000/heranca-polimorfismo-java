package model;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(int senha, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        }

        return false;
    }

    @Override
    public double getBonificacao() {
        return getSalario() * 0.15;
    }

    public String getCargo() {
        return "Gerente";
    }

}
