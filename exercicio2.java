public class exercicio2 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50}; 
        
        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        
        double media = soma / numeros.length;
        System.out.println("A média dos elementos do array é: " + media);
    }
}
