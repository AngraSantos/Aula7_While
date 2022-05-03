package programa;


import java.util.Scanner;

public class WhileNotaMedia {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    double valorTotal = 0;
    double notaAtual = 0;
    int qtdNota = 0;

    while (qtdNota < 2) {
        System.out.print("Informe a nota: \n");
        notaAtual = input.nextDouble();

        if (notaAtual <= 10.0 && notaAtual >= 0) {
            valorTotal += notaAtual;
            qtdNota++;
        }else if (notaAtual > 10){
            System.out.println("NOTA INCORRETA, DIGITE NOVAMENTE..");
        }
    }
        double media = valorTotal / qtdNota;
        System.out.println("A média é: " + media + "\n");

        if (notaAtual <= 10.0 && notaAtual >= 7.0){
            System.out.println("Você está aprovado!!");
        }
        else if (notaAtual < 7.0 && notaAtual >= 4.5){
            System.out.println("Você está de recuperação!!");
        }
        else if (notaAtual < 4.5 && notaAtual >= 0){
            System.out.println("Você está reprovado!!");
        }
    }
}
