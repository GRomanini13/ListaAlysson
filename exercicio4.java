import java.util.Arrays;

public class exercicio4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array original: " + Arrays.toString(array));
        
        inverterArray(array);
        
        System.out.println("Array invertido: " + Arrays.toString(array));
    }

    public static void inverterArray(int[] array) {
        int inicio = 0;
        int fim = array.length - 1;
        
        while (inicio < fim) {
            // Troca os elementos das extremidades
            int temp = array[inicio];
            array[inicio] = array[fim];
            array[fim] = temp;
            
            inicio++;
            fim--;
        }
    }
}
