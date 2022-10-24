import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome, retorno="s";
        double n1=0, n2=0, media=0;

        while (retorno=="s") {
            System.out.println("Digite o seu nome");
            nome = input.next();
            System.out.println("Digite o primeiro e o segundo número");
            n1 = input.nextDouble();
            n2 = input.nextDouble();
            media = (n1+n2)/2;
            System.out.println("Seu nome: " + nome + "\nResultado: " + media);
            System.out.println("Deseja continuar? (s/n)");
            retorno = input.next();

        }



    }
}