import java.util.Scanner;

public class Main {
    //A declaração de constantes em Java é muito feia
    public static int quantidadeNotas = 10;

    public static float calcularMedia(float[] notasAlunos){
        float media=0;
        for (float notasAluno : notasAlunos) {
            media += notasAluno;
        }
        media /= notasAlunos.length;

        return media;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] notasAlunos = new float[quantidadeNotas];

        System.out.printf("Digite as notas dos %d alunos: ", quantidadeNotas);
        for(int i=0; i<quantidadeNotas; i++){
            notasAlunos[i] = input.nextFloat();
        }

        float media = calcularMedia(notasAlunos);
        int maiorQueMedia=0;
        int menorQueMedia=0;
        for(float i: notasAlunos){
            if(i > media){
                maiorQueMedia++;
            }
            else if(i < media){
                menorQueMedia++;
            }
        }

        System.out.printf("Média das notas: %.2f\n", media);
        System.out.printf("Notas maiores que a media: %d\n", maiorQueMedia);
        System.out.printf("Notas menores que a media: %d\n", menorQueMedia);

    }
}