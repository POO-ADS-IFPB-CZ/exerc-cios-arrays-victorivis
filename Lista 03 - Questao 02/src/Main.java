import java.util.Arrays;

public class Main {
    //Termos iniciais, no caso a0=0, a1=1 e a2=1
    static int[] dp = {0, 1, 1};

    //Redimensiona o array e adiciona o número no final
    public static int[] push_back(int[] lista, int numero){
        int ultimaPosicao = lista.length;
        int[] novoArray = Arrays.copyOf(lista, lista.length+1);
        novoArray[ultimaPosicao] = numero;
        return novoArray;
    }

    //Implementação com programação dinâmica
    public static int fib(int posicao){
        if(posicao < dp.length){
            return dp[posicao];
        }

        int numAtual = fib(posicao-1)+fib(posicao-2);
        dp = push_back(dp, numAtual);
        return dp[posicao];
    }

    public static void main(String[] args) {
        int quantidadeDeNumeros = 30;
        fib(quantidadeDeNumeros);
        System.out.printf("Primeiros %d termos da sequência de Fibonnaci:\n", quantidadeDeNumeros);
        for(int i=1; i<dp.length; i++){
            System.out.printf("a%d = %d\n", i, dp[i]);
        }
    }
}