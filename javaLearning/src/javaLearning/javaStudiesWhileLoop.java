package javaLearning;
public class javaStudiesWhileLoop {

    public static void main(String[] args) {
        int x = 5; // Iniciamos com o valor de x igual a 5.

        // Agora, enquanto x for maior que 1, faremos o seguinte:
        while (x > 1) {
            x = x - 1; // Diminuímos 1 do valor de x a cada passo.

            // Se o valor de x ficar menor que 3, fazemos isso:
            if (x < 3) {
                System.out.println("while loop done"); // Imprimimos "x pequeno" na tela.
            }
        }
    }
}