 Funcionários da Empresa – Herança e Polimorfismo
## Descrição
Programa que cadastra funcionários de diferentes cargos e calcula
a bonificação de fim de ano de cada um usando polimorfismo.
## Hierarquia de classes
Funcionario (abstract)
├── Programador
├── Estagiario
├── Gerente
└── Diretor
## Como executar
1. Compile o programa
2. Execute a classe ProgramaFuncionario
## Respostas
1. Todo Diretor é um Gerente pois herda da classe Gerente e o mesmo se aplica para Gerente - Funcionario;
2. super() chama o construtor da super classe e o super.getbonificaocao chama o metodo;
3. Ele 'sabe' qual regra usar pela assinatura @Override e é decidido na compilação;
4. Não sera necessario pois todo funcionario novo será um objeto do tipo Funcionario;
5. nao é possivel pois ela serve como um molde para as outras classes;
## Tecnologias
- Java
## Autor
Guilherme Rosa
