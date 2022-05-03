package programa;

import java.util.Scanner;

public class WhileMedia {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int qtdNotas = 0;
        double notaAtual = 0;
        double total = 0;

        while (notaAtual != -1) {
            System.out.println("Informe a nota ou -1 para sair");
            notaAtual = input.nextDouble();

            if (notaAtual <= 10 && notaAtual >= 0) {
                total += notaAtual;
                qtdNotas++;
            }else if (notaAtual != -1){
                System.out.println("Nota inválida !");
            }
        }

        System.out.println(total);
        System.out.println(qtdNotas);

        double media = total / qtdNotas;
        System.out.println("A média é: " + media);
    }
}
