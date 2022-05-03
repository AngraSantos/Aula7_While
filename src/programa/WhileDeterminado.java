package programa;

public class WhileDeterminado {

    public static void main(String[] args) {

        /*System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");
        System.out.println("Bom dia !");*/

        //A sintaxe do WHILE é uma expressão que é obrigtóriamente
        //que recebe uma condição V ou F, senão o WHILE não termina nunca

        int contador = 1;

        while(contador <= 10) {
            System.out.printf("i = %d\n", contador);
        }contador ++;
    }
}
