package app;

import java.util.Scanner;
import model.Estagiario;
import model.Gerente;
import model.Programador;
import model.Funcionario;
import model.Diretor;
import service.ControleDeBonificacoes;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CADASTRO PROGRAMADOR ===");
        System.out.println("Digite o nome do programador: ");

        String nomeProg = scanner.nextLine();

        System.out.println("Digite o CPF do programador: ");
        String cpfProg = scanner.nextLine();

        System.out.println("\nDigite a linguagem do programador: ");
        String linguagem = scanner.nextLine();

        System.out.println("\nDigite o salário do programador: ");
        double salarioProg = scanner.nextDouble();

        Funcionario programador = new Programador(nomeProg, cpfProg, salarioProg, linguagem);

       

        System.out.println(programador.exibirDados());
        
        
             
        System.out.println("=== CADASTRO ESTÁGIARIO ===");
        System.out.println("Digite o nome do estagiário: ");

        String nomeEstag = scanner.next();

        System.out.println("Digite o CPF do estagiário: ");
        String cpfEstag = scanner.next();

      
        System.out.println("\nDigite o salário do estagiario: ");
        double salarioEstag = scanner.nextDouble();
        
        
         System.out.println("Digite a instituição de ensino: ");

        String instituicao = scanner.next();

        Funcionario estagiario = new Estagiario(nomeEstag,cpfEstag,salarioEstag, instituicao);
        
         System.out.println("=== CADASTRO GERENTE ===");
         
         System.out.println("Digite o nome do gerente: " );
         String nomeGer = scanner.next();
         
         System.out.println("Digite o CPF do gerente: ");
         String cpfGer = scanner.next();
         
         System.out.println("Digite o salário do gerente: ");
         double salarioGer = scanner.nextDouble();
         
         System.out.println("Digite a senha do Gerente: ");
         int senha = scanner.nextInt();
        
         // o metodo autentica nao poderia se chamado pois só existe na classe gerente
         Gerente gerente = new Gerente(nomeGer, cpfGer, salarioGer, senha);
         
         
           System.out.println("=== CADASTRO DIRETOR ===");
           
           System.out.println("Digite o nome do diretor: ");
           String nomeDiretor = scanner.next();
           
              System.out.println("Digite o cpf do diretor: ");
           String cpfDiretor = scanner.next();
           System.out.println("Digite o salario do diretor: ");
           double salarioDiretor = scanner.nextDouble();
           
           System.out.println("Digite a senha do diretor: ");
           int senhaDir = scanner.nextInt();
           
           
           Funcionario diretor = new Diretor(nomeDiretor, cpfDiretor, salarioDiretor, senhaDir);
         
        
        
        

    }

}
