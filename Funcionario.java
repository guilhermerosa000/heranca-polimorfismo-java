
package model;


public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getBonificacao();

    public abstract String getCargo();

    public String exibirDados() {

        return "Cargo: " + getCargo()
                + "\nNome: " + nome
                + "\nCPF: " + cpf
                + "\nSalário: " + salario
                + "\nBonificacação: " + getBonificacao();

    }

}
