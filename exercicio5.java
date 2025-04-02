import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeros = {10, 20, 30, 40, 50};
    
        System.out.print("Digite um número: ");
        int numeroProcurado = scanner.nextInt();
        
        int posicao = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroProcurado) {
                posicao = i;
                break;
            }
        }
        
   
        if (posicao != -1) {
            System.out.println("Número encontrado na posição: " + posicao);
        } else {
            System.out.println("Número não encontrado no array.");
        }
        
        scanner.close();
    }
}