import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static int[] push_back(int[] lista, int numero){
        int ultimaPosicao = lista.length;
        int[] novoArray = Arrays.copyOf(lista, lista.length+1);
        novoArray[ultimaPosicao] = numero;
        return novoArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        int[] myArray = {};
        int total=0;

        System.out.printf("Digite um número menor que 0 para sair: ");
        int num = input.nextInt();
        while(num>=0){
            myArray = push_back(myArray, num);
            total+=num;
            num = input.nextInt();
        }
        int media = myArray.length!=0 ? total/myArray.length : 0;

        System.out.println("Média: " + media);
        System.out.printf("Foram digitados %d números\n", myArray.length);
        System.out.printf("Os números digitados foram: ");
        for(int i: myArray){
            System.out.printf("%d ", i);
        }
    }
}