import javax.xml.transform.Source;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> biblioteca = new ArrayList<Livro>();
        biblioteca.add(new Livro("Carlo Collodi", "Pinoquio", 1883));
        biblioteca.add(new Livro("George Orwel", "1984", 1949));
        biblioteca.add(new Livro("Antoine de Saint-Exupéry", "O Pequeno Príncipe", 1943));
        Collections.sort(biblioteca);

        System.out.println("");

        System.out.println("1 - Adicionar Livro");
        System.out.println("2 - Listar todos os livros cadastrados");
        System.out.println("3 - Procurar um livro pelo título");
        System.out.println("4 - Remover um livro pelo título");
        System.out.println("5 - Parar sistema");
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        boolean a = true;
        while(a){
            System.out.println("Escolha sua opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();
            switch(escolha){
                case 1:
                    System.out.println("Digite o nome do Autor:");
                    String autorx = scanner.nextLine();

                    System.out.println("Digite o nome do Livro:");
                    String nomex = scanner.nextLine();

                    System.out.println("Digite o ano de lançamento do livro:");
                    int anox = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.add(new Livro(autorx, nomex, anox));
                    Collections.sort(biblioteca);
                    break;

                case 2:
                    System.out.println(biblioteca);
                    break;

                case 3:
                    System.out.println("Digite o nome do livro");
                    String livrox = scanner.nextLine();
                    boolean encontrado = false;
                    for(Livro livro : biblioteca){
                        if (livro.getNome().equalsIgnoreCase(livrox)) {
                            System.out.println("Livro encontrado: " + livro);
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 4:

                    System.out.println("Digite o nome do livro a ser removido: ");
                    String livroy = scanner.nextLine();

                    boolean removido = biblioteca.removeIf(livro -> livro.getNome().equalsIgnoreCase(livroy));

                    if (removido) {
                        System.out.println("Livro removido com sucesso.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Finalizando");
                    a = false;
                    break;

                default:
                    System.out.println("Opção invalida");

            }
        }


    }
}