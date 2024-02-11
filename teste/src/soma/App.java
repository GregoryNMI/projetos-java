package soma;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {



        Scanner sc = new Scanner(System.in);
        Carro objC = new Carro();

        System.out.print("Digite um número: ");
        objC.x = sc.nextInt();

        System.out.print("Digite outro número: ");
        objC.y = sc.nextInt();

        System.out.print("A some desses dois número é igual a: " + (objC.Somas()));
    }
}
