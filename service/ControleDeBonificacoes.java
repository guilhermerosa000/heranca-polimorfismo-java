package service;

import model.Funcionario;


public class ControleDeBonificacoes {

    private double totalDeBonificacoes = 0;

    public void registra(Funcionario f) {
        totalDeBonificacoes += f.getBonificacao();
    }

    public double getBonificacoes() {
        return totalDeBonificacoes;
    }

}
