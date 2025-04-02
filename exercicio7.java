public class exercicio7 {

    public static void rotacionar(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        if (k == 0) return; 

       
        inverter(arr, 0, n - 1);

     
        inverter(arr, 0, k - 1);

      
        inverter(arr, k, n - 1);
    }

    private static void inverter(int[] arr, int inicio, int fim) {
        while (inicio < fim) {
            int temp = arr[inicio];
            arr[inicio] = arr[fim];
            arr[fim] = temp;
            inicio++;
            fim--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Array original: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        rotacionar(arr, k);

        System.out.println("Array após rotação de " + k + " posições para a direita: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
