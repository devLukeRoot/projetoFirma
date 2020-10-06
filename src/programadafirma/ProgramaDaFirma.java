package programadafirma;

import java.util.Scanner;

public class ProgramaDaFirma {

    public static void main(String[] args) {   
  
    Funcionario f1 = new Funcionario();
    f1.setNome("Joaquim");
    f1.setSobrenome("alah");
    f1.setSalario(1500.00f);
    f1.setGratificacao(15f);
    Funcionario f2 = new Funcionario();    
    int opcao = 0;
    do {
        System.out.println("\n      =============================================");
        System.out.println("     |     1 – Cadastrar Funcionário                |");
        System.out.println("     |     2 – Mostrar os dados sobre o Funcionário |");
        System.out.println("     |    3 – Sair do Programa                      |");
        System.out.println("      ==============================================\n");

        System.out.print("\n");
        Scanner menu = new Scanner(System.in);
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            f2.setNome(entrada.next());
            System.out.println("Digite o sobrenome: ");
            f2.setSobrenome(entrada.next());
            System.out.println("Digite o salario: ");
            f2.setSalario(entrada.nextFloat());
            System.out.println("Digite a porcentagem da gratificacao: ");
            f2.setGratificacao(entrada.nextFloat());
            f2.mostrarDados();
            break;
        case 2:
            f1.mostrarDados();
            break;
        }
    } while (opcao != 3);
}

    }
    

