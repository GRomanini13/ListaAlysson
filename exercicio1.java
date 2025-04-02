import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números que deseja inserir:");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Quantidade inválida. O programa será encerrado.");
            return;
        }
        
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Digite " + n + " números:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            
            if (num > maior) {
                maior = num;
            }
            
            if (num < menor) {
                menor = num;
            }
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        scanner.close();
    }
}
