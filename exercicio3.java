public class exercicio3 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 21, 14, 7, 3, 18, 9, 6};
        int pares = 0, impares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}