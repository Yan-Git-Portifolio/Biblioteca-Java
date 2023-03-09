import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome da biblioteca: ");
        String nomeBiblioteca = scan.nextLine();
        Biblioteca biblioteca = new Biblioteca(nomeBiblioteca);

        while (true){
            titulo("Bem vindo a "+biblioteca.getNome(), true, true);
            System.out.println("O que deseja fazer? \n Adicionar livros[0] \n Apagar livros[1] \n Ver livros[2] \n Sair [3]");
            Integer opcao = scan.nextInt();
            scan.nextLine();
            if (opcao == 0) {
                try {
                    System.out.println("Digite o nome do livro: ");
                    String nomeLivro = scan.nextLine();

                    System.out.println("Digite o codigo do livro: ");
                    Integer codLivro = scan.nextInt();

                    scan.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autorLivro = scan.nextLine();

                    try {
                        biblioteca.addLivros(new Livro(nomeLivro, codLivro, autorLivro));
                        titulo("Livro Adicionado com sucesso!", true, true);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } catch (Exception e) {
                    System.out.println("Deu erro");
                    System.out.println(e);
                } finally {
                    System.out.println("Finalizando a operação...");
                }

            } else if (opcao == 1){
                System.out.println("código do livro que deseja apagar: ");
                Integer codLivro = scan.nextInt();

                biblioteca.delLivros(codLivro);
            } else if (opcao == 2) {
                biblioteca.getLivros();
            } else {
                break;
            }
        }

    }

    public static void titulo(String frase, Boolean up, Boolean down){
        if (up){
            for (Integer i = 0; i <= frase.length(); ++i){
                System.out.print("-");
            }
        }
        System.out.println("\n"+frase);
        if (down){
            for (Integer i = 0; i <= frase.length(); ++i) {
                System.out.print("-");
            }
        }
        System.out.println("");
    }
}
