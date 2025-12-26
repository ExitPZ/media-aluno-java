import java.util.Scanner;
import java.util.Locale;
public class MediaAluno {
    public static void main(String[] args) {
                Locale.setDefault(Locale.US);

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite o nome do aluno: ");
                String nome = sc.nextLine();

                System.out.print("Digite a primeira nota: ");
                double nota1 = sc.nextDouble();

                System.out.print("Digite a segunda nota: ");
                double nota2 = sc.nextDouble();

                System.out.print("Digite a terceira nota: ");
                double nota3 = sc.nextDouble();

                double media = (nota1 + nota2 + nota3) / 3;

                String situacao;

                if (media >= 7) {
                    situacao = "Aprovado";
                } else if (media >= 5) {
                    situacao = "Recuperação";
                } else {
                    situacao = "Reprovado";
                }

                System.out.println("\nAluno: " + nome);
                System.out.printf("Média: %.2f%n", media);
                System.out.println("Situação: " + situacao);

                sc.close();
    }
}






