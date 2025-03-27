import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();  
        
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = scanner.nextLine();

        System.out.print("Digite o número de páginas do livro: ");
        int numPags = scanner.nextInt();
        
        Livro meuLivro = new Livro(titulo, autor, editora, numPags);
        meuLivro.virarPagina();
        
        System.out.println("\nEstado atual do livro:");
        System.out.println(meuLivro);
        
        scanner.close();
    }
}
