import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args){
        final int ALUNOS = 5;
        final int PROVAS = 2;
        final int TOTAL_COLUNAS = 3;

        int linha, coluna;
        double mediaDoAluno, mediaDaTurma = 0;

        //1º COLUNA: PROVA 1, 2º COLUNA: PROVA 2, 3º COLUNA: MÉDIA DO ALUNO
        double[][] notas = new double[ALUNOS][TOTAL_COLUNAS];
        Scanner entrada = new Scanner(System.in);

        for (linha = 0; linha < ALUNOS; linha++){
            mediaDoAluno = 0;
            System.out.printf("\nDigite as notas do %do aluno:\n", linha+1);
            for (coluna = 0; coluna < PROVAS; coluna++){
                notas[linha][coluna] = entrada.nextDouble();
                mediaDoAluno += notas[linha][coluna];
                mediaDaTurma += notas[linha][coluna];
            }
            notas[linha][TOTAL_COLUNAS-1] = mediaDoAluno/PROVAS;
        }

        entrada.close();
        mediaDaTurma = mediaDaTurma / (PROVAS * ALUNOS);
        System.out.println("\nNotas e Média");
        System.out.printf("Média da Turma: %2.2f\n", mediaDaTurma);

        for (linha = 0; linha < ALUNOS; linha++){
            System.out.printf("\nAluno %d: ", linha+1);
            for (coluna = 0; coluna < PROVAS; coluna++){
                System.out.printf("%2.2f ", notas[linha][coluna]);
            }

            mediaDoAluno = notas[linha][TOTAL_COLUNAS-1];
            if (mediaDoAluno > mediaDaTurma){
                System.out.printf(" - Média: %2.2f - Acima da média", notas[linha][TOTAL_COLUNAS-1]);
            }
            else{
                System.out.printf(" - Média: %2.2f - Abaixo da média", notas[linha][TOTAL_COLUNAS-1]);
            }
        }
    }
}
