import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Ninja> ninjas = new ArrayList<>();
        int posicao = 0;

        boolean continuar = true;

        while (continuar){
            System.out.println("=====================");
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Adicionar um novo ninja");
            System.out.println("2- Listar os ninjas");
            System.out.println("3- Sair");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Ninja ninja = new Ninja();

                    System.out.println("Digite o nome do ninja: ");
                    ninja.setNome(sc.next());
                    sc.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    ninja.setIdade(sc.nextInt());
                    System.out.println("Digite a missao do ninja: ");
                    ninja.setMissao(sc.next());
                    sc.nextLine();
                    System.out.println("Digite a nivel de dificuldade: ");
                    ninja.setNivelDificuldade(sc.next());
                    sc.nextLine();
                    System.out.println("Digite a status: ");
                    ninja.setStatusMissao(sc.next());
                    sc.nextLine();

                    ninjas.add(ninja);
                    System.out.println("Ninja adicionada com sucesso!");
                    break;

                case 2:
                    for (Ninja imprimirNinjas : ninjas){
                        imprimirNinjas.mostrarInformacoes();
                    }

                case 3:
                    System.out.println("Obrigado por usar");
                    continuar = false;
            }
        }



    }
}