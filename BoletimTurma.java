
import java.util.Locale;
import java.util.Scanner;

public class BoletimTurma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Quantos alunos tem na turma? ");
        int quantidade = entrada.nextInt();

        double soma = 0;
        double maiorNota = 0;
        int aprovados = 0;

        // TODO 1: Ler e analisar as notas
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = entrada.nextDouble();

            soma += nota;

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota >= 6) {
                aprovados++;
            }
        }

        // TODO 2: Calcular a média
        double media = soma / quantidade;

        // TODO 3: Exibir os resultados
        System.out.println("\n===== RESULTADO DA TURMA =====");
        System.out.println("Média da turma: " + media);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Alunos aprovados: " + aprovados);

        entrada.close();
    }
}
